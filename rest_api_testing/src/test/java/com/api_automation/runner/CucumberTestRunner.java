package com.api_automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
                    //feature files path 
                    features = "FeatureFiles",

                    //step Definitions & hooks path
                    glue = "com.api_automation.steps",

                    //dryRun is for cross checking code syntaxes
                    dryRun = false,

                    //monochrome is for console clear view
                    monochrome = true,

                    //plugin is for reports, pretty html reports path
                    plugin = {"pretty","html:logs-reports/cucumber-core-html-report.html"},

                    //Add execution tags here, default value is @RegressionTest
                    tags = "@RegressionTest"
                )
public class CucumberTestRunner extends AbstractTestNGCucumberTests
{
}
