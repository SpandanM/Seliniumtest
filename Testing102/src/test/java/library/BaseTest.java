package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constants
{ 
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeMethod(alwaysRun=true)
	public void testLaunchBrowser() {
		System.setProperty(CHROME_KEY,CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, 20);
		
	}
	/*@AfterMethod(alwaysRun=true)
	public void testCloseBrowser() {
	driver.quit();
	}*/
	@AfterMethod
	
	
	public void closeBrowser(ITestResult r)	{
		//r.getStatus==1(TestPass)
		//r.getStatus==2(TestFail)
		if (r.getStatus()==2)
 {
			Photo.getScreenShot(driver, IMG_PATH);
			
		}
driver.quit();
	}
		
	
	
	
	
}

