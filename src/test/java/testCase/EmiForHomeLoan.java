package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.homeLoanEmiCalculator;
import testBase.baseClass;

public class EmiForHomeLoan extends baseClass{
@Test(priority=0)
	public void YearOnYearDetailsAndStoreInExcel() throws IOException, InterruptedException{
		HomePage hp=new HomePage(driver);
		hp.clickHomeLoanEmiCalculator();
		homeLoanEmiCalculator hl=new homeLoanEmiCalculator(driver);
		hl.scrollDown();
		captureScreen("emi_for_home_loan");
		hl.excelPrint() ;
		driver.quit();
		}
		
}
