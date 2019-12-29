package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    @FindBy(css = "a[href*='newOrderForm']")
    private WebElement proceedToCheckoutButton;

    @FindBy(css = "#Content > ul > li")
    private WebElement warningMessage;

//    private WebDriver webDriver;

    public ShoppingCartPage(){
//        this.webDriver = webDriver;
//        PageFactory.initElements(webDriver,this);
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }

    public boolean isWarningMessageDisplayed(){
        return warningMessage.isDisplayed();
    }
}
