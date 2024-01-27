package Projectnandy.Projectnandy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class om1 {
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://returns-uat.bleckmann.com/consumer/Test/1");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@name=\"Consumername1\"]")).sendKeys("nandhini");
		driver.findElement(By.xpath("//input[@name=\"ConsumerShipStreet1\"]")).sendKeys("Banglore");
		driver.findElement(By.xpath("//input[@id=\"ConsumerFromShipHouseNumber\"]")).sendKeys("housenumber");
		driver.findElement(By.xpath("//input[@name=\"ConsumerFromShipPostalCode\"]")).sendKeys("nnnn");
		driver.findElement(By.xpath("//input[@name=\"ConsumerFromShipCity\"]")).sendKeys("city");
		driver.findElement(By.xpath("//span[text()=\"Select a Country\"]")).click();
		driver.findElement(By.xpath("//li[text() =\"BELGIUM\" ]")).click();
		
}
}
