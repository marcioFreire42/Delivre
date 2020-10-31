package com.example.delivers.objetos;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Endereco {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nomeDoEndereco;
    private String nomeRua;
    private String nomeBairro;
    private String numero;
    private String complemento;
    private String descricao;

    @Ignore
    public Endereco(String nomeDoEndereco, String nomeRua, String nomeBairro, String numero, String complemento, String descricao) {
        this.nomeDoEndereco = nomeDoEndereco;
        this.nomeRua = nomeRua;
        this.nomeBairro = nomeBairro;
        this.numero = numero;
        this.complemento = complemento;
        this.descricao = descricao;
    }

    public Endereco() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoEndereco() {
        return nomeDoEndereco;
    }

    public void setNomeDoEndereco(String nomeDoEndereco) {
        this.nomeDoEndereco = nomeDoEndereco;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return "Rua: " + getNomeRua() + ", N° " + getNumero() + ", Bairro " + getNomeBairro();
    }
}

