package PageOfModelImplement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObjectPage 
{
    WebDriver driver;
	
	//**********Constructor*************
	public LoginObjectPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//***********locators***************
	By set_username=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By set_password=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By set_login=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	By set_info=By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a");
	By set_contactDetails=By.xpath("//a[text()='Contact Details']");
	By set_street1=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input");
	By set_city=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input");
	By set_stateName=(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input"));
	//By set_zip=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input");
	By SelectCountry=(By.xpath("//div[text()='-- Select --']"));
	By set_usa=(By.xpath("//div[text(='United States']"));
	
	
	
	
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
   
	 public void infoClick()
	   {
		   driver.findElement(set_info).click();
	   }
	 public void contactClick()
	 {
		 driver.findElement(set_contactDetails).click();
	 }
	 
	 public void streetAdd(String street)
	 {
		 driver.findElement(set_street1).sendKeys(street);
	 }
	
	 public void city(String cityname)
	 {
		 driver.findElement(set_city).sendKeys(cityname);
		 
	 }
	 
	 public void State(String statename)
	 {
		 driver.findElement(set_city).sendKeys(statename);
		 
	 }
	 
//	 public void zip(String number)
//	 {
//		 driver.findElement(set_zip).sendKeys("number");
//		 
//	 }
//	 
	 public void selectCountry(String  SSelectCountry)
	 {
		 driver.findElement(SelectCountry).click();
	 }
     
	 public void country(String  country)
	 {
		 driver.findElement(set_usa).click();
	 }
	 
	 public void telephone(String tnumber)
	 {
		 
	 }
     
}