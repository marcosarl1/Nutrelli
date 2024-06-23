package com.nutrelli.dao;

import com.nutrelli.model.ProdutoCategoria;
import com.nutrelli.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class ProdutoCategoriaDAO {

    public List<ProdutoCategoria> getProdutoCategoria() {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            Query query = entityManager.createQuery("SELECT pc from ProdutoCategoria pc");
            return query.getResultList();
        } catch (Exception e) {
            return null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
