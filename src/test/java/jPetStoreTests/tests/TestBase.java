package jPetStoreTests.tests;

import jPetStoreTests.DriverManager;
import jPetStoreTests.DriverUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    @BeforeTest
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage("http://przyklady.javastart.pl/jpetstore/");
    }

    @AfterTest
    public void afterTest() {
        DriverManager.disposeWebDriver();
    }
}
