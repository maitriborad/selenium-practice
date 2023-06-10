package junit;

import org.junit.*;

public class JUnitIntroduction {
    @BeforeClass
    public static void connectToDB(){
        System.out.println("DB connection");
    }
    @AfterClass
    public static void CloseConnectionToDB(){
        System.out.println("Close DB connection");
    }
    @Before
    public void openBrowse(){
        System.out.println("Opening Browse");
    }
    @After
    public void closeBrowse(){
        System.out.println("closing Browse");
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        System.out.println("Navigate to Login Page");
    }
    @Test
    public void test(){
        System.out.println("Test method");
    }
}
