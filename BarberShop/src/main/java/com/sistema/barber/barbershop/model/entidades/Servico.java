package com.sistema.barber.barbershop.model.entidades;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Servico {

    public static int cd_servico;
    public static String nm_servico;
    public static String ds_servico;
    public static BigDecimal preco;
    public static Usuario cd_usuario;
    public static LocalDateTime dt_criacao;

    public Servico() {
    }

    public Servico(int id, String nome, String descricao, BigDecimal preco, Usuario usuario, LocalDateTime dth_criacao) {
        this.cd_servico = cd_servico;
        this.nm_servico = nm_servico;
        this.ds_servico = ds_servico;
        this.preco = preco;
        this.cd_usuario = cd_usuario;
        this.dt_criacao = dt_criacao;
    }

    public int getCdServico() {
        return cd_servico;
    }

    public void setCdServico(int cd_servico) {
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
