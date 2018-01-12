package CucumberTest.CucumberTest;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.api.java.en.Given; 
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When; 


public class CucumberTest1 { 
	WebDriver driver;
	
   @Given("^I am on Facebook login page$") 
   public void goToFacebook() throws InterruptedException { 
	   int i=5;
	   System.out.println("Hello World !!"+"Inside Given");
	   
   }
	
   @When("^I enter username as \"(.*)\"$") 
   public void enterUsername(String arg1) {   
	   System.out.println("Hello World !!"+"Inside When - User"+arg1);
   }
	
   @When ("^I enter password as \"(.*)\"$") 
   public void enterPassword(String arg1) {
	   System.out.println("Hello World !!"+"Inside When - Password"+arg1);
   } 
	
   @Then("^Login should fail$") 
   public void checkFail() {  
	   System.out.println("Hello World !!"+"Fail");
   }
	
   @Then("^Relogin option should be available$") 
   public void checkRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
            System.out.println("Test2 Pass"); 
      } else { 
         System.out.println("Test2 Failed"); 
      } 
      driver.close(); 
   }
} 