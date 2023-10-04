package br.com.screenmatch.stepDefinitions;

import br.com.screenmatch.page.EditarPage;
import br.com.screenmatch.page.FormularioFilmesPage;
import br.com.screenmatch.page.ListarPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.util.ArrayList;
import java.util.List;

import static br.com.screenmatch.core.BaseTest.getDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EditaFilmeSteps {

    private ListarPage listarPage = new ListarPage(getDriver());

    private FormularioFilmesPage formularioFilmesPage;


    @Dado("que estou na lista de filmes")
    public void que_estou_na_lista_de_filmes() {
        listarPage.estaNaPaginaDeListagem();
    }


    @E("aciono o botao de editar do {string}")
    public void aciono_o_botao_de_editar_do(String filme) {
        formularioFilmesPage = listarPage.selecionarFilmePeloNome(filme);
    }

    @Quando("atualizo o filme para {string}")
    public void atualizo_o_filme_para(String filmeNovo) {
        formularioFilmesPage.digitarNomeFilme(filmeNovo);
        listarPage = formularioFilmesPage.clicarBotaoCadastrar();

    }

    @Entao("o filme {string} deve ser encontrado na lista")
    public void o_filme_deve_ser_encontrado_na_lista(String filmeNovo) {
        listarPage.validarNomeDoFilme(filmeNovo);
    }


}
