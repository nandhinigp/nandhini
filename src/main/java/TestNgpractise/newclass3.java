package TestNgpractise;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class newclass3 {
	
	@Test
	public void display5() {
		
		System.out.println("method 5");

	}
	@BeforeSuite
	
   public void display6() {
	   
	System.out.println("method 6");   
	
   }
}



