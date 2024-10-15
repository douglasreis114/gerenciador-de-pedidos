package com.atividade5.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String enderecoEmail;
    private String numeroTelefone;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoDeUsuario;

    public Usuario() {
    }

    public Long obterId() {
        return id;
    }

    public void definirId(Long id) {
        this.id = id;
    }

    public String obterNome() {
        return nomeCompleto;
    }

    public void definirNome(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String obterEmail() {
        return enderecoEmail;
    }

    public void definirEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    public String obterTelefone() {
        return numeroTelefone;
    }

    public void definirTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public TipoUsuario obterTipoUsuario() {
        return tipoDeUsuario;
    }

    public void definirTipoUsuario(TipoUsuario
