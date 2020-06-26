import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/feature/Whatsapp.feature"}, //the path of the feature files
		glue={"Cucumber"},
		format= {"pretty","html:test-output"},
		//monochrome = true,
		//dryRun = false, 
		tags = {"@TC01,@TC02,@TC03"}
		)



public class RunTest {

}
