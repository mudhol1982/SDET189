package PageOfModelImplement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class InfoSetObject 
{

	WebDriver driver;
	
	public InfoSetObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By set_info=By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a");
	
	
	//Action Method
	 public void infoClick()
	   {
		   driver.findElement(set_info).click();
	   }
	

}