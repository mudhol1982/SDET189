package ActionsExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		Actions action=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/howto/howto_js_rangeslide.asp");
		WebElement driverEle=driver.findElement(By.xpath("//div[@id='slidecontainer']/input"));
		action.moveToElement(driverEle).clickAndHold(driverEle).moveByOffset(60, 60).perform();
		Thread.sleep(100);
		action.moveToElement(driverEle).clickAndHold(driverEle).moveByOffset(-120, 0).perform();
				
}
}