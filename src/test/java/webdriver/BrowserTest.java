package webdriver;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import webdriver.flow.TestFlows;
import webdriver.utility.TestBrowser;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Jonne Hirvi on 2016-02-06.
 */
public class BrowserTest {

    @Rule
    public TestBrowser browser = new TestBrowser();

    @Test
    public void test_mainSearchReturns_zero_results(){

        WebDriver webDriver = browser.getWebDriver();

        TestFlows testFlows = new TestFlows(webDriver);
        testFlows.searchFor("aabccdefghjiklmnopqrstuvxyz");

        assertTrue("'No results found' box was not visible!", testFlows.isNoResultsBoxVisible());

    }

    @Test
    public void test_mainSearchReturns_one_result(){

        WebDriver webDriver = browser.getWebDriver();

        TestFlows testFlows = new TestFlows(webDriver);
        testFlows.searchFor("Jonne Hirvi");

        assertTrue("'Details' page was not open!", testFlows.isDetailsPageOpen());

    }

    @Test
    public void test_mainSearchReturns_many_results(){

        WebDriver webDriver = browser.getWebDriver();

        TestFlows testFlows = new TestFlows(webDriver);
        testFlows.searchFor("Hitta");

        assertTrue("No results found box was not visible!", testFlows.resultListContainsMultipleItems());

    }
}
