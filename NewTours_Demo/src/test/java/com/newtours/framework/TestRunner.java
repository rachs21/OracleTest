package com.newtours.framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


// runner class

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"com/newtours/framework/stepdefs"},
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:output/report.html", "html:output", "json:output/cucumber.json", "junit:output/cucumber.xml"},
		monochrome = true
		)


public class TestRunner {
	
//	@BeforeClass
//	public static void setup() {
//	    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//	    extentProperties.setReportPath("output/myreport.html");
//	}

	
	
	
}
