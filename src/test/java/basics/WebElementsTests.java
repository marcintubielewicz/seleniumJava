package basics;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.*;

public class WebElementsTests {

    private WebDriver webDriver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/marcin.tubielewicz/IdeaProjects/seleniumIntro/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.navigate().to("http://przyklady.javastart.pl/test/full_form.html");
    }

    @Test
    public void typingIntoWebElementTest() {
        WebElement userNameField = webDriver.findElement(By.id("username"));
        userNameField.sendKeys("Selenium Start");
//        sleep();
        String typeUserNameValue = userNameField.getAttribute("value");
//        sleep();
        assertEquals(typeUserNameValue, "Selenium Start");
        userNameField.click();
    }

    //can not be verified, selenium does not read text displayed after the file is chosen
    @Test
    public void filePickingTest() {
        WebElement uploadFilePicker = webDriver.findElement(By.id("upload_file"));
        uploadFilePicker.sendKeys("/Users/marcin.tubielewicz/Desktop/Readme_VEEER.pdf");
        String text = uploadFilePicker.getText();
        assertTrue(text.contains("Readme_VEEER.pdf"));
        uploadFilePicker.clear();
    }

    @Test
    public void checkRadioButtonTest() {
        WebElement maleRadioButton = webDriver.findElement(By.cssSelector("input[value='male']"));
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        maleRadioButton.isEnabled();

        //WebElement femaleRadioButton = webDriver.findElement(By.id("radios-1"));

        maleRadioButton.click();
        sleep();
        assertTrue(maleRadioButton.isSelected());
    }

    @Test
    public void checkBoxButtonTest() {
        WebElement pizzaCheckbox = webDriver.findElement(By.cssSelector("input[value='pizza']"));
        pizzaCheckbox.click();
        sleep();
        assertTrue(pizzaCheckbox.isSelected());
    }

    @Test
    public void dropDownListingTest() {
        WebElement countryWebElement = webDriver.findElement(By.id("country"));
        Select countryDropDownList = new Select(countryWebElement);
        List<WebElement> options = countryDropDownList.getOptions();
        List<String> names = new ArrayList<>();
        for (WebElement option : options) {
            names.add(option.getText());
            System.out.println(option.getText());
        }

        List<String> expectedNamesOptions = new ArrayList<>();
        expectedNamesOptions.add("Germany");
        expectedNamesOptions.add("Poland");
        expectedNamesOptions.add("UK");

        assertEquals(names, expectedNamesOptions);
    }

    @Test
    public void selectingOptionsFromDropDown() {
        WebElement countryWebElement = webDriver.findElement(By.id("country"));
        Select countryDropDown = new Select(countryWebElement);

        countryDropDown.selectByVisibleText("Poland");

        assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Poland");

        countryDropDown.selectByValue("en_GB");

        assertEquals(countryDropDown.getFirstSelectedOption().getText(), "UK");
    }

    @Test
    public void checkIfElementIsOnThePage() {
        WebElement usernameField = webDriver.findElement(By.id("username"));
        WebElement passwordField = webDriver.findElement(By.id("password"));

        assertTrue(usernameField.isDisplayed());
        assertTrue(passwordField.isDisplayed());

        assertTrue(usernameField.isEnabled());
        assertFalse(passwordField.isEnabled());
    }

    @Test
    public void actionsTest() {
        webDriver.navigate().to("http://przyklady.javastart.pl/test/hover_mouse.html");
        WebElement smileyIcon = webDriver.findElement(By.id("smiley"));
        WebElement smileyIcon2 = webDriver.findElement(By.id("smiley2"));

        Actions actions = new Actions(webDriver);

        actions.moveToElement(smileyIcon).moveToElement(smileyIcon2).click().build().perform();
    }

    @Test
    public void checkboxesTests() {
        webDriver.navigate().to("http://theinternet.przyklady.javastart.pl/checkboxes");
        WebElement checkbox1 = webDriver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2 = webDriver.findElement(By.xpath("//input[2]"));

        checkbox1.click();
        checkbox2.click();
        assertTrue(checkbox1.isSelected());

        checkbox2.click();
        assertTrue(checkbox2.isSelected());
        assertTrue(checkbox1.isSelected());
    }

    @Test
    public void dropdownTest() {
        webDriver.navigate().to("http://theinternet.przyklady.javastart.pl/dropdown");
        WebElement dropDownList = webDriver.findElement(By.id("dropdown"));

        Select select = new Select(dropDownList);

        select.selectByValue("1");
        String selectedOption = select.getFirstSelectedOption().getText();
        assertEquals(selectedOption, "Option 1");

        select.selectByVisibleText("Option 2");
        selectedOption = select.getFirstSelectedOption().getText();
        assertEquals(selectedOption, "Option 2");
    }

    @Test
    public void uploadTest() {
        webDriver.navigate().to("http://theinternet.przyklady.javastart.pl/upload");
        WebElement choseFileButton = webDriver.findElement(By.id("file-upload"));
        WebElement uploadSubmitButton = webDriver.findElement(By.id("file-submit"));

        choseFileButton.sendKeys("/Users/marcin.tubielewicz/Desktop/Readme_VEEER.pdf");
        uploadSubmitButton.click();

        WebElement uploadedFile = webDriver.findElement(By.id("uploaded-files"));
        String text = uploadedFile.getText();

        assertEquals(text, "Readme_VEEER.pdf");

    }

    @Test
    public void hooversTest() {
        webDriver.navigate().to("http://theinternet.przyklady.javastart.pl/hovers");
        WebElement avatar1 = webDriver.findElement(By.xpath("//div/div[1]/img[1]"));
        WebElement avatar2 = webDriver.findElement(By.xpath("//div/div[2]/img[1]"));
        WebElement avatar3 = webDriver.findElement(By.xpath("//div/div[3]/img[1]"));

        WebElement user1FigCaption = webDriver.findElement(By.xpath("//div/div[1]/div/h5"));
        Actions actions = new Actions(webDriver);

        actions.moveToElement(avatar1).build().perform();

        assertEquals(user1FigCaption.getText(), "name: user1");

        actions.moveToElement(avatar3).moveToElement(avatar2).build().perform();
        WebElement user2FigCaption = webDriver.findElement(By.xpath("//div/div[2]/div/h5"));

        assertEquals(user2FigCaption.getText(), "name: user2");
    }

    @Test
    public void dynamicControlsTest() {
        webDriver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_controls");
        WebElement checkbox = webDriver.findElement(By.id("checkbox"));
        assertTrue(checkbox.isDisplayed() && checkbox.isEnabled());

        WebElement rmButton = webDriver.findElement(By.id("btn"));

        rmButton.click();

        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 15);
        webDriverWait.until(ExpectedConditions.invisibilityOf(checkbox));

        WebElement messageBox = webDriver.findElement(By.id("message"));
        assertEquals(messageBox.getText(), "It's gone!");


    }

    @Test
    public void dynamicControls2Test() {
        webDriver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_controls");
        WebElement checkbox = webDriver.findElement(By.id("checkbox"));
        assertTrue(checkbox.isDisplayed() && checkbox.isEnabled());

        WebElement rmButton = webDriver.findElement(By.id("btn"));

        rmButton.click();

        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 15);
        webDriverWait.until(ExpectedConditions.invisibilityOf(checkbox));

        WebElement messageBox = webDriver.findElement(By.id("message"));
        assertEquals(messageBox.getText(), "It's gone!");

        rmButton.click();
        checkbox = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkbox")));
        assertTrue(checkbox.isDisplayed() && checkbox.isEnabled());
        assertFalse(checkbox.isSelected());


    }

    @Test
    public void dynamicLoad() {
        webDriver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_loading/1");

        WebElement helloWord = webDriver.findElement(By.id("finish"));
        assertFalse(helloWord.isDisplayed());

        WebElement startButton = webDriver.findElement(By.xpath("//div/button"));
        startButton.click();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 15);
        webDriverWait.until(ExpectedConditions.invisibilityOf(startButton));

        assertTrue(helloWord.isEnabled());
    }

    @Test
    public void dynamicLoading2() {
        webDriver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_loading/2");
//
//        WebElement startButton = webDriver.findElement(By.cssSelector("#start > button"));
//        startButton.click();
//
//        FluentWait <WebDriver> fluentWait = new FluentWait<>(webDriver);
//
//        WebElement message = fluentWait
//                .pollingEvery(Duration.ofMillis(250))
//                .withTimeout(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class)
//                .until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
//
//        assertTrue(message.isDisplayed());

        WebElement startButton = webDriver.findElement(By.cssSelector("#start > button"));
        startButton.click();

        FluentWait<WebDriver> fluentWait = new FluentWait<>(webDriver);
        WebElement helloWorldMessage = fluentWait
                .pollingEvery(Duration.ofMillis(250))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[2]/div/div/div[1]/h4")));

//        assertTrue(helloWorldMessage.isDisplayed());
    }

    @AfterTest
    public void afterTest() {
        webDriver.close();
        webDriver.quit();
    }

    private void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
