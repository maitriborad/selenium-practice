package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorDemo3 extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void locatorDemoTest3() {
        //Relative x-path locator
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");

        //x-path with OR
        driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='q']")).sendKeys("Mobile");

        //x-path with AND
        driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).sendKeys("Mobile");

        //x-path with contains
        driver.findElement(By.xpath("//input[contains(@id,'mall')]")).sendKeys("Mobile");

        //x-path with start with
        driver.findElement(By.xpath("//input[starts-with(@id,'small')]")).sendKeys("Mobile");

        //x-path with text()
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        //chained x-path
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();

        //X-path text() with contains
        driver.findElement(By.xpath("//a[contains(text(),'in')]")).click();

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
