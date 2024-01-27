package ProjectnandyReactpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autocomplete {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//to get url
		driver.get("https://web-locators-static-site-qa.vercel.app/");

		driver.findElement(By.xpath("//p[text()='Auto-complete']")).click();
		WebElement text=driver.findElement(By.xpath("//input[@data-test=\"search-input\"]"));
				text.click();
				text.sendKeys("apple");
				Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);

		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		//act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
        

		
		
		}

}
