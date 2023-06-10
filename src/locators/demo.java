package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class demo extends BaseTest {
    String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void demo() {


    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
