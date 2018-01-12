package CucumberTest.CucumberTest;

import java.util.*;

import org.apache.commons.collections.list.TreeList;

public class Collect {

	public static void main(String[] args) {
		// 
		//List<String> strings = new ArrayList<String>();
		List<String> strings = new TreeList();
				strings.add("lol");
				strings.add("cat");

				//Collections.sort(strings);
				for (String s : strings) {
				    System.out.println(s);
				}
				
				
				
				HashMap newmap = new HashMap();
			      
				   // populate hash map
				   newmap.put(1, "tutorials");
				   newmap.put(2, "point");
				   newmap.put(3, "is best");
				      
				   // create set view for the map
				   Set set=newmap.entrySet();
				      
				   // check set values
				   System.out.println("Set values: " + set);		
	}

}
