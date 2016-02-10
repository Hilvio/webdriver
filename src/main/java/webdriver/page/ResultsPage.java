package webdriver.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webdriver.component.ResultListComponent;

/**
 * Created by Jonne Hirvi on 2016-02-06.
 *
 * Abstraction of a specific page or view.
 * Knows how to locate and interact with its components.
 *
 */
public class ResultsPage {

    private WebDriver webDriver;
    private ResultListComponent resultsListComponent;

    public ResultsPage(WebDriver webDriver) {

        this.webDriver = webDriver;
        this.resultsListComponent = new ResultListComponent(webDriver);

    }

    public boolean isNoResultsBoxVisible() {

        return webDriver.findElement(By.cssSelector("div.no-results")).isDisplayed();

    }

    public ResultListComponent getResultsListComponent() {
        return resultsListComponent;
    }
}
