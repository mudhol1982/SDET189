package ActionsExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling 
{

	public static void main(String args[]) throws InterruptedException
	{
//		ChromeDriver driver=new ChromeDriver();
//		Actions action=new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://google.com");
//		driver.findElement(By.name("q")).sendKeys("hello world" + keys.ELEMENT);
//		//WebElement elemnet=driver.findElement(By.xpath("//div/span[))");
//		Actions actions=new Actions(driver);
//		Thread.sleep(5000);
//		//action.scrollToElement(elemnet).perform();
//			
//		//Another Method
//		System.out.println(elemnet.getRect().getX());
//		System.out.println(elemnet.getRect().getY());
//		action.scrollByAmount(66, 235).perform();
//		
		//Using JavaScriptExecutor
		//((JavaScriptExecutor)driver.executeScript("window.scrollBy(100,100)"));
		
		//https://www.browserstack.com/guide/javascriptexecutor-in-selenium
	//	WebElement element=driver.findElement(By.linkText("any element"));
}
}