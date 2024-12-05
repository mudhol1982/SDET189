package ActionsExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JvaScriptExecutor 
{
	public static void main(String args[])
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("numpy ninja" +Keys.ENTER);
		
		//Actions right click
		Actions action=new Actions(driver);
		WebElement signInButton=driver.findElement(By.linkText("sign in"));
		action.contextClick(signInButton).perform();
		
		//JavaScript Executor Scroll
		((JavascriptExecutor)driver).executeScript("window.scrollBy(100,100");
	
}


}
