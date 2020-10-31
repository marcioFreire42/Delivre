package com.example.delivers;

import java.math.BigDecimal;

public class Parceiro {

    private final String produto;
    private final String imagem;
    private final String horarioDeEntrega;
    private final int valorDeEntrega;


    public Parceiro(String produto, String imagem, String horarioDeEntrega, int valorDeEntrega) {
        this.produto = produto;
        this.imagem = imagem;
        this.horarioDeEntrega = horarioDeEntrega;
        this.valorDeEntrega = valorDeEntrega;
    }

    public String getProduto(){
        return produto;
    }

    public String getImagem(){
        return imagem;
    }

    public String getHorarioDeEntrega(){
        return horarioDeEntrega;
    }

    public int getValorDeEntrega(){
        return valorDeEntrega;
    }


}
