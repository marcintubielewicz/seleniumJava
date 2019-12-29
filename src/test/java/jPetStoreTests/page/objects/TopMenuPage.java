package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "a[href*='signonForm']")
    private WebElement signOnLink;

    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnSignInLink() {
        logger.info("clicking on signOnLink");
        signOnLink.click();
    }
}
