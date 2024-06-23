package com.nutrelli.dao;

import com.nutrelli.model.Pedido;
import com.nutrelli.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class PedidoDAO {

    public List<Pedido> getPedido(String filter) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            Query query = entityManager.createQuery(
                    "SELECT p FROM Pedido p WHERE (:filter IS NULL OR p.cliente.nome LIKE :filter OR p.tipoPagamento.nome LIKE :filter) ORDER BY p.id");
            query.setParameter("filter", filter.isEmpty() ? null : "%" + filter + "%");
            return query.getResultList();
        } catch (Exception e) {
            return  null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public void editPedido(Pedido pedido) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(pedido);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Pedido getPedidoById(int id) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            return entityManager.find(Pedido.class, id);
        } catch (Exception e) {
            return null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
