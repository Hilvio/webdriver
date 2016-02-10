package webdriver.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Jonne Hirvi on 2016-02-06.
 *
 * Abstraction of a specific page or view.
 * Knows how to locate and interact with its components.
 *
 */
public class DetailsPage {

    private final WebDriver webDriver;

    public DetailsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public boolean isOpen() {

        return webDriver.findElement(By.cssSelector("section.item-details#item-details")).isDisplayed();

    }
}
