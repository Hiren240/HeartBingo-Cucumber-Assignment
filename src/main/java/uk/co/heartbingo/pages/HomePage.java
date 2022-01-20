package uk.co.heartbingo.pages;
/*
 * Created By: Hiren Patel
 * Project Name: HeartBingo-Cucumber-Assignment
 */

import org.testng.Assert;
import uk.co.heartbingo.propertyreader.PropertyReader;
import uk.co.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log In')]")
    WebElement loginLink;


    public void verifyHomePage(){
        String actualUrl = driver.getCurrentUrl();  // Get Existing url and save into string
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("verifying Homepage URL. ");
        AssertJUnit.assertEquals(expectedUrl,actualUrl); //verify actual and expected Url
    }

    public void verifyLoginText(String text){
        String actualLink = getTextFromElement(loginLink);  // Get text from element and save into string
        System.out.println("Text of Login Link: " + actualLink); //Print text get from element
        Assert.assertTrue(actualLink.contains((text))); //verify actual and expected with contains text
        log.info("Verify Login Link  : " + text + loginLink.toString());
    }

    public void clickLoginLink(){
        clickOnElement(loginLink); //Click on element
        log.info("Clicking on Login Button: " );
    }
    public void verifyUserIsOnHomePage(){
        String actualUrl = driver.getCurrentUrl(); // Get Existing url and save into string
        System.out.println("Current URL: " + actualUrl);
        String expectedUrl = "https://www.heartbingo.co.uk/en-gb/"; //expected Url
        Assert.assertEquals(actualUrl, expectedUrl); //verify actual and expected Url
        log.info("Verify user is on HomePage: ");
    }
}
