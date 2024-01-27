package Projectnandy.Projectnandy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		
	       List<WebElement> allLinks = driver.findElements(By.cssSelector("a"));
	        
	        // Printing the href attribute of each link
	       
	       // for (WebElement link : allLinks) {
	         //   System.out.println(link.getAttribute("href"));
	        //}
	       for(int i=0;i<allLinks.size();i++)
	       {
	    	   System.out.println(allLinks.get(i).getAttribute("href"));
	       }
	}

}
