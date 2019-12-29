package jPetStoreTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterTheStorePage {

    @FindBy(css = "a[href*='actions']")
    private WebElement enterTheStoreLink;

    private WebDriver webDriver;

    public EnterTheStorePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnEnterTheStoreLink() {
//        WebElement enterTheStoreLink = webDriver.findElement(By.cssSelector("a[href*='actions']"));
        enterTheStoreLink.click();
    }
}
