package com.nutrelli.dao;

import com.nutrelli.model.Pedido;
import com.nutrelli.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class PedidoDAO {

    public List<Pedido> getPedido() {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            String jpql = "SELECT p FROM Pedido p";
            Query query = entityManager.createQuery(jpql, Pedido.class);
            return query.getResultList();
        } catch (Exception e) {
            return  null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
