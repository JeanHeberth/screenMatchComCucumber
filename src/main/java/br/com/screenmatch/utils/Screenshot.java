package br.com.screenmatch.utils;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot {

        public static void takeScreenShot(WebDriver driver) {
            try {
                File screenshotFile = captureScreenshot(driver);
                saveScreenshot(screenshotFile);
            } catch (IOException e) {
                throw new RuntimeException("Não foi possível capturar a tela", e);
            }
        }

        private static File captureScreenshot(WebDriver driver) throws IOException {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        }

        private static void saveScreenshot(File screenshotFile) throws IOException {
            String fileName = generateFileName();
            File destFile = new File(fileName);
            FileUtils.copyFile(screenshotFile, destFile);
        }

        private static String generateFileName() {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HH:mm");
            String path = "src/test/resources/screenshots/";
            return path + "evidencia-" + formatter.format(new Date()) + ".png";
        }



//    public static void takeScreenShot(WebDriver driver) {
//        try {
//            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//             FileUtils.copyFile(screenshotFile, new File(fileNameGenerator()));
//        } catch (IOException e) {
//            throw new RuntimeException("Não foi possível capturar a tela");
//        }
//    }
//
//    private static String fileNameGenerator() {
//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HH:mm");
//        String path = "src/test/resources/screenshots/";
//        return path + "evidencia-" + formatter.format(new Date()) + ".png";
//    }

}
