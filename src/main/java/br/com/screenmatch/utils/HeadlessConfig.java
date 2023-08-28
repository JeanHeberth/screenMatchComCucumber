package br.com.screenmatch.utils;

import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessConfig {

    public static ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");
        return chromeOptions;
    }
}
