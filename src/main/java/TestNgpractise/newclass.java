package TestNgpractise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class newclass {
	@Test
    
	
	public void display1() {
		
		System.out.println("method 1");

	}
	
    @AfterClass

   public void display2() {
	   
	System.out.println("method 2");   
	
   }
	@Test
	 public void display8() {
		   
			System.out.println("display the methods before method ");   
			
	
}
}



//@before suit,@before test,@before class ,@before method 
//@test
//@after method,@after class,@after test ,@after suit 
//before class









//before method means before every method it will execute 
//@test consider it has testng case.
//after method 
//before class once it will executes 
//after class after executing all the methods at the end it will execute 

//before test  meaans ,it will run before all the class (testng xml file )
//according to testng file executed
//after test same thing 


//@before suit completes suit ,means before things will executes 


