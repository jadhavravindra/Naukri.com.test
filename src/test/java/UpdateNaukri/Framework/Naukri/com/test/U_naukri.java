package UpdateNaukri.Framework.Naukri.com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class U_naukri 
{
	WebDriver driver;
	String ID="ravindrajadhav841@gmail.com";
	String PASS="Ravindra@20";
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.out.println("ExtentReport");
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("NaukriReport.html");
		//htmlReporter.setAppendExisting(true);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setReportName("Build-1224");
		htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Naukri-Ravindra-Profile");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Naukri.com.Report");
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		test = extent.createTest("Naukri.Profile Testing Report");
		test.pass("Regrssion test");
		
		System.out.println("Hii This is Before test ");
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver=new ChromeDriver();
		test.log(Status.PASS, "Succssfully launched my Browser");
		driver.get("https://www.naukri.com/nlogin/login");
		//driver.get("https://my.naukri.com/Profile/edit?id=&altresid=");
		test.log(Status.PASS, "Naukri Site opened");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void f() throws InterruptedException
	{
		try 
		{
			Login_credintial lc=new Login_credintial(driver);
			lc.login(ID,PASS);
			test.log(Status.PASS, "Successfully Signed up");
		} 
		catch (Exception e) 
		{
			test.log(Status.FAIL, "failed logged in");
		}
		try 
		{
			Update u=new Update(driver);
			u.updateok();
			test.log(Status.PASS, "Ravindra Your profile is Successfully Updated");
		} 
		catch (Exception e) 
		{
			test.log(Status.FAIL, "Failed update profile");
		}
			}
	@AfterTest
	public void exit() throws InterruptedException
	{
		System.out.println("Hii This is after test ");
		Thread.sleep(5000);
		driver.quit();
		extent.flush();

	}
}
