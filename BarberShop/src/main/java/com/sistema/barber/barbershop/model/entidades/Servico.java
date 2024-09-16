package com.sistema.barber.barbershop.model.entidades;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Servico {

    private Long cd_servico;
    private String nm_servico;
    private String ds_servico;
    private BigDecimal preco;
    private Usuario cd_usuario;
    private LocalDateTime dt_criacao;

    public Servico() {
    }

    public Servico(Long id, String nome, String descricao, BigDecimal preco, Usuario usuario, LocalDateTime dth_criacao) {
        this.cd_servico = cd_servico;
        this.nm_servico = nm_servico;
        this.ds_servico = ds_servico;
        this.preco = preco;
        this.cd_usuario = cd_usuario;
        this.dt_criacao = dt_criacao;
    }

    public Long getCdServico() {
        return cd_servico;
    }

    public void setCdServico(Long cd_servico) {
        this.cd_servico = cd_servico;
    }

    public String getDsServico() {
        return ds_servico;
    }

    public void setDsServico(String ds_servico) {
        this.ds_servico = ds_servico;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Usuario getCdUsuario() {
        return cd_usuario;
    }

    public void setCdUsuario(Usuario cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

}
