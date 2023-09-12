package br.com.screenmatch.stepDefinitions;

import br.com.screenmatch.page.CadastroPage;
import br.com.screenmatch.page.EditarPage;
import br.com.screenmatch.page.GerenciaFilmes;
import br.com.screenmatch.page.ListarPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static br.com.screenmatch.core.BaseTest.getDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class edita_filmeSteps {

    private List<String> nomes = new ArrayList<>();
    private ListarPage listarPage = new ListarPage(getDriver());
    private EditarPage editarPage = new EditarPage(getDriver());


    @Dado("que estou na lista de filmes e contém o filme {string}")
    public void que_estou_na_lista_de_filmes_e_contém_o_filme(String filmeAntigo) {
        listarPage.estaNaPaginaDeListagem();
    }


    @Quando("atualizo o filme com o nome de {string} para {string}")
    public void atualizo_o_filme_com_o_nome_de_para(String filmeAntigo, String filmeNovo) {
        editarPage.atualizaFilme(filmeAntigo, filmeNovo);
    }

    @Entao("o filme {string} deve ser encontrado na lista")
    public void o_filme_deve_ser_encontrado_na_lista(String filmeNovo) {

    }


}
