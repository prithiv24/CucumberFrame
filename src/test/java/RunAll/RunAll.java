package RunAll;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import JvmReport.JVMReport;
import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
 features="C:\\Users\\Prithiv\\eclipse-workspace\\CucumberFrame\\json\\report.json",
 glue="StepDefinitions",
 dryRun=false,
 strict=true,
 monochrome=true,
 plugin={"html:Reports//loginhtml","json:json/report.json"}
		)

public class RunAll {
	@AfterClass
	public static  void report() {
JVMReport.generateJVMReport("C:\\Users\\Prithiv\\eclipse-workspace\\CucumberFrame\\json\\report.json");
	}
}
