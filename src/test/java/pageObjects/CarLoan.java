package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarLoan extends basePage {
	public CarLoan(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"loanamount\"]")
	WebElement loanAmount;

	@FindBy(xpath="//*[@id=\"loaninterest\"]")
	WebElement loanInterest;

	@FindBy(xpath="//*[@id=\"emicalculatorinnerform\"]/div[7]/div/div/div/div/div/label[1]")
	WebElement year;

	@FindBy(xpath="//*[@id=\"loanterm\"]")
	WebElement loanterm;
	
	@FindBy(xpath="//*[@id=\"yearheader\"]")
	WebElement yearInTable;

	@FindBy(xpath="//*[@id=\"year2024\"]")
	WebElement plussign;

	@FindBy(xpath="//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[1]/td[2]")
	WebElement principal;

	@FindBy(xpath="//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[1]/td[3]")
	WebElement interest;
	
	public void sendKeysLA(String input) {
		sendKeysElement(loanAmount,input);
	}
	
	public void sendKeysLI(String input) {
		sendKeysElement(loanInterest,input);
	}
	
	public void clickYear() {
		year.click();
	}
	
	public void sendKeysLT(String input) {
		sendKeysElement(loanterm,input);
	}

	public void clickplussign() {
		plussign.click();
	}
	
	public void scrollDown() throws InterruptedException {
		WebElement element = yearInTable;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);
		}
	public String principal() {
		return principal.getText();
	}
	
	public String interest() {
		return interest.getText();
	}
}
