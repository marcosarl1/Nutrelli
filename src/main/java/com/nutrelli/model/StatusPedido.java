package com.nutrelli.model;

public enum StatusPedido {
    PENDENTE("Pendente"),
    EM_PREPARO("Em preparo"),
    EM_ENTREGA("Em entrega"),
    ENTREGUE("Entregue"),
    FINALIZADO("Finalizado"),
    CANCELADO("Cancelado");

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusPedido fromDescricao(String descricao) {
        for (StatusPedido status : StatusPedido.values()) {
            if (status.descricao.equalsIgnoreCase(descricao)) {
                return status;
            }
        }
        throw new IllegalArgumentException("StatusPedido não encontrado para a descrição: " + descricao);
    }

    @Override
    public String toString() {
        return this.descricao = descricao;
    }
}
