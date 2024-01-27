package ProjectnandyReactpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstprogram {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//to get url
		driver.get("https://web-locators-static-site-qa.vercel.app/");
		//to click
		driver.findElement(By.xpath("//p[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Click here to enter your name here\"]")).sendKeys("Nandhini");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"White\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"White\"]")).sendKeys("bagya");
		
		//practise last two things
		boolean nan=driver.findElement(By.xpath("//input[@placeholder=\"55\"]")).isEnabled();
		System.out.println(nan);
		
		
		
	}

}
