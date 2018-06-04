package testsuites;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;

import library.BaseTest;
import pomfilez.GOOGLEPO;
import pomfilez.SearchPO;

public class Test1022 extends BaseTest  {

	public void testLinkedinLink() 
	{
		
		try {
			driver.get("https://www.google.com/");
			GOOGLEPO googlePO=new GOOGLEPO(driver);
			googlePO.searchTxtBx().sendKeys("linkedin"+Keys.ENTER);
			SearchPO searchPO=new SearchPO(driver);
			searchPO.verifyElement(searchPO.LinkedinLink());
			searchPO.LinkedinLink().click();
			System.out.println(driver.getTitle());
			String eTitle = "Sign Up | LinkedIn";
			wait.until(ExpectedConditions.titleContains(eTitle));
			String aTitle = driver.getTitle();
			Reporter.log("Title is displayed"+aTitle, true);
			//searchPO.verifyTitle(eTitle);
			Assert.assertEquals(aTitle, eTitle);
			
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail();
		}}}
