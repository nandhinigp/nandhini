package Projectnandy.Projectnandy;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class start {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("src")).sendKeys("banglore");
		driver.findElement(By.id("dest")).sendKeys("chennai");
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		driver.findElement(By.xpath("//span[@class=\"dateText\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		


	}

}
