package testSuit;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageEvents.HtmlElementEvents;
import pageEvents.SignUpPageEvents;
import utils.BaseTest;

public class DemoTest extends BaseTest {
    public static WebDriver driver;
    @Test
    public void loadPage() throws InterruptedException {
        driver = DriverFactory.getDriver("chrome");
        driver.get("http://www.yahoo.com");
        HtmlElementEvents htmlElementEvents= new HtmlElementEvents();
        Thread.sleep(2000);
        htmlElementEvents.clickButton("//*[@id=\"root_2\"]");
        Thread.sleep(5000);
    }
    @Test
    public void signIn() throws InterruptedException {
        driver = DriverFactory.getDriver("chrome");
        driver.get("http://www.yahoo.com");
        HtmlElementEvents htmlElementEvents= new HtmlElementEvents();
        Thread.sleep(2000);
        htmlElementEvents.clickButton("//*[@id=\"ybarAccountProfile\"]/a");
        Thread.sleep(2000);
        HtmlElementEvents.fillTextField("//*[@id=\"login-username\"]","pasindukaushan@yahoo.com");
        Thread.sleep(2000);
    }
    @Test
    public void test() throws InterruptedException {
        driver = DriverFactory.getDriver("chrome");
        driver.get("http://www.yahoo.com");
        Thread.sleep(2000);
        HtmlElementEvents.fillTextField("//*[@id=\"ybar-sbq\"]","car");
        Thread.sleep(2000);

    }

}
