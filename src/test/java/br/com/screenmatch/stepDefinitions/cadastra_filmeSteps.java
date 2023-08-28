package br.com.screenmatch.stepDefinitions;

import br.com.screenmatch.page.CadastroPage;
import br.com.screenmatch.page.ListarPage;
import br.com.screenmatch.utils.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import static br.com.screenmatch.utils.BaseTest.getDriver;

public class cadastra_filmeSteps {

    private CadastroPage cadastroPage = new CadastroPage(getDriver());
    private ListarPage listarPage;
    @Dado("o filme válido")
    public void o_filme_válido() {
        cadastroPage.verificaSeOoFilmeEValido();
    }

    @Quando("cadastra o filme com o nome de {string} duração {int} ano {int} e genero {string}")
    public void cadastra_o_filme_com_o_nome_de_duração_ano_e_genero(String nomeDoFilme, Integer duracao, Integer ano, String genero) {
        listarPage = cadastroPage.cadastraFilme(nomeDoFilme, duracao, ano, genero);
    }

    @Entao("é redirecionado para a página de filmes")
    public void é_redirecionado_para_a_página_de_filmes() {
        Assert.assertTrue(listarPage.estaNaPaginaDeFilmes());
    }

}
