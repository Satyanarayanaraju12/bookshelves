package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManagerReport {
	public static ExtentReports report;
	public static ExtentReports getReportInstance(){

		if(report== null){
			ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/Report.html");
			report=new ExtentReports();
			report.attachReporter(htmlReporter);
		}

		return report;
	}

}
