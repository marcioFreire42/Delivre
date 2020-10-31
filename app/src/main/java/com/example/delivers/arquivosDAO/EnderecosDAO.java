package com.example.delivers.arquivosDAO;

import com.example.delivers.objetos.Endereco;

import java.util.ArrayList;
import java.util.List;

public class EnderecosDAO {

    private final static List<Endereco> enderecos = new ArrayList<>();
    private static int geraId = 1;

    public void salvaEndereco(Endereco endereco){
        endereco.setId(geraId);
        enderecos.add(endereco);
        geraId++;
    }

    public void editaEndereco(Endereco endereco){
        Endereco enderecoEncontrado = retornaEnderecoPeloId(endereco);

        if (enderecoEncontrado != null){
            int posicaoEnderecoEncontrada = enderecos.indexOf(enderecoEncontrado);
            // Encontra no Arraylist a posição em que o endereco foi encontrado;

            enderecos.set(posicaoEnderecoEncontrada, endereco);
            // Substitui o elemento da posição pelo novo objeto que foi recebido;
        }

        // A lógica desse método consiste em passar por todo o objeto recebido pelo Arraylist;
        // Comparando os Ids, afim de saber se aquele objeto já está na lista;
        // Se ele for encontrado em seguida pegamos sua posição e substituimos os objetos.
    }

    public List<Endereco> retorna(){
        return new ArrayList<>(enderecos);
    }

    public void remove(Endereco enderecoEscolhido) {
        Endereco enderecoDevolvido = retornaEnderecoPeloId(enderecoEscolhido);

        if (enderecoDevolvido != null){
            enderecos.remove(enderecoDevolvido);
        }
    }

    public Endereco retornaEnderecoPeloId(Endereco endereco){
        Endereco enderecoEncontrado = null;
        for (Endereco e: enderecos) {
            if(e.getId() == endereco.getId()){
                enderecoEncontrado = e;
            }
        }
        return enderecoEncontrado;
    }
}
