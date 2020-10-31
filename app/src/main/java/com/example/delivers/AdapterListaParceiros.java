package com.example.delivers;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.delivers.arquivosUtil.FreteUtil;
import com.example.delivers.arquivosUtil.ResourceUtil;

import java.util.List;

public class AdapterListaParceiros extends BaseAdapter {

    private final List<Parceiro> parceiros;
    private Context contexto;

    public AdapterListaParceiros(List<Parceiro> parceiros, Context contexto) {
        this.parceiros = parceiros;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return parceiros.size();
       // Devolve a quantidade de itens da lista
    }

    @Override
    public Object getItem(int position) {
        return parceiros.get(position);
        // Devolve um item da lista
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewCriada  = LayoutInflater.from(contexto)
                .inflate(R.layout.list_view_layout, parent, false);

        Parceiro parceiro = parceiros.get(position);

        TextView nomeProduto = viewCriada.findViewById(R.id.item_card_produto);
        nomeProduto.setText(parceiro.getProduto());

        TextView horarioDeEntrega = viewCriada.findViewById(R.id.item_card_horario_de_entrega);
        horarioDeEntrega.setText(parceiro.getHorarioDeEntrega());

        TextView valorDeEntrega = viewCriada.findViewById(R.id.item_card_valor_entrega);
        String cobrancaEntrega = FreteUtil.valorEntrega(parceiro.getValorDeEntrega());
        valorDeEntrega.setText(cobrancaEntrega);

        ImageView imagem = viewCriada.findViewById(R.id.item_card_imagem);
        Drawable drawableImagemProduto = ResourceUtil.criaDrawable(contexto, parceiro.getImagem());
        imagem.setImageDrawable(drawableImagemProduto);

        return viewCriada;
    }
}
