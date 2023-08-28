package br.com.screenmatch.hooks;

import br.com.screenmatch.utils.BaseTest;
import br.com.screenmatch.utils.CaptarConfig;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {

    private WebDriver driver;
    private BaseTest baseTest;
    private CaptarConfig captaConfig;
    Properties properties;

    public void captarPropriedades() {
        captaConfig = new CaptarConfig();
        properties = captaConfig.iniciarPropriedades();
    }
    public void iniciarNavegador(){
        String navegador = properties.getProperty("browser");
        baseTest = new BaseTest();
        driver = baseTest.inicializacao(navegador);
    }
}
