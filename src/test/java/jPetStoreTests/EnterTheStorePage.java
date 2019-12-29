package jPetStoreTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTheStorePage {

    @FindBy(css = "a[href*='actions']")
    private WebElement enterTheStoreLink;

    private WebDriver webDriver;

    public EnterTheStorePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void clickOnEnterTheStoreLink() {
//        WebElement enterTheStoreLink = webDriver.findElement(By.cssSelector("a[href*='actions']"));
        enterTheStoreLink.click();
    }
}
