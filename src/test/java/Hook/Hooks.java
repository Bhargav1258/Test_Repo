package Hook;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    public static WebDriver driver;

    // ================= BEFORE =================

    @Before
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://tutorialsninja.com/demo/");
    }

    // ================= AFTER =================

    @After
    public void tearDown(Scenario scenario) {

        // Screenshot for failed scenario
        if (scenario.isFailed()) {

            TakesScreenshot ts =
                    (TakesScreenshot) driver;

            byte[] screenshot =
                    ts.getScreenshotAs(OutputType.BYTES);

            scenario.attach(
                    screenshot,
                    "image/png",
                    "Failure Screenshot");
        }

        driver.quit();
    }
}