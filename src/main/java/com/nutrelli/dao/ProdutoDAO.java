package com.nutrelli.dao;

import com.nutrelli.model.Produto;
import com.nutrelli.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class ProdutoDAO {

    public void insertProduto(Produto produto) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(produto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public void deleteProduto(int id) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        Produto produto = entityManager.find(Produto.class, id);
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(produto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public void editProduto(Produto produto) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(produto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Produto> getProduto(String filter) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            Query query = entityManager.createQuery(
                    "SELECT p from Produto p WHERE (:filter IS NULL OR p.nome LIKE :filter OR p.categoria.nome LIKE :filter)");
            query.setParameter("filter", filter.isEmpty() ? null : "%" + filter + "%");
            return query.getResultList();
        } catch (Exception e) {
            return null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Produto getProdutoById(int id) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            return entityManager.find(Produto.class, id);
        } catch (Exception e){
            return null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
