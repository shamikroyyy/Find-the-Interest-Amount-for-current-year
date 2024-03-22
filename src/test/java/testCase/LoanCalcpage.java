package testCase;

import java.io.IOException;
import org.testng.annotations.Test; 
import pageObjects.HomePage;
import pageObjects.loanCalculator;
import testBase.baseClass;

public class LoanCalcpage extends baseClass{
	@Test(priority = 0 )
	public void UICheckForTextbox() throws IOException, InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.clickLoanCalculator();
		loanCalculator lc=new loanCalculator(driver);
		lc.displayloanamount();
		lc.displayloaninterest();
		lc.displayloantenure();
		lc.displayloanfees();
		
	}
	@Test(priority = 1 )
	public void UICheckForScales() throws IOException, InterruptedException {
		loanCalculator lc=new loanCalculator(driver);
		lc.displayloanamountSlider();
		lc.displayloaninterestSlider();
		lc.displayloantenureslider();
		lc.displayloanfeesslider();
	}
	@Test(priority = 2 )
	public void checkInScaleForEmiCalculator() throws IOException, InterruptedException {
		loanCalculator lc=new loanCalculator(driver);
		lc.scrollDown();
		lc.yearScale();
		captureScreen("Scale for loan tenure in year for loan calculator");
		lc.monthScale();
		captureScreen("Scale for loan tenure in month for loan calculator");
		
	}
	@Test(priority=3)
	public void checkInScaleForLoanAmountCalculator() throws IOException, InterruptedException {
		loanCalculator lc=new loanCalculator(driver);
		lc.clickLoanAmountCalculator();
		lc.scrollDown();
		lc.yearScaleLAC();
		captureScreen("Scale for loan tenure in year for loan amount calculator");
		lc.monthScaleLAC();
		captureScreen("Scale for loan tenure in month for loan amount calculator");
		driver.quit();
	}
}
	
