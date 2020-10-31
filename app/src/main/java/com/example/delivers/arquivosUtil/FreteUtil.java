package com.example.delivers.arquivosUtil;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FreteUtil {

    public static String valorEntrega(int valor) {
        if (valor == 0) {
            return "Entrega grátis!";
        } else {
            String moedaTratada = formataParaBrasileiro(valor);
            return "Entrega grátis acima de " + moedaTratada;
        }
    }



    public static String formataParaBrasileiro(int valor) {
        NumberFormat formatoBrasileito = DecimalFormat.getCurrencyInstance(
                new Locale("pt", "br"));
        return formatoBrasileito.format(valor).replace("R$", "R$ ");
    }
}
