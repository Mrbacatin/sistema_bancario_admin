package com.unincor.sistema.bancario.admin.model.domain;

import java.time.LocalDate;

public class Gerente extends Pessoa {

    private long idGerente;

    private Agencia agencia;

    public Gerente() {
    }

    public long getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(long idGerente) {
        this.idGerente = idGerente;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Agencia getAgencia() {
        return agencia;
    }

}
