package br.com.screenmatch.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroPage {

    private WebDriver driver;

    private GerenciaFilmes gerenciaFilmes = new GerenciaFilmes();

//    private List<String> filmes = new ArrayList<>();


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


    public String setFilme(String nomeDoFilme, Integer duracao, Integer ano, String genero) {
        txtNome.sendKeys(nomeDoFilme);
        txtDuracao.sendKeys(Integer.toString(duracao));
        txtAno.sendKeys(Integer.toString(ano));
        txtGenero.sendKeys(genero);
        btnCadastrar.click();
        return new String();
    }



    public boolean estaNaPaginaDeCadastro() {
       return driver.getCurrentUrl().endsWith("/filmes/formulario");
    }

    public void cadastraFilme(String nomeDoFilme, Integer duracao, Integer ano, String genero){
        gerenciaFilmes.adicionaFilme(setFilme(nomeDoFilme, duracao, ano, genero));
    }

}

