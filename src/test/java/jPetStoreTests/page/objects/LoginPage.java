package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import jPetStoreTests.WaitForElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(name = "username")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(name = "signon")
    private WebElement loginButton;

    @FindBy(css = "#Content ul[class='messages'] > li")
    private WebElement warningMessageText;

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void typeInToUsernameField(String username) {
        logger.info("typing username into usernameInputField");
        WaitForElement.waitUntilElementIsVisible(usernameInputField);
        usernameInputField.clear();
        usernameInputField.sendKeys(username);
    }

    public void typeInToPasswordField(String password) {
        logger.info("typing password into passwordInputField");
//        WebElement passwordField = webDriver.findElement(By.cssSelector("input[name='password']"));
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        logger.info("clicking on login button");
        loginButton.click();
    }

    public String getWarningMessage() {
        logger.info("verify if warningMessage is displayed");
        WaitForElement.waitUntilElementIsVisible(warningMessageText);
        return warningMessageText.getText();
    }
}
