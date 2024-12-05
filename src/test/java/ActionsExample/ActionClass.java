package ActionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass 
{

	public static void main(String args[])
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryyi.com/draggable/");
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		while(true)
		{
			action.moveToElement(ele).clickAndHold(ele).moveByOffset(100, 100).perform();
			action.moveToElement(ele).clickAndHold(ele).moveByOffset(-100, -100).perform();
			
		}
	}
}
