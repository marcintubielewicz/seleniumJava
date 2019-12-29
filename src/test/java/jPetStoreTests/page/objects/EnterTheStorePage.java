package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import jPetStoreTests.WaitForElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTheStorePage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Content a")
    private WebElement enterTheStoreLink;

    @FindBy(css = "#Content h2")
    private WebElement welcomeMessage;

    public EnterTheStorePage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnEnterTheStoreLink() {
        logger.info("clicking on enterTheStoreLink");
        WaitForElement.waitUntilElementIsClickable(enterTheStoreLink);
        enterTheStoreLink.click();
    }

    boolean isWelcomeMessageDisplayed() {
        logger.info("verify if welcomeMessage is displayed");
        return welcomeMessage.isDisplayed();
    }

}
