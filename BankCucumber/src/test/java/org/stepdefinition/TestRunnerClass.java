package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "src/test/resources", 
glue = "org.stepdefinition",
monochrome = true,
dryRun=false, 
snippets = SnippetType.CAMELCASE,
tags = "@Sanity",
plugin = {"html:Report",
"junit:Report\\junitreport1.xml",
"json:Report\\jsonreport1.json"})
public class TestRunnerClass {

}
