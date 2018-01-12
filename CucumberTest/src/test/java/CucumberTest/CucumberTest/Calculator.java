package CucumberTest.CucumberTest;

import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Calculator {
	private int total;
	 
    public int add(int a, int b) {
        return a + b;
    }
   
    @Before("@SD1")
    public void beforeHook() {
    	System.out.println("Before Hook-Calculator");
    }
    @Given("^I want to use the Calculator")
    public void backgoundCalculator() throws Throwable {
        System.out.println("Background");
    }
    @Given("^I have a calculator$")
    public void initializeCalculator() throws Throwable {
        System.out.println("ugsdw");
    }
 
    @When("^I add (-?\\d+) and (-?\\d+)$")
    public void testAdd(int num1, int num2) throws Throwable {
        total = add(num1, num2);
    }
 
    @Then("^the result should be (-?\\d+)$")
    public void validateResult(int result) throws Throwable {
    	System.out.println("Total is"+total);
        //Assert.assertEquals(total, result);
    }
    @After("@SD1")
    public void aftereHook() {
    	System.out.println("After Hook-Calculator"+5/0);
    }
    
}
