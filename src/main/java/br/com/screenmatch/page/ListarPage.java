package br.com.screenmatch.page;

import br.com.screenmatch.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ListarPage {

    private WebDriver driver;

    public ListarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "editar")
    private WebElement btnEditar;


    public boolean estaNaPaginaDeListagem() {
        boolean isOnListPage = this.driver.getCurrentUrl().endsWith("/filmes");
        if (!isOnListPage) {
            throw new AssertionError("Não está na página de listagem de filmes. ");
        }
        return isOnListPage;
    }


    public FormularioFilmesPage selecionarFilmePeloNome(String nomeDoFilme) {
        List<WebElement> listaFilmes = driver.findElements(By.cssSelector("#nome-filme"));

        for (WebElement filme : listaFilmes) {
            String nomeFilme = filme.getText();

            if (nomeDoFilme.equals(nomeFilme)) {
                WebElement botaoEditar = filme.findElement(By.xpath("./following-sibling::td/a[@id='editar']"));

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.elementToBeClickable(botaoEditar));

                botaoEditar.click();
                return new FormularioFilmesPage(driver);
            }
        }
        System.out.println(nomeDoFilme);
        return null;
    }

    public String validarNomeDoFilme(String filme){
        System.out.println(filme);
        return filme;
    }
}
