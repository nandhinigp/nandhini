package ProjectnandyReactpractise;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubWebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(200);

		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[text()='APPLE']")).click();
		Thread.sleep(5000);

		List <WebElement> lis =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		Thread.sleep(2000);
		System.out.println(lis.size());
		
		List <WebElement> lis1 =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		Thread.sleep(200);

		
		
		for(WebElement ele: lis1)
		{
			System.out.println(ele.getText());
		}

     driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Black, 128 GB)']")).click();
    Set <String> str1= driver.getWindowHandles();
      Iterator<String> str2 = str1.iterator();
         String parent=  str2.next();
       String child=  str2.next();
      driver.switchTo().window(parent);
      driver.switchTo().window(child);
      
      System.out.println(parent);
      System.out.println(child);
      Thread.sleep(2000);

      
      
	}

}
