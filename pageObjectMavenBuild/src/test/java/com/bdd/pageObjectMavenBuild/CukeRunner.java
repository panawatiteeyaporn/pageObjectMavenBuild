package com.bdd.pageObjectMavenBuild;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		format={"pretty", "html:target/cucumber-html-report"},
		features="src/test/resources"
		)

public class CukeRunner {
	
}
