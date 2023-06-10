package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeOptionsExample {
    public static void main(String[] args) {

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");//disable browser notification
        option.addArguments("--incognito");//open browser in private window
        option.addArguments("--headless");//without opening browser testing

        String baseUrl = "https://www.justdial.com/";
        //launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //open browser
        driver.get(baseUrl);
        //maximise browser
        driver.manage().window().maximize();
        //we give Implicit wait to payload
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title
        System.out.println("Page title: "+ driver.getTitle());

    }
}
