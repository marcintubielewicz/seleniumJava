package jPetStoreTests.tests;

import jPetStoreTests.page.objects.BottomMenuPage;
import jPetStoreTests.page.objects.EnterTheStorePage;
import jPetStoreTests.page.objects.LoginPage;
import jPetStoreTests.page.objects.TopMenuPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class PositiveLoginTest extends TestBase{

//    private WebDriver webDriver;

    @Test
    public void asRegisteredUserLoginUsingValidLoginAndPassword(){
        EnterTheStorePage enterTheStorePage = new EnterTheStorePage();
        enterTheStorePage.clickOnEnterTheStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typeInToUsernameField("j2ee");
        loginPage.typeInToPasswordField("j2ee");
        loginPage.clickOnLoginButton();

        BottomMenuPage bottomMenuPage = new BottomMenuPage();
        assertTrue(bottomMenuPage.isBannerAfterValidLoginDisplayed());
    }
}
