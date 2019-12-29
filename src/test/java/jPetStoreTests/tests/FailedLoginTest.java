package jPetStoreTests.tests;

import jPetStoreTests.page.objects.EnterTheStorePage;
import jPetStoreTests.page.objects.LoginPage;
import jPetStoreTests.page.objects.TopMenuPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FailedLoginTest extends TestBase {

    @Test
    public void tryToLogInWithIncorrectLoginAndPassword() {
        EnterTheStorePage enterTheStorePage = new EnterTheStorePage();
        enterTheStorePage.clickOnEnterTheStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();
        LoginPage loginPage = new LoginPage();
        loginPage.typeInToUsernameField("admin");
        loginPage.typeInToPasswordField("1234");
        loginPage.clickOnLoginButton();

        assertEquals(loginPage.getWarningMessage(), "Invalid username or password. Signon failed.");
    }
}
