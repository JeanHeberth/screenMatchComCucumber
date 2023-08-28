package br.com.screenmatch.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    public WebDriver inicializacao(String browser) {
        if (browser.equals("chrome")) {
            WebDriver driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriver driver = new FirefoxDriver();
        } else {
            System.out.println("Informe o nome do navegador corretamente: " + browser);
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:8088/filmes/formulario");
        return driver;
    }
}
