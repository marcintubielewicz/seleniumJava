package jPetStoreTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class FailedLoginTest {

    private WebDriver webDriver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/marcin.tubielewicz/IdeaProjects/seleniumIntro/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.navigate().to("http://przyklady.javastart.pl/jpetstore/");
    }

    @Test
    public void tryToLogInWithIncorrectLoginAndPassword(){
        EnterTheStorePage enterTheStorePage = new EnterTheStorePage(webDriver);
//        PageFactory.initElements(webDriver,enterTheStorePage);
        enterTheStorePage.clickOnEnterTheStoreLink();

//        WebElement enterTheStoreLink = webDriver.findElement(By.cssSelector("a[href*=\"actions\"]"));
//        enterTheStoreLink.click();

        assertEquals(webDriver.getTitle(),"JPetStore Demo");

        TopMenuPage  topMenuPage = new TopMenuPage(webDriver);
//        PageFactory.initElements(webDriver,topMenuPage);
        topMenuPage.clickOnSignInLink();

//        WebElement signOnLink = webDriver.findElement(By.cssSelector("a[href*=\"signonForm\"]"));
//        signOnLink.click();

        LoginPage loginPage = new LoginPage(webDriver);
//        PageFactory.initElements(webDriver,loginPage);
        loginPage.typeInToUsernameField("admin");
        loginPage.typeInToPasswordField("1234");
        loginPage.clickOnLoginButton();

        assertEquals(loginPage.getWarningMessage(),"Invalid username or password. Signon failed.");

//        WebElement usernameField = webDriver.findElement(By.cssSelector("input[name='username']"));
//        WebElement passwordField = webDriver.findElement(By.cssSelector("input[name='password']"));
//
//        usernameField.sendKeys("admin");
//        passwordField.clear();
//        passwordField.sendKeys("1234");
//
//        WebElement loginButton = webDriver.findElement(By.name("signon"));
//        loginButton.click();
//
//        WebElement message = webDriver.findElement(By.cssSelector("#Content ul[class='messages'] > li"));
//        assertEquals(message.getText(),"Invalid username or password. Signon failed.");

    }

    @Test
    public void asRegisteredUserLoginUsingValidLoginAndPassword(){
        EnterTheStorePage enterTheStorePage = new EnterTheStorePage(webDriver);
        enterTheStorePage.clickOnEnterTheStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(webDriver);
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.typeInToUsernameField("j2ee");
        loginPage.typeInToPasswordField("j2ee");
        loginPage.clickOnLoginButton();

        BottomMenuPage bottomMenuPage = new BottomMenuPage(webDriver);
        assertTrue(bottomMenuPage.isBannerAfterValidLoginDisplayed());
    }

    @AfterTest
    public void afterTest(){
        webDriver.close();
        webDriver.quit();
    }
}
