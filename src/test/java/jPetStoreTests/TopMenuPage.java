package jPetStoreTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuPage {

    @FindBy(css = "a[href*='signonForm']")
    private WebElement signOnLink;

    private WebDriver webDriver;

    public TopMenuPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void clickOnSignInLink() {
//        WebElement signOnLink = webDriver.findElement(By.cssSelector("a[href*=\"signonForm\"]"));
        signOnLink.click();
    }
}
