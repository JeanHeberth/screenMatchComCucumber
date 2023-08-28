package br.com.screenmatch.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {

    private WebDriver driver;


    public CadastroPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nome")
    private WebElement txtNome;
    @FindBy(id = "duracao")
    private WebElement txtDuracao;
    @FindBy(id = "ano")
    private WebElement txtAno;
    @FindBy(id = "genero")
    private WebElement txtGenero;

    @FindBy(id = "cadastrar")
    private WebElement btnCadastrar;
    @FindBy(id = "novo")
    private WebElement btnNovo;
    @FindBy(id = "listar")
    private WebElement btnListar;

    public CadastroPage(String nomeDoFilme, Integer duracao, Integer ano, String genero) {
    }


    public void clicaNovo() {
        btnNovo.click();
    }

    public void clicaListar() {
        btnListar.click();
    }


    public ListarPage cadastraFilme(String filme, Integer duracao, Integer ano, String genero) {
        txtNome.sendKeys(filme);
        txtDuracao.sendKeys(Integer.toString(duracao));
        txtAno.sendKeys(Integer.toString(ano));
        txtGenero.sendKeys(genero);
        btnCadastrar.click();
        return new ListarPage(driver);
    }

    public void verificaSeOoFilmeEValido() {
        if (txtNome.equals("")) {
            System.out.println("Campo nao pode ser vazio");
        }
    }

}

