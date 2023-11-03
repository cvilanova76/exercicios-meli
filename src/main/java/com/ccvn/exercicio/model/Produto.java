package com.ccvn.exercicio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {



    @Id
    @Column(name = "idproduto")
    private Integer id;

    @Column
    private String nome;

    @Column
    private Integer valor;

    public Produto(Integer id, String nome, Integer valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Produto() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
