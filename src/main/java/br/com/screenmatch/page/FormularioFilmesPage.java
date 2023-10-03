package br.com.screenmatch.page;

import br.com.screenmatch.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormularioFilmesPage extends BasePage {
    public FormularioFilmesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "listar")
    private WebElement btnListar;

    @FindBy(id = "nome")
    private WebElement inputNome;

    @FindBy(id = "duracao")
    private WebElement inputDuracao;

    @FindBy(id = "ano")
    private WebElement inputAno;

    @FindBy(id = "genero")
    private WebElement inputGenero;

    @FindBy(id = "cadastrar")
    private WebElement btnCadastrar;

    public void clicaBtnListar() {
        btnListar.click();
    }

    public void digitarNomeFilme(String nome) {
        inputNome.clear();
        inputNome.sendKeys(nome);
    }

    public void digitaDuracao(String duracao) {
        inputDuracao.sendKeys(duracao);
    }

    public void digitaAno(String ano) {
        inputAno.sendKeys(ano);
    }

    public void digitaGenero(String genero) {
        inputGenero.sendKeys(genero);
    }

    public ListarPage clicarBotaoCadastrar() {
        btnCadastrar.click();
        return new ListarPage(driver);
    }


}
