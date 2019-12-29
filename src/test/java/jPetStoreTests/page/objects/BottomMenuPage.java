package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import jPetStoreTests.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BottomMenuPage {

//    private WebDriver webDriver;

    @FindBy(css = "#Banner img[src*='dog'")
    private WebElement bottomBanner;

    public BottomMenuPage(){
//        this.webDriver = webDriver;
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean isBannerAfterValidLoginDisplayed(){
//        boolean isDisplayed = bottomBanner.isDisplayed();
        WaitForElement.waitUntilElementIsVisible(bottomBanner);
        return bottomBanner.isDisplayed();
    }

}
