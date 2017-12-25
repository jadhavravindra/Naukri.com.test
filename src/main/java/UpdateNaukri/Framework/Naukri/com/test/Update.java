package UpdateNaukri.Framework.Naukri.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Update 
{
	WebDriver driver;
	//POM locator
	By View_and_Update=By.xpath("//b[text()='View and Update Profile']");
	By Edit=By.xpath("//*[@href='/Profile/edit?id=&altresid=']");
	By Changes=By.id("title");
	By Save=By.xpath("//*[@type='submit']");
	
	public Update(WebDriver driver2) 
	{
		driver=driver2;
	}

	public void updateok() throws InterruptedException
	{
		System.out.println("Hii This is test_inside4");
	//click on View and Update Profile button
			WebElement update=driver.findElement(View_and_Update);
			update.click();
			Thread.sleep(3000);
			System.out.println("Hii This is test_inside5");
			//to edit profile
			WebElement edit=driver.findElement(Edit);
			edit.click();
			Thread.sleep(3000);
			System.out.println("Hii This is test_inside6");
			WebElement change=driver.findElement(Changes);
			change.sendKeys(".");
			System.out.println("Hii This is test_inside7");
			WebElement save=driver.findElement(Save);
			save.click();
}
}