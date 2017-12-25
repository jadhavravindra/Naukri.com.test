package UpdateNaukri.Framework.Naukri.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_credintial 
{
	WebDriver driver;
	//POM locator
	By login_id=By.xpath("//*[@id='emailTxt']");
	By log_password=By.xpath("//input[@name='PASSWORD']");
	By Submit_credintial=By.xpath("//input[@value='Login'][@id='sbtLog']");
	

	By login_id_F=By.xpath("//*[@id='usernameField']");
	By log_password_F=By.xpath("//input[@name='passwordField']");
	By Submit_credintial_F=By.xpath("//button[text()='Login']");

	//bypass call constructor
	public Login_credintial(WebDriver driver2) 
	{
		driver=driver2;
	}
	public void login(String ID,String PASS) throws InterruptedException
	{
		System.out.println("Hii This is test_inside");
		Thread.sleep(5000);
		try 
		{
			//enter Login ID
			WebElement logId= driver.findElement(login_id);
			logId.sendKeys(ID);
			System.out.println("Hii This is test_inside1");
			//enter password
			WebElement password=driver.findElement(log_password);
			password.sendKeys(PASS);
			System.out.println("Hii This is test_inside2");
			Thread.sleep(3000);
			//click on submit button
			WebElement submit=driver.findElement(Submit_credintial);
			submit.click();
			Thread.sleep(3000);
		} 
		catch(Exception e)
		{	
			//enter Login ID
			WebElement logId= driver.findElement(login_id_F);
			logId.sendKeys(ID);
			System.out.println("Hii This is test_inside1");
			//enter password
			WebElement password=driver.findElement(log_password_F);
			password.sendKeys(PASS);
			System.out.println("Hii This is test_inside2");
			Thread.sleep(3000);
			//click on submit button
			WebElement submit=driver.findElement(Submit_credintial_F);
			submit.click();
			Thread.sleep(3000);
		
		}
			
	}
}