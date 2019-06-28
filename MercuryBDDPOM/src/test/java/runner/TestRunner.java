package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\WorkSpace\\MercuryBDDPOM\\src\\test\\resources\\Features\\test.feature"
		,glue= {"steps"}
		,dryRun=false
		,monochrome=true
		,plugin = {"pretty", "html:target/Destination","json:json-output/cucmuber.json"}		
		)

public class TestRunner {

}
