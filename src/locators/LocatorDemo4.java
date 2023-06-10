package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorDemo4 extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void locatorDemoTest4() {
        //css selector locator
        driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Computer");

        //css selector locator if using only id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Computer");

        //css selector locator if using class only
        driver.findElement(By.cssSelector("input.search-box-text.ui-autocomplete-input")).sendKeys("Computer");

        //css selector locator if using start with
        driver.findElement(By.cssSelector("input[id^='small']")).sendKeys("Computer");

        //css selector locator if using end with
        driver.findElement(By.cssSelector("input[id$='terms']")).sendKeys("Computer");

        //css selector locator if using contains
        driver.findElement(By.cssSelector("input[id*='mall']")).sendKeys("Computer");

    }

    @After
    public void tearDown() {
     //   closeBrowser();
    }
}
