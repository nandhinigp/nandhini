package om2details;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcasesom2 {
	
	public String url="https://returns-uat.bleckmann.com/consumer/Test";
	public WebDriver driver;
	@BeforeTest
public void openingchrome() throws InterruptedException

{
	 WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		Thread.sleep(200);
		

}
	@Test
	public void Testcase01() throws InterruptedException
	
	{
		//validating empty case 
		System.out.println("ashdkahdkaj");
		
	  WebElement di=	driver.findElement(By.xpath("(//span[text()='SUBMIT'])[1]"));
	   di.click();
		Thread.sleep(2000);
		
		if(driver.findElement(By.xpath("//span[text()='Whoops! Both fields should be filled in1.']")).isDisplayed())
		{
			System.out.println("empty case validation is sucessfull");
		}
		
	}
}
