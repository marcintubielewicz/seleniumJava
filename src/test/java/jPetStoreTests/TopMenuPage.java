package jPetStoreTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuPage {

    @FindBy(css = "a[href*='signonForm']")
    private WebElement signOnLink;
//
    private WebDriver webDriver;

    public TopMenuPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnSignInLink() {
//        WebElement signOnLink = webDriver.findElement(By.cssSelector("a[href*=\"signonForm\"]"));
        signOnLink.click();
    }
}
