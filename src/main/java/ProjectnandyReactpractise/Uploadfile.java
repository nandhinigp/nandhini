package ProjectnandyReactpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadfile {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//to get url
		driver.get("https://web-locators-static-site-qa.vercel.app/");
		
		
		driver.findElement(By.xpath("//p[text()='Upload']")).click();
		
		
		WebElement upload_file = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(2000);
		upload_file.sendKeys("C:\\Users\\user\\Pictures\\defaultemptyscreenshot.png");
		
	}
}
