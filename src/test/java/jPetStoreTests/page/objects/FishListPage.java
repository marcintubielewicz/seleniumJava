package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "tr:nth-child(2) a")
    private WebElement angelFishProductIdLink;

    @FindBy(css = "a[href*='FI-SW-02']")
    private WebElement tigerSharkProductIdLink;

    @FindBy(css = "a[href*='FI-FW-01']")
    private WebElement koiProductIdLink;

    @FindBy(css = "a[href*='FI-FW-01']")
    private WebElement goldfishProductIdLink;

    public FishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelfishProductIdLink() {
        logger.info("clicking on angelFishProductLink");
        angelFishProductIdLink.click();
    }

}
