package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



/**
 * @author Nilmini Amarasinghe
 *
 * FutureReady App
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/cucumberHtmlReport"},
		features = "src/test/resources/features/PetInsurance.feature"
		,glue={"com/agentapp/steps"},strict = true
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
