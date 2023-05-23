package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",tags="@smoke",
plugin= {"pretty","json:target/cucumber-reprt/cucumber.json","html:target/TestReport/test.html"},glue= {"stepDefinition","base"})

public class WebPageTest {
	
}


	
