package com.nutrelli.dao;

import com.nutrelli.model.Funcionario;
import com.nutrelli.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class FuncionarioDAO {

    public Funcionario auth (String email, String password) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            TypedQuery<Funcionario> query = entityManager.createQuery("SELECT f FROM Funcionario f WHERE f.email = :email AND f.senha = :password", Funcionario.class);
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
}
