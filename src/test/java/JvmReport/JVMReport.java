package JvmReport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {
	public static void generateJVMReport(String name) {
File file = new File("C:\\Users\\Prithiv\\eclipse-workspace\\CucumberFrame\\Reports\\jvmreport");
Configuration config= new Configuration(file, "Boohoo");
config.addClassifications("OS", "Windows 11");
config.addClassifications("Tool", "Eclipse");
config.addClassifications("QA Tester", "K.S.Prithiv R1287");
config.addClassifications("Project", "LogInPage");
config.addClassifications("Date", "01 July 2022");

List<String> l= new ArrayList<String>();
l.add(name);

ReportBuilder report = new ReportBuilder(l, config);
report.generateReports();
	}

}
