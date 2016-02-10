package webdriver.flow;

import org.openqa.selenium.WebDriver;
import webdriver.component.ResultListComponent;
import webdriver.page.DetailsPage;
import webdriver.page.HomePage;
import webdriver.page.ResultsPage;

/**
 * Created by Jonne Hirvi on 2016-02-06.
 *
 * Captures the user actions.
 * Knows in which order specific steps should be taken,
 * but knows nothing about their implementation.
 *
 */
public class TestFlows {

    private final WebDriver webDriver;

    public TestFlows(WebDriver webDriver) {

        this.webDriver = webDriver;

    }

    public void searchFor(String searchWord) {

        HomePage homePage = new HomePage(webDriver);
        homePage.open();
        homePage.typeIntoSearchField(searchWord);
        homePage.clickSearch();

    }

    public boolean isNoResultsBoxVisible() {

        ResultsPage resultsPage = new ResultsPage(webDriver);
        return resultsPage.isNoResultsBoxVisible();

    }

    public boolean isDetailsPageOpen() {

        DetailsPage detailsPage = new DetailsPage(webDriver);
        return detailsPage.isOpen();


    }

    public boolean resultListContainsMultipleItems() {

        ResultsPage resultsPage = new ResultsPage(webDriver);
        ResultListComponent resultListComponent = resultsPage.getResultsListComponent();

        return resultListComponent.hasItems();

    }
}
