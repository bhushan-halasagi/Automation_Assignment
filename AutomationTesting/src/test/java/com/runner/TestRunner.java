package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features", glue = {
		"com.stepdefinitions" }, monochrome = true, plugin = { "pretty", "junit:target/cucumber-reports/cucumber.xml",
				"html:target/HTMLReports/report.html", "json:target/cucumber-reports/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, tags = "@tag or @app or @register ", dryRun = false)

public class TestRunner {

}
