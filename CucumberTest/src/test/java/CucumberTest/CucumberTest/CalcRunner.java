package CucumberTest.CucumberTest;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
//Runner Options to Run this Test After Conflict Resolve123
@CucumberOptions(features= {"E:\\Maven-Selenium-Cucumber\\CucumberTest\\target\\test-classes\\CucumberTest\\CucumberTest\\Calc.feature"},plugin = {"html:target/cucumber-html-report"},tags = {"@Smoke123"})
public class CalcRunner extends AbstractTestNGCucumberTests{ }
