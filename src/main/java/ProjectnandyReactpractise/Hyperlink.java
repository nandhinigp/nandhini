package ProjectnandyReactpractise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();	
			
			// implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			//to get url
			driver.get("https://web-locators-static-site-qa.vercel.app/");
			driver.findElement(By.xpath("//p[text()='Hyperlink']")).click();
			
			driver.findElement(By.xpath("//a[text()='Crio.do']")).click();
			driver.navigate().back();			
			boolean b= driver.findElement(By.xpath("//p[text()=' Non - Clickable ']")).isEnabled();
			System.out.println(b);
			boolean bq= driver.findElement(By.xpath("//p[text()=' Non - Clickable ']")).isDisplayed();
			System.out.println(bq);
           // broken link
			driver.findElement(By.xpath("//a[text()='Find out how many links are available']")).click();
			Thread.sleep(3000);
			List<WebElement> hyperlinkcount=driver.findElements(By.xpath("//a")); 
			System.out.println(hyperlinkcount.size());
			driver.navigate().back();			

			driver.findElement(By.xpath("//a[text()='Broken Link']")).click();
			if(driver.findElement(By.xpath("//h1[text()=\"404\"]")).isDisplayed())
			{
				System.out.println("page is broken");
			}
			
			
			
			
			
			
			


			
	}

}
