package ProjectnandyReactpractise;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class foundername {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://en.wikipedia.org/wiki/Apple_Inc.");
		Thread.sleep(200);
		List<WebElement> lis=driver.findElements(By.xpath("(//tbody/tr[9]/child::td/child::div/child::ul)[1]/child::li/child::a"));
		lis.size();
		Thread.sleep(2000);
		for(WebElement a:lis)
		{
			System.out.println(a.getText());
		}
		
	}

}
