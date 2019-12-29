package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(css = "#SidebarContent a[href*='FISH']")
    private WebElement sidebarMenuFishLink;

//    @FindBy(css = "a[href*='FI-SW-01']")
//    private WebElement angelFishProductIdLink;
//
//    @FindBy(css = "a[href*='workingItemId=EST-1']")
//    private WebElement largeAngelfishAddToCartButton;
//
//    @FindBy(css = "a[href*='newOrderForm']")
//    private WebElement proceedToCheckoutButton;
//
//    @FindBy(css = "#Content > ul > li")
//    private WebElement warningMessage;
//
//    private WebDriver webDriver;

    public MainPage(){
//        this.webDriver = webDriver;
//        PageFactory.initElements(webDriver,this);
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public void clickOnSidebarMenuFishLink(){
        sidebarMenuFishLink.click();
    }

//    public void clickOnAngelFishProductIdLink(){
//        angelFishProductIdLink.click();
//    }
//
//    public void clickOnLargeAngelfishAddToCartButton(){
//        largeAngelfishAddToCartButton.click();
//    }
//
//    public void clickOnProceedToCheckoutButton(){
//        proceedToCheckoutButton.click();
//    }
//
//    public boolean isWarningMessageDisplayed(){
//        return warningMessage.isDisplayed();
//    }
}
