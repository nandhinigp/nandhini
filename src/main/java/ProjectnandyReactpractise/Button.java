package ProjectnandyReactpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://web-locators-static-site-qa.vercel.app/");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//p[text()='Button']")).click();
			//dimneshion 
			Dimension d =	driver.findElement(By.xpath("//p[text()='Click this button']")).getSize();
			int height =d.getHeight();
			int widtth = d.getWidth();
			System.out.println(height);
			System.out.println(widtth);
            driver.findElement(By.xpath("//p[text()='Click this button']")).click();
            driver.findElement(By.xpath("//p[text()= ' Reset ']")).click();
			
			

	}

}
