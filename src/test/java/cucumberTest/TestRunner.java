package cucumberTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    tags = "@AllTest",
    features = "src//test//resources//features//",
    plugin = "pretty")
public class TestRunner {}
