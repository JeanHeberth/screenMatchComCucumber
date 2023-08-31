package br.com.screenmatch.stepDefinitions.pageTest;

import br.com.screenmatch.page.GerenciaFilmes;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CadastraFilmeTest {

    private GerenciaFilmes gerenciaFilmes = new GerenciaFilmes();

    @Before
    public void setUp(){
        gerenciaFilmes = new GerenciaFilmes();
    }
    @Test
    public void adicionarFilme(){
        gerenciaFilmes.adicionaFilme("Testes");

    }
}
