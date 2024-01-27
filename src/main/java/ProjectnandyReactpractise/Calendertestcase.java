package ProjectnandyReactpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendertestcase {
	WebDriver driver=new ChromeDriver();
	
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//to get url
		driver.get("https://calendar.google.com/calendar/u/0/r?pli=1");
		
	}
	public void creatingtask()
	{
	 driver.findElement(By.xpath("(//h2[@jsname=\"KpB2Ud\"])[23]")).click();
	 }

}
