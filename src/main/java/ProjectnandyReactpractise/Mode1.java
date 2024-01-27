package ProjectnandyReactpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mode1 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://returns-uat.bleckmann.com/consumer/2525828/1");
			
			driver.findElement(By.xpath("//input[@name='OrderId']")).sendKeys("Nandy123");
			Thread.sleep(1000);
			//first name ,mandatory 
			driver.findElement(By.xpath("//input[@id='Consumername1']")).sendKeys("Nandhini");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@id='Consumername2']")).sendKeys("GP");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@id='ConsumerEmail']")).sendKeys("nandhini.gundarai@apoyar.eu");
		    Thread.sleep(1000);
            //street name ,mandatory
		    driver.findElement(By.xpath("//input[@id='ConsumerShipStreet1']")).sendKeys("newyrotk");
		    Thread.sleep(1000);
            //house number mandatory
		    driver.findElement(By.xpath("//input[@name='ConsumerFromShipHouseNumber']")).sendKeys("223-a");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@id='Consumerphonenumber']")).sendKeys("9741650567");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@name=\"ConsumerFromShipPostalCode\"]")).sendKeys("2222");
		    Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='ConsumerFromShipCity']")).sendKeys("city");
		    Thread.sleep(1000);

            driver.findElement(By.xpath("//input[@name='Consumershipstate']")).sendKeys("state");
		    Thread.sleep(1000);
		   // using list
		   /* driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		    List<WebElement> lis= driver.findElements(By.xpath("//select[@id='ConsumerFromShipCountry']/child::option"));
		    Thread.sleep(1000);

		    for(WebElement sel :lis)
		    {
		    if(sel.getText().contains("BELGIUM"))
		    	sel.click();
		       System.out.println("correct contry is selected");
		    }
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		    Thread.sleep(2000);  */
		  //  WebElement ele=driver.findElement(By.xpath("//select[@class=\"form-control select-single select2-hidden-accessible\"]"));
		  //  Select sel=new Select(ele);
		   //.selectByVisibleText("BELGIUM");
		    driver.findElement(By.xpath("//span[text()='Select a Country']")).click();
			driver.findElement(By.xpath("//li[text() ='SPAIN' ]")).click();
			
		    Thread.sleep(2000);

           driver.findElement(By.xpath("(//button[@id='button1'])[2]")).click();
		    Thread.sleep(2000);

           driver.findElement(By.xpath("(//span[text()='Click Here to Continue'])[1]")).click();
		    Thread.sleep(4000);

           if(driver.findElement(By.xpath("(//div[@class='col-xs-12 col-sm-10 col-sm-offset-1 col-md-8 col-md-offset-2 col-lg-4 col-lg-offset-4'])[3]")).isDisplayed())
{
	System.out.println("return order id created ,please check ur mails ");
}
           else
           {
        	   System.out.println("Please check the logs for more infoo ");
           }

		    

	}

}
