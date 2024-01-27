package ProjectnandyReactpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//regsiter
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
		Thread.sleep(2000);
		List <WebElement> lis=driver.findElements(By.xpath("//div[@class=\"sg-col-inner\"]"));
		lis.size();
		System.out.println(lis);


	}

}
