package Pomom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginom2 {
	public WebDriver driver;
	public loginom2(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//input[@name=\"sc1[Orderid]\"]")
	private WebElement userid;
	
	@FindBy(xpath="//input[@name=\"sc1[email]\"]")
	private WebElement emailid;
	
	@FindBy(xpath="(//span[text()='SUBMIT'])[1]")
	private WebElement submit;
	
	
	public WebElement userid()
	{
		return userid;
	}

	public WebElement emailid()
	{
		return emailid;
	}
	
	public WebElement submit()
	{
		return submit;
	}
}
