package com.nutrelli.model;

import java.time.LocalDate;
import java.util.List;

public class Pedido {

    private int id;
    private Cliente cliente;
    private LocalDate dataPedido;
    private String status;
    private double valorTotal;
    private TipoPagamento tipoPagamento;
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public List<ProdutoPedido> getProdutosPedidos() {
        return produtosPedidos;
    }

    public void setProdutosPedidos(List<ProdutoPedido> produtosPedidos) {
        this.produtosPedidos = produtosPedidos;
    }

    public void calcularValorTotal() {
        double valorTotal = 0;
        for (ProdutoPedido pp : produtosPedidos){
            valorTotal += pp.getProduto().getPreco() * pp.getQuantidade();
        }
        this.valorTotal = valorTotal;
    }
}
