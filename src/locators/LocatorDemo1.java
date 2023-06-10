package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorDemo1 extends BaseTest {
    String baseURL = "https://www.letskodeit.com/login";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void locatorDemoTest1(){
       //id and name locators
        driver.findElement(By.id("email")).sendKeys("Maitriborad123@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Maitri@123");

        //link text locator
        driver.findElement(By.linkText("Forgot Password?")).click();

        //partial link text locator
        driver.findElement(By.partialLinkText("Up")).click();
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
