package com.syntax.cucumberproject.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/kilany/eclipse-workspace/cucumberProject/src/test/resources/Features/Login.feature"
, glue="")

public class LoginRunner {

}
