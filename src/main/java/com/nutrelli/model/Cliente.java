package com.nutrelli.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String endereco;
    private String senha;
    @Column(name = "data_criacao", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dataCriacao;

    public Cliente(String nome, String email, String telefone, String cpf, String endereco, String senha, LocalDateTime dataCriacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.senha = senha;
        this.dataCriacao = dataCriacao;
    }

    public Cliente(){}

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

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
}
