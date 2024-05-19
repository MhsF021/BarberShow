package com.sistema.barber.barbershop.model.entidades;

import java.time.LocalDateTime;
import java.util.Objects;

public class Usuario {

    private Long id;
    private String nome;
    private String senha;
    private String usuario;
    private Perfil perfil;
    private boolean estado;
    private LocalDateTime dth_criacao;
    private LocalDateTime last_login;

    public Usuario() {
        this.estado = true;
    }

    public Usuario(Long id, String nome, String senha, String usuario, Perfil perfil, LocalDateTime dth_criacao, LocalDateTime last_login) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.usuario = usuario;
        this.perfil = perfil;
        this.dth_criacao = dth_criacao;
        this.last_login = last_login;
        this.estado = true;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getDth_criacao() {
        return dth_criacao;
    }

    public void setDth_criacao(LocalDateTime dth_criacao) {
        this.dth_criacao = dth_criacao;
    }

    public LocalDateTime getLast_login() {
        return last_login;
    }

    public void setLast_login(LocalDateTime last_login) {
        this.last_login = last_login;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public void reset() {
        this.estado = true;
    }

    public void alterar_estado() {
        this.estado = !this.estado;
    }
}
