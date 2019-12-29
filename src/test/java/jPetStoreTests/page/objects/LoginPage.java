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
//    private WebDriver webDriver;

    public LoginPage(){
//        this.webDriver = webDriver;
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public void typeInToUsernameField(String username) {
        logger.info("trying to type username into usernameInputField");
//        WebElement usernameField = webDriver.findElement(By.cssSelector("input[name='username']"));
        WaitForElement.waitUntilElementIsVisible(usernameInputField);
        usernameInputField.clear();
        usernameInputField.sendKeys(username);
    }

    public void typeInToPasswordField(String password) {
        logger.info("trying to type password into passwordInputField");
//        WebElement passwordField = webDriver.findElement(By.cssSelector("input[name='password']"));
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }

    public void clickOnLoginButton(){
        logger.info("trying click on login button");
//        WebElement loginButton = webDriver.findElement(By.name("signon"));
        loginButton.click();
    }

    public String getWarningMessage() {
//        WebElement message = webDriver.findElement(By.cssSelector("#Content ul[class='messages'] > li"));
        WaitForElement.waitUntilElementIsVisible(warningMessageText);
        return warningMessageText.getText();
    }
}
