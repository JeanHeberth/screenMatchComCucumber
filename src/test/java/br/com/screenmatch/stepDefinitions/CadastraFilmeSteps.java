package br.com.screenmatch.stepDefinitions;

import br.com.screenmatch.page.CadastroPage;
import br.com.screenmatch.page.ListarPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static br.com.screenmatch.core.BaseTest.getDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CadastraFilmeSteps {

    private CadastroPage cadastroPage = new CadastroPage(getDriver());
    private ListarPage listarPage = new ListarPage(getDriver());



    @Dado("que estou na pagina de cadastrar filme")
    public void que_estou_na_pagina_de_cadastrar_filme() {
       assertTrue(cadastroPage.estaNaPaginaDeCadastro());
    }

    @Quando("cadastro o filme com o nome de {string} duração {int} ano {int} e genero {string}")
    public void cadastro_o_filme_com_o_nome_de_duração_ano_e_genero(String nomeDoFilme, Integer duracao, Integer ano, String genero) {
       cadastroPage.cadastraFilme(nomeDoFilme, duracao, ano, genero);
    }

    @Entao("é redirecionado para a página de filmes")
    public void é_redirecionado_para_a_página_de_filmes() {
        assertTrue(listarPage.estaNaPaginaDeListagem());
    }

}
