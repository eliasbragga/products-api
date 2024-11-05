package com.cursodsousa.produtosapi.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao") // colocar o @Colloumn é opcional. Coloque apenas quando a coluna do banco for diferente da propriedade da entidade
    private String descricao;
    @Column(name = "preco")
    private Double preco;

    public Produto() {
    }

    public Produto(String descricao, String id, String nome, Double preco) {
        this.descricao = descricao;
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
