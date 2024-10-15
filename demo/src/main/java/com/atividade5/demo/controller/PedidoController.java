package com.atividade5.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private LocalDateTime data;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    public Pedido() {}

    public Pedido(String descricao, LocalDateTime data, StatusEnum status) {
        this.descricao = descricao;
        this.data = data;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
