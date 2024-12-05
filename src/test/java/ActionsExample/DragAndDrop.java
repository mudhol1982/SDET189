package ActionsExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String args[])
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryyi.com/draggable/");
		WebElement frame=driver.findElement(By.className("demo-frame"));
	    driver.switchTo().frame(frame);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();

}
}