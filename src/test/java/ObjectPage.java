import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ObjectPage 
{
WebDriver driver;
	
	//**********Constructor*************
	ObjectPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//***********locators***************
	By set_username=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By set_password=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By set_login=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	
	//**************Action Methods*************
	public void userName(String user)
	{
		driver.findElement(set_username).sendKeys(user);
		
	}
	public void pWord(String password)
	{
		driver.findElement(set_password).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(set_login).click();
	}
}

