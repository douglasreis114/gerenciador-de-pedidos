package com.atividade5.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int quantidadeEstoque;
    private float valor;

    public Produto() {
    }

    public Long obterId() {
        return id;
    }

    public void definirId(Long id) {
        this.id = id;
    }

    public String obterNome() {
        return nome;
    }

    public void de
