package br.com.screenmatch.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;
import java.util.List;

public class EditarPage {
    private WebDriver driver;

    private GerenciaFilmes gerenciaFilmes = new GerenciaFilmes();


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

//    public String setFilme(String nomeDoFilme, Integer duracao, Integer ano, String genero) {
//        txtNome.sendKeys(nomeDoFilme);
//        txtDuracao.sendKeys(Integer.toString(duracao));
//        txtAno.sendKeys(Integer.toString(ano));
//        txtGenero.sendKeys(genero);
//        btnCadastrar.click();
//        return new String();
//    }

    public String visualizaLista(String filme) {
        btnListar.click();
        return new String(filme);
    }


    public void contemFilme(String filme) {
        gerenciaFilmes.contemFilme(visualizaLista(filme));
    }

    public boolean estaNaPaginaDeListagemDeFilmes() {
        return driver.getCurrentUrl().endsWith("/filmes");
    }

    public void atualizaFilme(String filmeAntigo, String filmeNovo) {
//        gerenciaFilmes.atualizaFilme(setFilme(filmeAntigo, filmeNovo));
    }


    private String setFilme(String filmeAntigo, String filmeNovo) {
        btnEditar.click();
        txtNome.clear();
        txtNome.sendKeys(filmeNovo);
        btnCadastrar.click();
        return new String();
    }
}
