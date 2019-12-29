package jPetStoreTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver webDriver;

    private DriverManager() {

    }

    public static WebDriver getWebDriver() {

        if (webDriver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/marcin.tubielewicz/IdeaProjects/seleniumIntro/chromedriver");
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }

    public static void disposeWebDriver() {
        webDriver.close();
        webDriver.quit();
        webDriver = null;
    }

}
