package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class MainPage {

    @BeforeSuite
    public void beforeSuite() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cupcakejemma.com/");
    }
}
