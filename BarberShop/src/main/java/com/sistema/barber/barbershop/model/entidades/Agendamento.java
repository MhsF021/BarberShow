package com.sistema.barber.barbershop.model.entidades;

import java.time.LocalDateTime;

public class Agendamento {

    public static int cd_agendamento;
    public static Cliente cd_cliente;
    public static Usuario cd_usuario;
    public static LocalDateTime dt_agendamento;

    public Agendamento() {
    }

    public Agendamento(int cd_agendamento, Cliente cd_cliente, Usuario cd_usuario, LocalDateTime dt_agendamento) {
        this.cd_agendamento = cd_agendamento;
        this.cd_cliente = cd_cliente;
        this.cd_usuario = cd_usuario;
        this.dt_agendamento = dt_agendamento;
    }

    public int getCdAgendamento() {
        return cd_agendamento;
    }

    public void setCdAgendamento(int cd_agendamento) {
        this.cd_agendamento = cd_agendamento;
    }

    public Cliente getCdCliente() {
        return cd_cliente;
    }

    public void setCdCliente(Cliente cd_cliente) {
        this.cd_cliente = cd_cliente;
    }

    public Usuario getCdUsuario() {
        return cd_usuario;
    }

    public void setCdUsuario(Usuario cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    public LocalDateTime getDtAgendamento() {
        return dt_agendamento;
    }

    public void setDtAgendamento(LocalDateTime dt_agendamento) {
        this.dt_agendamento = dt_agendamento;
    }

}
