package com.sistema.barber.barbershop.model.entidades;

import java.time.LocalDateTime;
import java.util.Objects;

public class Usuario {

    public static int cd_usuario;
    public static String nm_usuario;
    public static String senha;
    public static Perfil perfil;
    public static boolean estado;
    public static LocalDateTime dth_criacao;
    public static LocalDateTime last_login;

    public Usuario() {
        this.estado = true;
    }

    public Usuario(int cd_usuario, String nm_usuario, String senha, Perfil perfil, LocalDateTime last_login) {
        this.cd_usuario = cd_usuario;
        this.nm_usuario = nm_usuario;
        this.senha = senha;
        this.perfil = perfil;
        this.last_login = last_login;
        this.estado = true;
    }

    public int getCdUsuario() {
        return cd_usuario;
    }

    public void setCdUsuario(int cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    public String getNmUsuario() {
        return nm_usuario;
    }

    public void setNmUsuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getLastLogin() {
        return last_login;
    }

    public void setLastLogin(LocalDateTime last_login) {
        this.last_login = last_login;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cd_usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cd_usuario, other.cd_usuario)) {
            return false;
        }
        return true;
    }

    public void reset() {
        this.estado = true;
    }

    public void alteraEstado() {
        this.estado = !this.estado;
    }
}
