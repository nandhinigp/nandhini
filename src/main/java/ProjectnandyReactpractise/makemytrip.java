package ProjectnandyReactpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000);

		WebElement el=driver.findElement(By.xpath("//span[text()='From']"));
		el.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Banglore");
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		act.keyDown(Keys.ENTER).build().perform();
		act.keyUp(Keys.ENTER).build().perform();
		
		WebElement el1=driver.findElement(By.xpath("//span[text()='To']"));
		el1.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Delhi");
		Thread.sleep(2000);
		Actions act1=new Actions(driver);
		act1.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		act1.keyDown(Keys.ENTER).build().perform();
		act1.keyUp(Keys.ENTER).build().perform();
		Thread.sleep(100);
		driver.findElement(By.xpath("//div[@class=\"DayPicker-Months\"]/child::div[1]/child::div[3]/child::div[4]/child::div[5]")).click();
		driver.findElement(By.xpath("//a[text()=\"Search\"]")).click();


	}

}
