package webdriver.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jonne Hirvi on 2016-02-06.
 *
 * Components provide yet another level of abstraction
 * and are useful in cases where the component exists
 * on several pages.
 *
 */
public class ResultListComponent {

    private final WebDriver webDriver;

    public ResultListComponent(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public boolean hasItems() {

        List<WebElement> elements = webDriver.findElements(By.cssSelector("li.result-list__item"));

        return !elements.isEmpty();

    }
}
