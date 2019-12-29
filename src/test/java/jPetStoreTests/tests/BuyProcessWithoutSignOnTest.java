package jPetStoreTests.tests;

import jPetStoreTests.page.objects.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BuyProcessWithoutSignOnTest extends TestBase {

    @Test
    public void asNotLoggedUseBuyAndTryProceedToCheckout() {
        EnterTheStorePage enterTheStorePage = new EnterTheStorePage();
        enterTheStorePage.clickOnEnterTheStoreLink();

        MainPage mainPage = new MainPage();
        mainPage.clickOnSidebarMenuFishLink();

        FishListPage fishListPage = new FishListPage();
        fishListPage.clickOnAngelfishProductIdLink();

        AngelFishListPage angelFishListPage = new AngelFishListPage();
        angelFishListPage.clickOnLargeAngelfishAddToCartButton();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.clickOnProceedToCheckoutButton();

        assertTrue(shoppingCartPage.isWarningMessageDisplayed(), "You must sign on before attempting to check out. Please sign on and try checking out again.");
    }
}
