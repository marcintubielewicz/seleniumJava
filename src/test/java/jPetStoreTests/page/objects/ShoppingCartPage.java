package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import jPetStoreTests.WaitForElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "a[href*='newOrderForm']")
    private WebElement proceedToCheckoutButton;

    @FindBy(css = "#Content > ul > li")
    private WebElement warningMessage;

    public ShoppingCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnProceedToCheckoutButton() {
        logger.info("clicking on proceedToCheckoutButton");
        proceedToCheckoutButton.click();
    }

    public boolean isWarningMessageDisplayed() {
        logger.info("verify if warningMessage for unlogged user is displayed");
        WaitForElement.waitUntilElementIsVisible(warningMessage);
        return warningMessage.isDisplayed();
    }
}
