package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\WorkSpace\\BDDOnlineBanking\\src\\test\\resources\\Features\\OnlineBanking.feature"
		,glue= {"steps"}
		,dryRun=false
		,monochrome=true
		,tags= {"@Smoke"}
		,plugin = {"pretty", "html:target/Destination","json:target/Destination/cucmuber.json"}		
		)
public class TestRunner {

}
