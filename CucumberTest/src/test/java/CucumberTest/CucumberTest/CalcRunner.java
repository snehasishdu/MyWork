package CucumberTest.CucumberTest;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
//Runner Options to Run this Test
@CucumberOptions(features= {"E:\\Maven-Selenium-Cucumber\\CucumberTest\\target\\test-classes\\CucumberTest\\CucumberTest\\Calc.feature"},plugin = {"html:target/cucumber-html-report"},tags = {"@Smoke"})
public class CalcRunner extends AbstractTestNGCucumberTests{ }