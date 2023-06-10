package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorDemo2 extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void locatorDemoTest2() {
        //class name locator ----- to find multiple elements
        List<WebElement> sliderElementList = driver.findElements(By.className("nivo-imageLink"));
        System.out.println("Total slides are: " + sliderElementList.size());

        //tag name locator ----- to find multiple element
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of link: "+links.size());
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
