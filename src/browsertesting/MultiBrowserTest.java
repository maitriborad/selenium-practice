package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://demo.nopcommerce.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver=new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }

        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        //find the login link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //click on login link element
        loginLink.click();
        //find email field element and pass value
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("maitriborad@gmail.com");
        //find password field element and pass value
        driver.findElement(By.name("Password")).sendKeys("Maitri@123");
    }
}
