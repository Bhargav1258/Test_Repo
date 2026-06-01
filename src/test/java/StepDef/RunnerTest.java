package StepDef;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDef",
       tags = "@regression", 
        plugin = {
                "pretty",
                "html:target/cucumber-reports/report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        monochrome = true,
        dryRun = false
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}