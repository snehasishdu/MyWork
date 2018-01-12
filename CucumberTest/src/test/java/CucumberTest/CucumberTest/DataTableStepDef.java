package CucumberTest.CucumberTest;

import java.util.List;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class DataTableStepDef {
	private int total;
	 
    public int add(int a, int b) {
        return a + b;
    }
   
    @Before("@abcd")
    public void beforeHook() {
    	System.out.println("Before Hook");
    }
    @Given("^I am on Sign-Up page")
    public void backgoundCalculator() throws Throwable {
        System.out.println("Background");
    }
    @When("^I enter valid data on the page$") 
    public void enterData(DataTable table){ 
       //Initialize data table 
    	System.out.println("Inside When");
       List<List<String>> data = table.raw();
       //Enter data
       System.out.println(data.get(1).get(2));
       System.out.println(data.get(1).get(1));
       System.out.println(data.get(2).get(1));
       System.out.println(data.get(3).get(1));     
       System.out.println(data.get(4).get(1)); 
       System.out.println(data.get(5).get(1)); 
       
       
    } 
 
    @Then("^the user registration should be successful.$")
    public void validateResult() throws Throwable {
    	System.out.println("Inside Then");
        //Assert.assertEquals(total, result);
    }
    @After("@abcd")
    public void aftereHookDataTable() {
    	System.out.println("After Hook-DataTable");
    }
    
}