package jPetStoreTests.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BottomMenuPage {

    private WebDriver webDriver;

    @FindBy(css = "#Banner img[src*='dog'")
    private WebElement bottomBanner;

    public BottomMenuPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public boolean isBannerAfterValidLoginDisplayed(){
//        boolean isDisplayed = bottomBanner.isDisplayed();
        return bottomBanner.isDisplayed();
    }

}
