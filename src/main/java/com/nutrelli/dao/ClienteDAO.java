package com.nutrelli.dao;

import com.nutrelli.model.Cliente;
import com.nutrelli.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class ClienteDAO {

    public Cliente auth (String email, String password) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            TypedQuery<Cliente> query = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.email = :email AND c.senha = :password", Cliente.class);
            query.setParameter("email", email);
            query.setParameter("password", password);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            return null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public void register(Cliente cliente) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(cliente);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
