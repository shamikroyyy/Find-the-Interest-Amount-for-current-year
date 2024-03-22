package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage extends basePage{

	WebDriver driver;
		
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath="//*[@id=\"home-loan\"]")
WebElement Homeloan;

@FindBy(xpath="//*[@id=\"personal-loan\"]")
WebElement PersonalLoan;

@FindBy(xpath="//*[@id=\"car-loan\"]")
WebElement Carloan;

@FindBy(xpath="//*[@id=\"panel-7-1-0-0\"]/div/div/div/div/div/h5/a")
WebElement HomeLoanEmiCalculator;

@FindBy(xpath="//*[@id=\"panel-7-1-2-0\"]/div/div/div/div/div/h5/a")
WebElement LoanCalculator;

//@FindBy(xpath="//*[@id=\"loanamount\"]")
//WebElement loanAmount;
//
//@FindBy(xpath="//*[@id=\"loaninterest\"]")
//WebElement loanInterest;
//
//@FindBy(xpath="//*[@id=\"emicalculatorinnerform\"]/div[7]/div/div/div/div/div/label[1]")
//WebElement year;
//
//@FindBy(xpath="//*[@id=\"loanterm\"]")
//WebElement loanterm;
//
//@FindBy(xpath="//*[@id=\"year2024\"]")
//WebElement plussign;
//
//@FindBy(xpath="//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[1]/td[2]")
//WebElement principal;
//
//@FindBy(xpath="//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[1]/td[3]")
//WebElement interest;

public void clickHomeLoan(){
	Homeloan.click();
}
public void clickPersonalLoan() {
	PersonalLoan.click();
}
public void clickCarLoan() {
	Carloan.click();
}

public void clickHomeLoanEmiCalculator() {
	HomeLoanEmiCalculator.click();
}

public void clickLoanCalculator() {
	LoanCalculator.click();
	}


}

