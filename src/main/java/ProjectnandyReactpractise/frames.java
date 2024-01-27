package ProjectnandyReactpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//to get url
		driver.get("https://web-locators-static-site-qa.vercel.app/");
	    driver.findElement(By.xpath("//p[text()='Frames']")).click();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/button[1]/p")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/button[1]/p")).click();

	}

}
