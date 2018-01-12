package CucumberTest.CucumberTest;

import java.util.Set;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class SDSplit{
	public static void main(String args[]){  
		String s1="java|string|javaabc|1java|java|boy"; 
		int count = 0;
		String[] words=s1.split("\\|");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		if(w.equals("java")) {
			count++;
		}
		}  
		System.out.println(count);
		}


}
