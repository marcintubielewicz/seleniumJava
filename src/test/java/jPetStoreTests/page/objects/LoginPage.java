package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

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
//        WebElement usernameField = webDriver.findElement(By.cssSelector("input[name='username']"));
        usernameInputField.clear();
        usernameInputField.sendKeys(username);
    }

    public void typeInToPasswordField(String password) {
//        WebElement passwordField = webDriver.findElement(By.cssSelector("input[name='password']"));
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }

    public void clickOnLoginButton(){
//        WebElement loginButton = webDriver.findElement(By.name("signon"));
        loginButton.click();
    }

    public String getWarningMessage() {
//        WebElement message = webDriver.findElement(By.cssSelector("#Content ul[class='messages'] > li"));
        String warningMessage = warningMessageText.getText();
        return warningMessage;
    }
}
