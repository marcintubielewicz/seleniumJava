package jPetStoreTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getBrowser(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "/Users/marcin.tubielewicz/IdeaProjects/seleniumIntro/chromedriver");
                return new ChromeDriver();

            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "/Users/marcin.tubielewicz/IdeaProjects/seleniumIntro/geckodriver");
                return new FirefoxDriver();

//            case IE:
//                System.setProperty("webdriver.ie.driver", "");
//                return new InternetExplorerDriver();

            case SAFARI:
                System.setProperty("webdriver.safari.driver", "Library/Apple/System/Library/CoreServices/SafariSupport.bundle/Contents/MacOS/safaridriver");
                return new SafariDriver();
            default:
                throw new IllegalStateException("Unknown browser type! Please check ypur configuration");
        }
    }
}
