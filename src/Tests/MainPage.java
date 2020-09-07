package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MainPage {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
        driver.get("https://cupcakejemma.com/");
    }

    @Test
    public void verifyTitle() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.titleContains("Cupcake Jemma | Amazing Baking"));

        Assert.assertTrue(driver.getTitle().contains("Cupcake Jemma | Amazing Baking"));
    }
}
