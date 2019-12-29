package jPetStoreTests.tests;

import jPetStoreTests.DriverManager;
import jPetStoreTests.DriverUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

//    public WebDriver webDriver;

    @BeforeTest
    public void beforeTest() {
//        System.setProperty("webdriver.chrome.driver", "/Users/marcin.tubielewicz/IdeaProjects/seleniumIntro/chromedriver");
//        webDriver = new ChromeDriver();
//        webDriver = DriverManager.getWebDriver();
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webDriver.manage().window().maximize();

//        webDriver.navigate().to("http://przyklady.javastart.pl/jpetstore/");
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage("http://przyklady.javastart.pl/jpetstore/");
    }

    @AfterTest
    public void afterTest() {
        DriverManager.disposeWebDriver();
//        webDriver.close();
//        webDriver.quit();
    }
}
