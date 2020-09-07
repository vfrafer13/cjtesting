package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SideBar {
    @FindBy(id="shopify-section-sidebar")
    private WebElement sideBarSection;

    private WebElement sideBar;

    private WebDriver driver;

    public SideBar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.sideBar = findSideBar();
    }

    //private methods
    private WebElement findSideBar() {
        return sideBarSection.findElement(By.className("sidebar"));
    }

    private WebElement findLogo() {
        return sideBar.findElement(By.className("logo"));
    }

    private WebElement findPrimaryMenu() {
        return sideBar.findElement(By.cssSelector("nav.primary-menu"));
    }

    private List<WebElement> findPrimaryMenuItems() {
        return findPrimaryMenu().findElements(By.cssSelector("li"));
    }

    private WebElement findSecondaryMenu() {
        return sideBar.findElement(By.className("secondary-menu"));
    }

    private WebElement findLogin() {
        return findSecondaryMenu().findElement(By.linkText("LOG IN"));
    }

    private WebElement findSearchForm() {
        return findSideBar().findElement(By.xpath("//form[@class='input-group search-form']"));
    }

    private WebElement findSearchInput() {
        return findSearchForm().findElement((By.name("q")));
    }

    private WebElement findSearchButton() {
        return findSearchForm().findElement(By.xpath("//button[@class='btn icon-fallback-text']"));
    }



}
