package ProjectnandyReactpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboradoperations {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			//to get url
			driver.get("https://web-locators-static-site-qa.vercel.app/");
			driver.findElement(By.xpath("//p[text()='Keyboard Operations']")).click();
			WebElement drag = driver.findElement(By.xpath("//div[text()=\"Copy me and paste me in the below box\"]"));
		    Actions act=new Actions(driver);
			act.click(drag).perform();
			act.keyDown(Keys.CONTROL);
			act.sendKeys("c");
			act.keyUp(Keys.CONTROL);
			act.build().perform();
			act.sendKeys(Keys.TAB);
			act.keyDown(Keys.CONTROL);
			act.sendKeys("v");
			act.keyUp(Keys.CONTROL);
			act.build().perform();
	}

}
