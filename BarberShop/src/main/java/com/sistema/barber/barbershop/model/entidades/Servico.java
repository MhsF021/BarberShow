package com.sistema.barber.barbershop.model.entidades;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Servico {
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Usuario usuario;
    private LocalDateTime dth_criacao;

    public Servico() {
    }

    public Servico(Long id, String nome, String descricao, BigDecimal preco, Usuario usuario, LocalDateTime dth_criacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.usuario = usuario;
        this.dth_criacao = dth_criacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDth_criacao() {
        return dth_criacao;
    }

    public void setDth_criacao(LocalDateTime dth_criacao) {
        this.dth_criacao = dth_criacao;
    }
    
    
}
