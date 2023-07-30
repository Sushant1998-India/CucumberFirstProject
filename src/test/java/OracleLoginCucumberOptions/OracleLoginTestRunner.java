package OracleLoginCucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/OracleLoginFeatureFiles",
		glue="OracleLoginStepDefinations",
		monochrome=true,
		//plugin= {"pretty"}
		tags="@SmokeTest"
		//tags={"@FirstTest, @SecondTest"}
		//tags={"@FirstTest","@SecondTest"}
		)
public class OracleLoginTestRunner {
	
	

}
 