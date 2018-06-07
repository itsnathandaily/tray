package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        //plugin = {"pretty", "html:target/cucumber-reports/html", "json:target/cucumber.json", "rerun:target/rerun.txt"},
        //glue = "src/test/java/stepdefs/loginstepdefs.java"
         tags = {"@login.feature"}
)

@RunWith(Cucumber.class)
public class testrunner1 {
}
