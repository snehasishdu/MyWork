package CucumberTest.CucumberTest;

import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\Maven-Selenium-Cucumber\\CucumberTest\\target\\test-classes\\CucumberTest\\CucumberTest\\outline.feature"},plugin = {"html:target/cucumber-html-report"}) 

public class CucumberTest extends AbstractTestNGCucumberTests{ }