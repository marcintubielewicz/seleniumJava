package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuPage {

    @FindBy(css = "a[href*='signonForm']")
    private WebElement signOnLink;

//    private WebDriver webDriver;

    public TopMenuPage() {
//        this.webDriver = webDriver;
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public void clickOnSignInLink() {
//        WebElement signOnLink = webDriver.findElement(By.cssSelector("a[href*=\"signonForm\"]"));
        signOnLink.click();
    }
}
