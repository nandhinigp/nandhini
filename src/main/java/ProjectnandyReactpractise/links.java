package ProjectnandyReactpractise;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://returns-uat.bleckmann.com/consumer/2525828/1");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//a[text()='link1']")).click();
          Thread.sleep(3000);

		 Set<String> s1 = driver.getWindowHandles();
		    System.out.println("Child window handle is" + s1);
		    Iterator<String> i1 = s1.iterator();
		    while(i1.hasNext())
		    {
		    String str=i1.next();
		    driver.switchTo().window(str);
	          Thread.sleep(2000);

		    if(driver.getCurrentUrl().contains("https://www.bleckmann.com/"))
{
	         System.out.println("we are in correct path");
	         break;
	         
}

          	

		    }
		    System.out.println("Child window handle is" + s1);
		    Iterator<String> i2 = s1.iterator();
		    while(i2.hasNext())
		    {
		    String str1=i2.next();
		    driver.switchTo().window(str1);
	          Thread.sleep(2000);

		    if(driver.getCurrentUrl().contains("https://returns-uat.bleckmann.com/consumer/2525828/1"))
{
	         System.out.println("back into login page");
	         break;
	         
}
		    }
	}
}
	


