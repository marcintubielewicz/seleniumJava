package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelFishListPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "a[href*='workingItemId=EST-1']")
    private WebElement largeAngelfishAddToCartButton;

    @FindBy(css = "a[href$='workingItemId=EST-1']")
    private WebElement smallAngelfishAddToCartButton;

    public AngelFishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnLargeAngelfishAddToCartButton() {

        largeAngelfishAddToCartButton.click();
    }

}
