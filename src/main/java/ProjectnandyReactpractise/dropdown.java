package ProjectnandyReactpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//to get url
		driver.get("https://web-locators-static-site-qa.vercel.app/");
		driver.findElement(By.xpath("//p[text()='Dropdown']")).click();
		//dropdown single select
		WebElement dropdown =driver.findElement(By.xpath("(//select[@class=\"dropdown\"])[1]"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Greece");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Multi Select Dropdown\"]")).click();
		WebElement multidropdown= driver.findElement(By.xpath("(//select[@class=\"multi\"])[1]"));
		Select s1= new Select(multidropdown);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
	//without select class
     driver.findElement(By.xpath("//span[text()=\"Dropdown without \"]")).click();
     Thread.sleep(4000);
     driver.findElement(By.xpath("//p[text()=\"Select country\"]")).click();
     
     List<WebElement> listoptions = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/child::li"));
     for(WebElement a1:listoptions)
     {
    	 if(a1.getText().equals("Brazil"))
    	 {
    		 a1.click();
    	 }
     }
     
     
	}

}
