package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //@RunWith is with junit package
@CucumberOptions(features="C:\\Users\\Puspanjali\\workspace\\FreeCRMCucumberBDD\\FreeCrmBDD\\src\\main\\java\\features",
glue={"stepDefinitions"})
//format={"pretty","html:test-output"})
public class TestRunner {
	
	

}
