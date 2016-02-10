package webdriver.utility;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Jonne Hirvi on 2016-02-06.
 *
 * Contains the logic for starting and quiting the webdriver before and after each test.
 * Can also be used to initiate a specific webdriver (locally or on remote server)
 * based on a System property in order to perform cross browser testing.
 *
 */
public class TestBrowser implements TestRule {

    // Setting the system property here just for demo purposes
    static {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

    }

    private WebDriver webDriver;

    public Statement apply(final Statement statement, Description description) {

        return new Statement() {

            @Override
            public void evaluate() throws Throwable {

                String browser = System.getProperty("browser", "CHROME");

                try {

                    if(browser.equals("CHROME")) {

                        webDriver = new ChromeDriver();

                    }

                    statement.evaluate();

                } finally {

                    webDriver.quit();

                }
            }
        };
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
