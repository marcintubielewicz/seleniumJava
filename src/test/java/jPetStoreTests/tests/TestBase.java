package jPetStoreTests.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver webDriver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/marcin.tubielewicz/IdeaProjects/seleniumIntro/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.navigate().to("http://przyklady.javastart.pl/jpetstore/");
    }

    @AfterTest
    public void afterTest(){
        webDriver.close();
        webDriver.quit();
    }
}
