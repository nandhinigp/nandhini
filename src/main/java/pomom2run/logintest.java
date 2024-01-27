package pomom2run;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Pomom2.loginom2;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {
	
	WebDriver driver;

	//creating Tests
	@Test
	public void loginTestt() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://returns-uat.bleckmann.com/consumer/Test");
		//Thread.sleep(2000);
		
		loginom2 logPage=new loginom2(driver);
		
		logPage.userid().sendKeys("muddabhagyashree@gmail.com");
		Thread.sleep(2000);
		logPage.emailid().sendKeys("Bhagya@18");
		Thread.sleep(2000);
		logPage.submit().click();
		
		
		
		//verifying using TestNG Assertion
	//	Assert.assertEquals(true, myAccountPg.AccountTab().isDisplayed());
		
		
	}
	
	//@AfterMethod
	//public void closeBrowser()
	//{
		
	//	driver.close();
		
	//}

}
