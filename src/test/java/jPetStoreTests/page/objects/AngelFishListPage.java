package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelFishListPage {

    @FindBy(css = "a[href*='workingItemId=EST-1']")
    private WebElement largeAngelfishAddToCartButton;

    @FindBy(css = "a[href$='workingItemId=EST-1']")
    private WebElement smallAngelfishAddToCartButton;

//    private WebDriver webDriver;

    public AngelFishListPage(){
//        this.webDriver = webDriver;
//        PageFactory.initElements(webDriver,this);
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnLargeAngelfishAddToCartButton(){
        largeAngelfishAddToCartButton.click();
    }

}
