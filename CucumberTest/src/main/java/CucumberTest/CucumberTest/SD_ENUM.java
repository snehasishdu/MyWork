package CucumberTest.CucumberTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import org.testng.internal.PropertiesFile;

public class SD_ENUM {

	public static void main(String[] args) throws IOException {
		String s1 = null;
		FileInputStream fs=new FileInputStream("E:\\Maven-Selenium-Cucumber\\CucumberTest\\src\\main\\java\\CucumberTest\\CucumberTest\\SD.properties");
		Properties p=new Properties();
		p.load(fs);
		Set<String> s=p.stringPropertyNames();
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
		s1=i.next();
		System.out.println(s1+","+p.getProperty(s1));
		}
	}

}
