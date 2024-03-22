package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	WebDriver driver;
	public static WebDriverWait wait ;
	//it is acting as a constructor such that the same driver operates in every page
	public basePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendKeysElement(WebElement w,String input) {
		w.clear();
		w.sendKeys(Keys.BACK_SPACE);
		w.sendKeys(input);
	}

}
