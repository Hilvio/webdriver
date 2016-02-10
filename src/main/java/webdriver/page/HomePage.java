package webdriver.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Jonne Hirvi on 2016-02-06.
 *
 * Abstraction of a specific page or view.
 * Knows how to locate and interact with its components.
 *
 */
public class HomePage {

    private final WebDriver webDriver;
    private final String URL = "http://www.hitta.se";

    public HomePage(WebDriver webDriver) {

        this.webDriver = webDriver;

    }

    public void open() {

        webDriver.get(URL);

    }

    public void typeIntoSearchField(String searchWord) {

        WebElement element = webDriver.findElement(By.cssSelector("input[name='vad']"));
        element.sendKeys(searchWord);

    }

    public void clickSearch() {

        WebElement element = webDriver.findElement(By.cssSelector("button"));
        element.click();
    }
}
