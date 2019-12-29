package jPetStoreTests.page.objects;

import jPetStoreTests.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#SidebarContent a[href$='FISH']")
    private WebElement sidebarMenuFishLink;

    @FindBy(css = "#SidebarContent a[href$='DOGS']")
    private WebElement sidebarMenuDogsLink;

    @FindBy(css = "#SidebarContent a[href$='CATS']")
    private WebElement sidebarMenuCatsLink;

    @FindBy(css = "#SidebarContent a[href$='REPTILES']")
    private WebElement sidebarMenuReptilesLink;

    @FindBy(css = "#SidebarContent a[href$='BIRDS']")
    private WebElement sidebarMenuBirdsLink;


    @FindBy(css = "#QuicksLinks a[href$='FISH']")
    private WebElement quickLinksMenuFishLink;

    @FindBy(css = "#QuickLinks a[href$='DOGS']")
    private WebElement quickLinksMenuDogsLink;

    @FindBy(css = "#QuickLinks a[href$='CATS']")
    private WebElement quickLinksMenuCatsLink;

    @FindBy(css = "#QuickLinks a[href$='REPTILES']")
    private WebElement quickLinksMenuReptilesLink;

    @FindBy(css = "#QuickLinks a[href$='BIRDS']")
    private WebElement quickLinksMenuBirdsLink;


    @FindBy(css = "#MainImageContent a[href$='FISH']")
    private WebElement mainImageContentMenuFishLink;

    @FindBy(css = "#QuickLinks a[href$='DOGS']")
    private WebElement mainImageContentMenuDogsLink;

    @FindBy(css = "#QuickLinks a[href$='CATS']")
    private WebElement mainImageContentMenuCatsLink;

    @FindBy(css = "#QuickLinks a[href$='REPTILES']")
    private WebElement mainImageContentMenuReptilesLink;

    @FindBy(css = "#QuickLinks a[href$='BIRDS']")
    private WebElement mainImageContentMenuBirdsLink;

    public MainPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnSidebarMenuFishLink() {
        logger.info("clicking on sidebarMenuFishLink");
        sidebarMenuFishLink.click();
    }
}
