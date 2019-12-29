package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class FirstAutomatedTest {

    private WebDriver webDriver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/marcin.tubielewicz/IdeaProjects/seleniumIntro/chromedriver");
        webDriver = new ChromeDriver();
    }

    @Test
    public void myFirstTest(){
        webDriver.navigate().to("http://google.com.pl");

        webDriver.findElement(By.name("q")).sendKeys("JavaStart");
        webDriver.findElement(By.name("q")).submit();

        String pageTitlec = webDriver.getTitle();

        assertTrue(pageTitlec.contains("JavaStart"));
    }

//    @Test
//    public void mySecondTest(){
//    webDriver.navigate().to("http://www.seleniumhq.org");
//
//    String pageTitle = webDriver.getTitle();
//
//        assertEquals(pageTitle, "SeleniumHQ Browser Automation");
//    }

    @AfterTest
    public void afterTest(){
        webDriver.close();
        webDriver.quit();
    }
}

