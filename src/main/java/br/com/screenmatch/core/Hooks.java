package br.com.screenmatch.core;

import br.com.screenmatch.utils.CaptarConfig;
import br.com.screenmatch.utils.Screenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {

    Properties properties;
    private WebDriver driver;
    private BaseTest baseTest;
    private CaptarConfig captaConfig;

    @Before(order = 0)
    public void captarPropriedades() {
        captaConfig = new CaptarConfig();
        properties = captaConfig.iniciarPropriedades();
    }

    @Before(order = 1)
    public void iniciarNavegador() {
        String navegador = properties.getProperty("browser");
        baseTest = new BaseTest();
        driver = baseTest.inicializacao(navegador);
    }

    @After(order = 0)
    public void fecharNavegador() {
        driver.quit();
    }

    @After(order = 1)
    public void screenShot(Scenario scenario) {
        if (scenario.isFailed()) {
            Screenshot.takeScreenShot(driver);
        }
    }
}
