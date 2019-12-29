package jPetStoreTests.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelFishListPage {

    @FindBy(css = "a[href*='workingItemId=EST-1']")
    private WebElement largeAngelfishAddToCartButton;

    @FindBy(css = "a[href$='workingItemId=EST-1']")
    private WebElement smallAngelfishAddToCartButton;

    private WebDriver webDriver;

    public AngelFishListPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void clickOnLargeAngelfishAddToCartButton(){
        largeAngelfishAddToCartButton.click();
    }

}
