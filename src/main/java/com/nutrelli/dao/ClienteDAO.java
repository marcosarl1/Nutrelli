package com.nutrelli.dao;

import com.nutrelli.model.Cliente;
import com.nutrelli.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ClienteDAO {

    public Cliente auth (String email, String password) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            TypedQuery<Cliente> query = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.email = :email AND c.senha = :password", Cliente.class);
            query.setParameter("email", email);
            query.setParameter("password", password);
            return query.getSingleResult();
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

    public List<Cliente> getCliente(String filter) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            TypedQuery<Cliente> query = entityManager.createQuery(
                    "SELECT c from Cliente c WHERE (:filter IS NULL OR c.nome LIKE :filter OR c.email LIKE :filter OR c.email LIKE :filter)", Cliente.class);
            query.setParameter("filter", filter.isEmpty() ? null : "%" + filter + "%");
            return query.getResultList();
        } catch (Exception e) {
            return null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
