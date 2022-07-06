package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
 features="FeatureFiles/login.feature",
 glue="StepDefinitions",
 dryRun=false,
 strict=true,
 monochrome=true,
 plugin={"pretty","html:Reports//loginhtml","json:json/report.json"}
		)
public class RunnerClass {

}
