package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\WorkSpace\\Mercury\\src\\test\\resources\\Features\\Login.feature"
		,glue= {"steps"}
		,dryRun=false
		,monochrome=true
		
		,plugin = {"pretty", "html:target/Destination","json:target/Destination/cucmuber.json","rerun:target/Destination/rerun.text"}		
		)

public class TestRunner {

}

//OR : ,tags= {"@SmokeTest,@Regression"}: execute all test tagged as @smaketest or regression
//And: tags= {"@SmokeTest","@Regression"}: execute all test tagged as @smaketest and  regression
////Not tagged:  tags= {"~@SmokeTest","~@Regression"}: execute test cases which are not tagged