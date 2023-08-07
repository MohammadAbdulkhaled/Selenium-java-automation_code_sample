package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinations"},
		
		plugin= {"pretty",
				"html: target/Report/CucumberReport.html",
				"json: target/Report/CucumberReport.json",
				"junit: target/Report/CucumberReport.xml"
				},
                 tags="@smoke",
                 monochrome=true,
                 publish=true,
                 dryRun=true)

public class TestRunner extends AbstractTestNGCucumberTests {

}
 