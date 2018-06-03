package testsuites;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Test;

import library.BaseTest;
import pomfilez.GooglePO;
import pomfilez.SearchPO;






public class Test001 extends BaseTest {

	@Test
	public void testFacebookHome() {
	
		try {
		driver.get("https://www.google.com/");
		GooglePO googlePO=new GooglePO(driver);
		googlePO.searchTxtBx().sendKeys("facebook"+Keys.ENTER);
		SearchPO searchPO=new SearchPO(driver);
		searchPO.verifyElement(searchPO.facebookLink());
		searchPO.facebookLink().click();
		System.out.println(driver.getTitle());
		String eTitle = "Facebook – log in or sign up";
		wait.until(ExpectedConditions.titleContains(eTitle));
		String aTitle = driver.getTitle();
		Reporter.log("Title is displayed"+aTitle, true);
		//searchPO.verifyTitle(eTitle);
		Assert.assertEquals(aTitle, eTitle);
	}
		catch(Exception e) {
			Assert.fail();
		}

		
}
	
		
		
		
	}

	

