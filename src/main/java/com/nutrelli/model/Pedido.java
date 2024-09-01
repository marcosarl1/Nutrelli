package com.nutrelli.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(name = "data_pedido")
    private LocalDate dataPedido;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pedido")
    private StatusPedido statusPedido;

    @Column(name = "valor_total")
    private double valorTotal;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pagamento")
    private TipoPagamento tipoPagamento;

    @OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER)
    private List<ProdutoPedido> produtosPedidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public LocalDate getDataPedido() {
        return dataPedido;
    }


    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public Double calcularValorTotal() {
        double valorTotal;
        valorTotal = produtosPedidos.stream().mapToDouble(pp -> pp.getProduto().getPreco() * pp.getQuantidade()).sum();
        return valorTotal;
    }

    public String listaProdutosPedidos() {
        StringBuilder sb = new StringBuilder();
        if (produtosPedidos != null && !produtosPedidos.isEmpty()) {
            for (int i = 0; i < produtosPedidos.size(); i++) {
                ProdutoPedido pp = produtosPedidos.get(i);
                sb.append(pp.getProduto().getNome());
                sb.append(" (").append(pp.getQuantidade()).append(")");

                if (i < produtosPedidos.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }
}
