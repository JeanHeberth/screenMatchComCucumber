package br.com.screenmatch.page;

import br.com.screenmatch.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListarPage extends BasePage {


    public ListarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "excluir")
    private WebElement btnExcluir;

    public void excluiFilme() {
        btnExcluir.click();
    }

    public boolean estaNaPaginaDeFilmes() {
        return this.driver.getCurrentUrl().endsWith("/filmes");
    }


}
