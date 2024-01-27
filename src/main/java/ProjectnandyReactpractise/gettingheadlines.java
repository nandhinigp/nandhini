package ProjectnandyReactpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class gettingheadlines {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			
			driver.get("https://trends.google.co.in/trends/trendingsearches/daily?geo=IN&hl=en-US");
			
			Thread.sleep(2000);
			List<WebElement> lis=driver.findElements(By.xpath("//div[@class=\"details-top\"]"));
			System.out.println(lis.size());
			for(WebElement a1:lis)
			{
				System.out.println(a1.getText());
			//	System.out.println(a1.getSize());

			}
			
			

	}

}
