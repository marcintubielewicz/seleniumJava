package jPetStoreTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(name = "username")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void typeInToUsernameField() {
//        WebElement usernameField = webDriver.findElement(By.cssSelector("input[name='username']"));
        usernameInputField.clear();
        usernameInputField.sendKeys("admin");
    }

    public void typeInToPasswordField() {
//        WebElement passwordField = webDriver.findElement(By.cssSelector("input[name='password']"));
        passwordInputField.clear();
        passwordInputField.sendKeys("1234");
    }

    public void clickOnLoginButton(){
        WebElement loginButton = webDriver.findElement(By.name("signon"));
        loginButton.click();
    }

    public String getWarningMessage() {
        WebElement message = webDriver.findElement(By.cssSelector("#Content ul[class='messages'] > li"));
        String warningMessage = message.getText();
        return warningMessage;
    }
}
