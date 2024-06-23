package com.nutrelli.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produto_categoria")
public class ProdutoCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        ProdutoCategoria pc = (ProdutoCategoria) obj;
        return this.id == pc.getId();
    }
}
