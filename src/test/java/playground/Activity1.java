package playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity1 {

    /*
  Write a test that navigate to Facebook.com
  and print Title
   */
    private WebDriver driver;

    @BeforeMethod
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void testFacebookTitle() {
        String applicationTitle = driver.getTitle();
        Assert.assertEquals(applicationTitle, "xFacebook - log in or sign up");
    }

    @AfterMethod
    public void cleanupTest() {
        driver.quit();
    }
}
