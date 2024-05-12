package com.sistema.barber.barbershop.model.entidades;

import java.time.LocalDateTime;

public class Agendamento {
    private Long id;
    private  Cliente cliente;
    private Usuario usuario;
    private LocalDateTime dth_agendamento;

    public Agendamento() {
    }

    public Agendamento(Long id, Cliente cliente, Usuario usuario, LocalDateTime dth_agendamento) {
        this.id = id;
        this.cliente = cliente;
        this.usuario = usuario;
        this.dth_agendamento = dth_agendamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDth_agendamento() {
        return dth_agendamento;
    }

    public void setDth_agendamento(LocalDateTime dth_agendamento) {
        this.dth_agendamento = dth_agendamento;
    }
    
}
