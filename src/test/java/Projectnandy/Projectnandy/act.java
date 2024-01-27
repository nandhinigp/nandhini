package Projectnandy.Projectnandy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class act {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		Object obj=new Object();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 ewETUe\"]")).click();
		Thread.sleep(3000);
	   	driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		Thread.sleep(3000);
	   	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Banglore");

		
	}

}
