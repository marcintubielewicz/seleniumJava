package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SecondAutomatedTest {

    private WebDriver webDriver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/marcin.tubielewicz/IdeaProjects/seleniumIntro/chromedriver");
        webDriver = new ChromeDriver();
    }

    @Test
    public void mySecondTest(){
        webDriver.navigate().to("http://www.seleniumhq.org");

        String pageTitle = webDriver.getTitle();

        assertEquals(pageTitle, "SeleniumHQ Browser Automation");
    }

    @AfterTest
    public void afterTest(){
        webDriver.close();
        webDriver.quit();
    }

}
