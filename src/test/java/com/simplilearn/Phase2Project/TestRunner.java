package com.simplilearn.Phase2Project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	monochrome= true,
	plugin = {"progress",
		       "html:build/report/html",
		       "junit:build/report/junit/cucumber-report.xml",
		       "json:build/report/json/cucumber-report.json"
		     },
	features= {"src/test/java/com/simplilearn/Phase2Project/Login.feature","src/test/java/com/simplilearn/Phase2Project/AddToCart.feature"},
	glue =     "com.simplilearn.Phase2Project"
)
public class TestRunner {

}
