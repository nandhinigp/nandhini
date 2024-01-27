package ProjectnandyReactpractise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		// implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//to get url
		driver.get("https://web-locators-static-site-qa.vercel.app/");
		
		driver.findElement(By.xpath("//p[text()='Alerts']")).click();
		driver.findElement(By.xpath("//p[text()=\"Show Alert\"]")).click();
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		
		// alt.accept();
        alt.dismiss();		
        
        
        driver.findElement(By.xpath("//p[text()=\"Add Remarks\"]")).click();
        Thread.sleep(2000);
        Alert alt1=driver.switchTo().alert();
        alt1.sendKeys("nandhini");
        alt1.accept();
		
	}

}
