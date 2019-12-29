package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import jPetStoreTests.WaitForElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BottomMenuPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Banner img[src*='dog'")
    private WebElement bottomBanner;

    public BottomMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean isBannerAfterValidLoginDisplayed() {
        logger.info("verify if bottomBanner after user logged is enabled");
        WaitForElement.waitUntilElementIsVisible(bottomBanner);
        return bottomBanner.isDisplayed();
    }

}
