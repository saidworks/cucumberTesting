package org.example.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/org/example/features"},
        glue = {"org.example.stepdefinitions"},
        tags= "@ListOfStrings",
        plugin = {"pretty",
                "html:target/testReports/html",
                "json:target/testReports/json/report.json",
                "junit:target/testReports/junit/report.xml"
        },
        dryRun = false,
        monochrome = false
)
public class MenuManagementTestRunner {
}
