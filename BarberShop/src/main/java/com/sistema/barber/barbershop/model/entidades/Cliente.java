package com.sistema.barber.barbershop.model.entidades;

public class Cliente {

    public static int cd_cliente;
    public static String nm_cliente;
    public static String nr_fone;
    public static String email;

    public Cliente() {
    }

    public Cliente(int cd_cliente, String nm_cliente, String nr_fone, String email) {
        this.cd_cliente = cd_cliente;
        this.nm_cliente = nm_cliente;
        this.nr_fone = nr_fone;
        this.email = email;
    }

    public int getCdCliente() {
        return cd_cliente;
    }

    public void setCdCliente(int cd_cliente) {
        this.cd_cliente = cd_cliente;
    }

    public String getNmCliente() {
        return nm_cliente;
    }

    public void setNmCliente(String nm_cliente) {
        this.nm_cliente = nm_cliente;
    }

    public String getNrFone() {
        return nr_fone;
    }

    public void setNrFone(String nr_fone) {
        this.nr_fone = nr_fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
