package br.com.screenmatch.page;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class GerenciaFilmes {

    private List<String> filmes = new ArrayList<>();


    //    public String addFilme(String nomeDoFilme, Integer duracao, Integer ano, String genero) {
//        filmes.add(setFilme(nomeDoFilme, duracao, ano, genero));
//        return new CadastroPage(driver).toString();
//
//    }

    public void adicionaFilme(String filme) {
        filmes.add(filme);
    }

    //    public void atualizaFilme(String filmeAntigo, String filmeNovo) {
//        int index = filmes.indexOf(filmeAntigo);
//        if (index.) {
//            filmes.set(index, filmeNovo);
//        }
    public static void atualizaFilme(List<String> nomes, String filmeAntigo, String filmeNovo) {
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equals(filmeAntigo)) {
                nomes.set(i, filmeNovo);
                break;
            }

        }
    }

    public void removeFilme(String filme) {
        filmes.remove(filme);
    }

    public void contemFilme(String filme) {
        filmes.contains(filme);

    }
}
