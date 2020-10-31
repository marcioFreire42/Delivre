package com.example.delivers;

import android.widget.ListView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParceiroDAO {

    public List<Parceiro> lista() {
    List<Parceiro> parceiros = new ArrayList<>(Arrays.asList(
            new Parceiro("Cervejas", "cervejas", "De 10:00 às 23:00", 30),
            new Parceiro("Pizzas", "pizzas", "De 18:00 às 22:00", 20),
            new Parceiro("Gás e água", "gas", "De 07:00 às 19:00", 0),
            new Parceiro("Almoço", "almoco", "De 11:00 às 14:00", 20),
            new Parceiro("Jantar", "jantar", "De 18:00 às 23:00", 30),
            new Parceiro("Acessórios para sua Bike", "bikes", "De 10:00 às 17:00", 30),
            new Parceiro("Hambuguers e cachorro quente", "burguer", "De 18:00 às 22:00", 20),
            new Parceiro("Medicamentos e farmácia", "farmacia", "De 07:00 às 21:00", 40)));

            return parceiros;
    }
}
