package jPetStoreTests.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    @FindBy(css = "a[href*='newOrderForm']")
    private WebElement proceedToCheckoutButton;

    @FindBy(css = "#Content > ul > li")
    private WebElement warningMessage;

    private WebDriver webDriver;

    public ShoppingCartPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void clickOnProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }

    public boolean isWarningMessageDisplayed(){
        return warningMessage.isDisplayed();
    }
}
