package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage {

    @FindBy(css = "tr:nth-child(2) a")
    private WebElement angelFishProductIdLink;

    @FindBy(css = "a[href*='FI-SW-02']")
    private WebElement tigerSharkProductIdLink;

    @FindBy(css = "a[href*='FI-FW-01']")
    private WebElement koiProductIdLink;

    @FindBy(css = "a[href*='FI-FW-01']")
    private WebElement goldfishProductIdLink;

//    private WebDriver webDriver;

    public FishListPage(){
//        this.webDriver = webDriver;
//        PageFactory.initElements(webDriver,this);
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelfishProductIdLink(){
        angelFishProductIdLink.click();
    }

}
