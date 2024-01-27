package Projectnandy.Projectnandy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/search?q=amazon&rlz=1C1RXQR_enIN1061IN1061&oq=amazon&gs_lcrp=EgZjaHJvbWUqFQgAEAAYQxiDARjjAhixAxiABBiKBTIVCAAQABhDGIMBGOMCGLEDGIAEGIoFMhgIARAuGEMYgwEYxwEYsQMY0QMYgAQYigUyEggCEAAYQxiDARixAxiABBiKBTISCAMQABhDGIMBGLEDGIAEGIoFMgwIBBAAGEMYgAQYigUyDAgFEAAYQxiABBiKBTINCAYQABiDARixAxiABDIGCAcQBRhA0gEINTA0OGowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
		
		String name =driver.findElement(By.xpath("(//span[@class='VuuXrf'])[1]")).getText();
		System.out.println(name);
		if(name.equalsIgnoreCase("Amazon.com") || name.equalsIgnoreCase("Amazon.in"))
		{
			System.out.println("print amazon.com");
				
		}else
		{
			System.out.println("Testcase failed");
		}
	

}
}