package ProjectnandyReactpractise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowshandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://crio-qkart-frontend-qa.vercel.app/login");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//a[text()='Privacy policy']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		Set <String> str1= driver.getWindowHandles();
	  	Iterator<String> str2 = str1.iterator();
	         String w1=  str2.next();
	       String w2=  str2.next();
	       String w3=  str2.next();
	       String w4=  str2.next();
	       driver.switchTo().window(w3);
	       driver.switchTo().window(w2);
	       driver.switchTo().window(w1);
	       driver.switchTo().window(w4);
	       
		
		
		}
}