package org.example.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/org/example/features"},
        glue = {"org.example.stepdefinitions"},
        tags= "@NightlyBuildTest or not @RegularTest",
        plugin = {"pretty"}
)
public class MenuManagementTestRunner {
}
