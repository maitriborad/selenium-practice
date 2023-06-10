package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        //launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //open browser
        driver.get(baseUrl);
        //maximise browser
        driver.manage().window().maximize();
        //we give Implicit wait to payload
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //get the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //get page source
        System.out.println("Page source : " + driver.getPageSource());
        //find the login link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //click on login link element
        loginLink.click();
        //find email field element and pass value
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("maitriborad@gmail.com");
        //find password field element and pass value
        driver.findElement(By.name("Password")).sendKeys("Maitri@123");





        //driver.close();//close the browser
    }
}
