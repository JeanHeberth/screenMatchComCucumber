package br.com.screenmatch.page;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class GerenciaFilmes {

    private List<String> filmes = new ArrayList<>();

    public void adicionaFilme(String filme) {
        filmes.add(filme);
    }

    public void atualizaFilme(String filmeAntigo) {
        int index = filmes.indexOf(filmeAntigo);
        if (index != -1) {
            filmes.set(index, filmeAntigo);
        }
        else{
            throw new RuntimeException("Filme não encontrado: " + filmeAntigo);
        }

    }

    public void removeFilme(String filme) {
        filmes.remove(filme);
    }

    public void contemFilme(String filme) {
        filmes.contains(filme);

    }

}
