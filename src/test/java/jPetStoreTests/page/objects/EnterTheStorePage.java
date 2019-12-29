package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import jPetStoreTests.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTheStorePage {

    @FindBy(css = "#Content a")
    private WebElement enterTheStoreLink;

    @FindBy(css = "#Content h2")
    private WebElement welcomeMessage;

//    private WebDriver webDriver;

    public EnterTheStorePage() {
//        this.webDriver = webDriver;
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnEnterTheStoreLink() {
//        WebElement enterTheStoreLink = webDriver.findElement(By.cssSelector("a[href*='actions']"));
        WaitForElement.waitUntilElementIsClickable(enterTheStoreLink);
        enterTheStoreLink.click();
    }

    boolean isWelcomeMessageDisplayed() {
        return welcomeMessage.isDisplayed();
    }

}
