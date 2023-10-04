package br.com.screenmatch.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static br.com.screenmatch.utils.HeadlessConfig.getChromeOptions;

public class BaseTest{

    WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public WebDriver inicializacao(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            tlDriver.set(new ChromeDriver());
        } else if (browser.equalsIgnoreCase("firefox")) {
            tlDriver.set(new FirefoxDriver());
        } else {
            System.out.println("Informe o nome do navegador corretamente: " + browser);
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().get("http://localhost:8088/filmes");
        return getDriver();
    }



    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

}
