package jPetStoreTests.tests;

import jPetStoreTests.page.objects.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BuyProcessWithoutSignOnTest extends TestBase {

    @Test
    public void asNotLoggedUseBuyAndTryProceedToCheckout() {
        EnterTheStorePage enterTheStorePage = new EnterTheStorePage(webDriver);
        enterTheStorePage.clickOnEnterTheStoreLink();

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnSidebarMenuFishLink();

        FishListPage fishListPage = new FishListPage(webDriver);
        fishListPage.clickOnAngelfishProductIdLink();

        AngelFishListPage angelFishListPage = new AngelFishListPage(webDriver);
        angelFishListPage.clickOnLargeAngelfishAddToCartButton();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(webDriver);
        shoppingCartPage.clickOnProceedToCheckoutButton();

//        mainPage.clickOnAngelFishProductIdLink();
//        mainPage.clickOnLargeAngelfishAddToCartButton();
//        mainPage.clickOnProceedToCheckoutButton();

        assertTrue(shoppingCartPage.isWarningMessageDisplayed(), "You must sign on before attempting to check out. Please sign on and try checking out again.");
    }
}
