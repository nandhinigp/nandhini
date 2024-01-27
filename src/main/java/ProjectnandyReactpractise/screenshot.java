package ProjectnandyReactpractise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws IOException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//to get url
		driver.get("https://web-locators-static-site-qa.vercel.app/");
		
		driver.findElement(By.xpath("//p[text()='Screenshot']")).click();
		
		driver.findElement(By.xpath("(//a[text()=\"Access AUT\"])[1]")).click();
		TakesScreenshot st=(TakesScreenshot)driver;
		File fi= st.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fi,new File("/Projectnandy/screenshots/nandy.png"));
		
	}

}
