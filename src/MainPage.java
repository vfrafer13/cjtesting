import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainPage {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //minor commit change
        driver.get("https://cupcakejemma.com/");
    }

    @Test
    public void verifyTitle() {
        new WebDriverWait(driver, 60).until(ExpectedConditions.titleContains("Cupcake Jemma | Amazing Baking"));

        Assert.assertTrue(driver.getTitle().contains("Cupcake Jemma | Amazing Baking"));
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }
}
