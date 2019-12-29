package jPetStoreTests.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage {

    @FindBy(css = "a[href*='FI-SW-01']")
    private WebElement angelFishProductIdLink;

    @FindBy(css = "a[href*='FI-SW-02']")
    private WebElement tigerSharkProductIdLink;

    @FindBy(css = "a[href*='FI-FW-01']")
    private WebElement koiProductIdLink;

    @FindBy(css = "a[href*='FI-FW-01']")
    private WebElement goldfishProductIdLink;

    private WebDriver webDriver;

    public FishListPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void clickOnAngelfishProductIdLink(){
        angelFishProductIdLink.click();
    }

}
