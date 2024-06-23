package com.nutrelli.dao;

import com.nutrelli.model.Produto;
import com.nutrelli.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class ProdutoDAO {

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
}
