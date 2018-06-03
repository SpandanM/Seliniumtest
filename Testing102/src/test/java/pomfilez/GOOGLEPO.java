package pomfilez;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class GOOGLEPO extends  BasePage
	{

	public GOOGLEPO(WebDriver driver) {
super(driver)	;
}

		@FindBy(name="q")
		private WebElement searchTxtBx;
		public WebElement searchTxtBx() {
			return searchTxtBx;
			
		}
		
	}



