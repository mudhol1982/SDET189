package PageOfModelImplement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCase 
{

	WebDriver driver;
	
	
	@BeforeClass	
	 void setUp()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@Test
	void loginSetUp()
	{
		LoginObjectPage pol = new LoginObjectPage(driver);
		pol.userName("Admin");
		pol.pWord("admin123");
		pol.clickLogin();
		pol.infoClick();
		pol.contactClick();
		pol.streetAdd("HamptonCave");
		pol.city("Atlanta");
		pol.State("Georgia");
		//pol.zip("56742");
	}
      
      

//	@AfterClass
//	void tearDown()
//	{
//		
//	driver.quit();
//}
}
