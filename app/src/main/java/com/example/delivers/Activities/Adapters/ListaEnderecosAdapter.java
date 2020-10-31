package com.example.delivers.Activities.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.delivers.R;
import com.example.delivers.objetos.Endereco;

import java.util.ArrayList;
import java.util.List;

public class ListaEnderecosAdapter extends BaseAdapter {


    private final List<Endereco> enderecos;
    private Context contexto;

    public ListaEnderecosAdapter(List<Endereco> enderecos, Context contexto) {
        this.contexto = contexto;
        this.enderecos = enderecos;
    }

    @Override
    public int getCount() {
        return enderecos.size();
            // Retorna a quantidade de elementos na List;
    }

    @Override
    public Endereco getItem(int position) {
        return enderecos.get(position);
            // Retorna um elemento pela posição recebida
    }

    @Override
    public long getItemId(int position) {
        return enderecos.get(position).getId();
            // Retorna o ID de um endereço pela posição;
    }

    @Override
            // Cria a view de cada elementos, associa código ao layout, infla;
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(contexto)
                .inflate(R.layout.layout_cardview_meus_enderecos, parent, false);
            // Esse trecho pode ser extraído pra outro método;

        Endereco enderecoAtual = enderecos.get(position);

        TextView titulo = viewCriada.findViewById(R.id.item_card_endereco_nome_do_endereco);
        titulo.setText(enderecoAtual.getNomeDoEndereco());

        TextView enderecoCompleto = viewCriada.findViewById(R.id.item_card_endereco);
        enderecoCompleto.setText(enderecoAtual.toString());

        return viewCriada;
    }

    // Vamos criar métodos que eram usados no ArrayAdapter, que já eram do array e dele também;
    // agora temos que criar esses métodos;

//    public void remove(Empresa empresa) {
//        empresas.remove(empresa);
//        notifyDataSetChanged();
//        // Este último método avisa que houve alterações, avisa ao sistema pra atualizar a tela;
//    }
//
    public void atualiza(List<Endereco> endereco) {
        this.enderecos.clear();
        this.enderecos.addAll(endereco);
        notifyDataSetChanged();
    }
}
