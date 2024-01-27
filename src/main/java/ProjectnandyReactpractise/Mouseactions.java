package ProjectnandyReactpractise;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseactions {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();	
				
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
				//to get url
				driver.get("https://web-locators-static-site-qa.vercel.app/");
				
				driver.findElement(By.xpath("//p[text()='Mouse']")).click();
				//dragging
				WebElement drag=driver.findElement(By.xpath("//div[text()=\"Drag me around\"]"));
				Actions a1=new Actions(driver);
				a1.dragAndDropBy(drag, 250, 250).perform();
				WebElement drag1 =driver.findElement(By.xpath("//div[text()=\"Drag me to target\"]"));
				WebElement drop1=driver.findElement(By.xpath("//div[@class=\"box drop-target react-draggable\"]"));
				Actions a2= new Actions(driver);
				a2.dragAndDrop(drag1, drop1).perform();
				
				Thread.sleep(2000);
				
				WebElement n= driver.findElement(By.xpath("(//span[text()='7'])[1]\r\n"));
				Actions a3= new Actions(driver);
				a3.moveToElement(n).click().perform();
				
				Thread.sleep(1000);
				
				WebElement password=driver.findElement(By.xpath("//p[text()=\"Password\"]"));
				JavaScriptExecutor js<>=(JavaScriptExecutor)driver;
				Actions a4= new Actions(driver);
				a4.moveToElement(password).click().perform();
				password.sendKeys("nandy");

				
}
}
