package ProjectnandyReactpractise;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//to get url
		driver.get("https://web-locators-static-site-qa.vercel.app/");
	    driver.findElement(By.xpath("//p[text()='Windows']")).click();
	    driver.findElement(By.xpath("//p[text()=\"Launch New Window\"]")).click();
	    
	    Set<String> WindowHandles = driver.getWindowHandles();
	   Iterator nn = (Iterator) WindowHandles.iterator();
	   while(nn.hasNext())
	   {
		   String str = (String) nn.next();
		   driver.switchTo().window(str)  ;
		   if(driver.getCurrentUrl().equals("https://www.google.com/"));
		   {
			   driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("nan");
		   }
		   }
	   
	}

}
