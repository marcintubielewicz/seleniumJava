package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(css = "#SidebarContent a[href$='FISH']")
    private WebElement sidebarMenuFishLink;

    @FindBy(css = "#SidebarContent a[href$='DOGS']")
    private WebElement sidebarMenuDogsLink;

    @FindBy(css = "#SidebarContent a[href$='CATS']")
    private WebElement sidebarMenuCatsLink;

    @FindBy(css = "#SidebarContent a[href$='REPTILES']")
    private WebElement sidebarMenuReptilesLink;

    @FindBy(css = "#SidebarContent a[href$='BIRDS']")
    private WebElement sidebarMenuBirdsLink;


    @FindBy(css = "#QuicksLinks a[href$='FISH']")
    private WebElement quickLinksMenuFishLink;

    @FindBy(css = "#QuickLinks a[href$='DOGS']")
    private WebElement quickLinksMenuDogsLink;

    @FindBy(css = "#QuickLinks a[href$='CATS']")
    private WebElement quickLinksMenuCatsLink;

    @FindBy(css = "#QuickLinks a[href$='REPTILES']")
    private WebElement quickLinksMenuReptilesLink;

    @FindBy(css = "#QuickLinks a[href$='BIRDS']")
    private WebElement quickLinksMenuBirdsLink;


    @FindBy(css = "#MainImageContent a[href$='FISH']")
    private WebElement mainImageContentMenuFishLink;

    @FindBy(css = "#QuickLinks a[href$='DOGS']")
    private WebElement mainImageContentMenuDogsLink;

    @FindBy(css = "#QuickLinks a[href$='CATS']")
    private WebElement mainImageContentMenuCatsLink;

    @FindBy(css = "#QuickLinks a[href$='REPTILES']")
    private WebElement mainImageContentMenuReptilesLink;

    @FindBy(css = "#QuickLinks a[href$='BIRDS']")
    private WebElement mainImageContentMenuBirdsLink;

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
