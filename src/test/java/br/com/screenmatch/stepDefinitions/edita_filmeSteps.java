package br.com.screenmatch.stepDefinitions;

import br.com.screenmatch.page.CadastroPage;
import br.com.screenmatch.page.ListarPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static br.com.screenmatch.core.BaseTest.getDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class edita_filmeSteps {

    private ListarPage listarPage = new ListarPage(getDriver());


    @Dado("que estou na lista de filmes e contém o filme {string}")
    public void que_estou_na_lista_de_filmes_e_contém_o_filme(String filmeAntigo) {
        listarPage.estaNaPaginaDeListagem();
    }

    @Quando("atualizo o filme com o nome de {string} para {string}")
    public void atualizo_o_filme_com_o_nome_de_para(String filmeAntigo, String filmeNovo) {

    }

    @Entao("a lista de filme não contém {string} e contém agora {string}")
    public void a_lista_de_filme_não_contém_e_contém_agora(String filmeAntigo, String filmeNovo) {

    }


}
