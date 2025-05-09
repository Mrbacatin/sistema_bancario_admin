
package com.unincor.sistema.bancario.admin.model.domain;

import java.time.LocalDate;


public abstract class Pessoa {
    
   protected String nome;
   protected String cpf;
   protected LocalDate dataNascimento;
   protected String email;
   protected String telefone;
   protected String senhaHash;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, LocalDate dataNascimento, String email, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.senhaHash = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senhaHash;
    }

    public void setSenha(String senha) {
        this.senhaHash = senha;
    }
    
}
