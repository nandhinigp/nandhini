package ProjectnandyReactpractise;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class settingsmode1page {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://returns-uat.bleckmann.com/consumer/2525828/1");
		
		driver.findElement(By.xpath("//a[text()='Track my Return']")).click();
	    Thread.sleep(2000);
	    //url validation
	    if(driver.findElement(By.xpath("(//div[@class='col-xs-12 col-sm-10 col-sm-offset-1 col-md-8 col-md-offset-2 col-lg-6 col-lg-offset-3'])[3]")).isDisplayed())
	    		{
	    	    System.out.println("we are in trackking page");
	    		}
	    else
	    {
	    	System.out.println("please check url ");
	    }
	    //empty validation
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='btn btn-info btn-raised searchtracking']")).click();
	    if(driver.findElement(By.xpath("//div[text()='Please enter your Tracking number or Order number']")).isDisplayed())
	    {
	    	System.out.println("enter trackking number,its empty");
	    }
	    
	    Thread.sleep(2000);
//wonng id validation
	     driver.findElement(By.xpath("//input[@placeholder=\"Where is My Return\"]")).sendKeys("BBBb");
		    Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@class='btn btn-info btn-raised searchtracking']")).click();

	    if(driver.findElement(By.xpath("//div[text()='No order / tracking n° found with provided info']")).isDisplayed())
	    {
	    	System.out.println("please enter correct trackking number ");
	    }		
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[text()='Back'])[2]")).click();
	    System.out.println("you will be login screen ");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Track my Return']")).click();
	    Thread.sleep(2000);

//correct one 
	     driver.findElement(By.xpath("//input[@placeholder=\"Where is My Return\"]")).sendKeys("1000077119936");

         driver.findElement(By.xpath("//button[@class='btn btn-info btn-raised searchtracking']")).click();
         
         
         


	}

}
