package uk.co.heartbingo.pages;
/*
 * Created By: Hiren Patel
 * Project Name: HeartBingo-Cucumber-Assignment
 */

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import uk.co.heartbingo.utility.Utility;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "div.modal_title_wrapper")
    WebElement logo;

    @CacheLookup
    @FindBy(className = "oneauth-iframe")
    WebElement iframe;

    @CacheLookup
    @FindBy(id = "username")
    WebElement userNameField;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(name = "login_submit")
    WebElement loginButton;

    @CacheLookup
    @FindBy(className = "login_errorMessageWrapper__2ZcGx")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[contains(@class,'bvs-icon is-big')]")
    WebElement closeWindow;


    // Verify Title of the page
    public void verifyTitleOfPage() {
        String actualTitle = driver.getTitle(); //getting title of page
        System.out.println("Current page title is: " + actualTitle); //Print title of page
        String expectedTitle = "Online Bingo | Bet £10 Get 500 Tickets & 25 Free Spins | Heart Bingo"; //expected title
        Assert.assertEquals(actualTitle, expectedTitle); //verify title
        log.info("Verify user is on LoginPage: ");
    }

    public void verifyLogo() throws InterruptedException {
        Thread.sleep(2000);// wait for element to displayed
        verifyLogoDisplayed(logo); //verify logo displayed on webpage
        log.info("Verifying logo HeartBingo. ");
    }

    public void sendTextToUserNameField(String username) {
        driver.switchTo().frame(iframe); //Switch to iframe to get element
        sendTextToElement(userNameField, username);// send text in to located field
        log.info("Enter User Name: '" + username + "'");
    }

    public void sendTextToPasswordField(String password) {
        sendTextToElement(passwordField, password); // send text in to located field
        log.info("Enter Password: '" + password + "'");
    }

    public void clickLoginButton() {
        clickOnElement(loginButton);// click to located field
        log.info("Clicking on Login button. ");
    }

    public void verifyErrorMessage(String error) {
        String actualString = getTextFromElement(errorMessage); // get text from element and save in string
        Assert.assertTrue(actualString.contains(error));  //verify actual and expected with contains text
        log.info("Verify error message : '" + error + "'");
    }

    public void closeLoginWindow() {
        driver.switchTo().defaultContent(); // switch back to default content from iframe
        clickOnElement(closeWindow); // click on located element
        log.info("Clicking on X to close window. ");
    }



}
