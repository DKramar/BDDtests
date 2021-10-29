package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    tags = "@AllTest",
    features = "src//test//resources//features//",
    plugin = "pretty",
    glue = "src.test.java.cucumberTest.stepDefinition")
public class TestRunner {}
