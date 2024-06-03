package org.merini.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/test/resources/features", glue= {"org/merini/steps"},
        monochrome=true,
        plugin={"pretty","json:target/JSONReports/report.json"},
        tags="GoogleTest"
)

public class TestRunnerJson {
}