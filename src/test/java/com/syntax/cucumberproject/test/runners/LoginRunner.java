package com.syntax.cucumberproject.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features"
, glue=""
, monochrome=true
//, strict=true
,plugin= {"pretty", "html:Reports/test-output"}
, dryRun=false)

public class LoginRunner {

}


//{"src/test/resources/features"}

//Users/kilany/eclipse-workspace/cucumberProject/src/test/resources/Features/Login.feature