package ProjectnandyReactpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			//regsiter
			/*driver.get("https://crio-qkart-frontend-qa.vercel.app/register");
			
			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("nandhini");
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Nandy@25");
            driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("Nandy@25");
            driver.findElement(By.xpath("//button[text()=\"Register Now\"]")).click();  */
            
            //login
		driver.get("https://crio-qkart-frontend-qa.vercel.app/login");

            driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("nandhini");
            driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Nandy@25");
            driver.findElement((By.xpath("//button[text()=\"Login to QKart\"]"))).click();
            
          if(   driver.getCurrentUrl().contains("https://crio-qkart-frontend-qa.vercel.app/"))
          {
        	  System.out.println("login is succes");
          }
          else
        	  
          {
        	  System.out.println("login is failed");
        	  
        
          }
         Thread.sleep(4000);

       //searching product
          driver.get("https://crio-qkart-frontend-qa.vercel.app/");
       WebElement cl=   driver.findElement(By.xpath("(//input[@name='search'])[1]"));
          cl.click();
          cl.sendKeys("shoes");
          Thread.sleep(4000);
          List<WebElement> lis= driver.findElements(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-md-3 css-sycj1h\"]"));
          System.out.println("num of products"+lis.size());
          
          //adding product to cart
          driver.findElement(By.xpath("(//button[text()=\"Add to cart\"])[2]")).click();
          Alert alt =driver.switchTo().alert();
          alt.accept();
          driver.findElement(By.xpath("(//select[@id=\"uncontrolled-native\"])[1]")).click();
          List <WebElement> sel=driver.findElements(By.xpath("(//select[@id=\"uncontrolled-native\"])[1]/child::option"));
          for(WebElement a1 : sel)
          {
        	  if(a1.getText().equals("7"))
{
	             a1.click();
}
          }
         
          driver.findElement(By.xpath("(//button[text()=\"Add to cart\"])[1]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//*[name()=\"svg\" and @class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv\"])[4]")).click();
          Thread.sleep(4000);
          driver.findElement(By.xpath("//button[text()=\"Checkout\"]")).click();
          //adding address
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[text()=\"Add new address\"]")).click();
          driver.findElement(By.xpath("//textarea[@placeholder=\"Enter your complete address\"]")).sendKeys("Belgum bailhogal,nandhini,bagya");
         
          driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();
          Thread.sleep(2000);
          List <WebElement> add = driver.findElements(By.xpath("(//div[@class=\"MuiBox-root css-0\"])[1]/child::div/child::div[1]/child::p"));
          for(WebElement a1: add)
          {
        	  if(a1.getText().contains("Belgum bailhogal,nandhini,bagya"))
        	  a1.click();
          }
      //   driver.findElement(By.xpath("//p[text()='Belgum bailhogal,nandhini,bagya']")).click();
         Thread.sleep(4000);
         driver.findElement(By.xpath("//button[text()='PLACE ORDER']")).click();
         Thread.sleep(4000);
          if(driver.getCurrentUrl().contains("https://crio-qkart-frontend-qa.vercel.app/thanks"))
          {
        	  System.out.println("hurray correct");
          }
          else
          {
        	  System.out.println("oops wrong page ");
          }
          Thread.sleep(2000);

            
            
	}

}
