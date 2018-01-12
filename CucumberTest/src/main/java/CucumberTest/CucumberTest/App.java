package CucumberTest.CucumberTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class App 
{
    public static void main( String args[] )
    {
    	int a;
    	System.out.println( "Hello World!" );
        C c=new C();
        Set<String> s=new HashSet<String>();
        String s1=new String("ABC");
        s.add(s1);
        s.add(s1);
        System.out.println(s.size());
        String d1="Test";
        String d2=new String("Test");
        System.out.println(d1.equals(d2));
        Vector vector = new Vector();
        
    }
}
