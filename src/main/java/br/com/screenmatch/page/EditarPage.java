package br.com.screenmatch.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditarPage {
    private WebDriver driver;

    public EditarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "listar")
    private WebElement btnListar;
    @FindBy(id = "editar")
    private WebElement btnEditar;


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

    public void clicaBtnEditar() {
        btnEditar.click();
    }


    public void clicaBtnListar() {
        btnListar.click();
    }

    public void digitaNomeFilme(String nome) {
        txtNome.sendKeys(nome);
    }

    public void digitaDuracao(String duracao) {
        txtDuracao.sendKeys(duracao);
    }

    public void digitaAno(String ano) {
        txtAno.sendKeys(ano);
    }

    public void digitaGenero(String genero) {
        txtGenero.sendKeys(genero);
    }

    public void clicaCadastrar() {
        btnCadastrar.click();
    }

    public void limparCampos() {
        txtNome.clear();
        txtDuracao.clear();
        txtAno.clear();
        txtGenero.clear();
    }
}
