package jPetStoreTests;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static final BrowserType BROWSER_TYPE = BrowserType.CHROME;
    private static WebDriver webDriver;

    private DriverManager() {

    }

    public static WebDriver getWebDriver() {

        if (webDriver == null) {
//            System.setProperty("webdriver.chrome.driver", "/Users/marcin.tubielewicz/IdeaProjects/seleniumIntro/chromedriver");
//            webDriver = new ChromeDriver();
            webDriver = BrowserFactory.getBrowser(BROWSER_TYPE);
        }
        return webDriver;
    }

    public static void disposeWebDriver() {
        webDriver.close();
        if (!BROWSER_TYPE.equals(BrowserType.FIREFOX)){
            webDriver.quit();
        }
        webDriver = null;
    }

}
