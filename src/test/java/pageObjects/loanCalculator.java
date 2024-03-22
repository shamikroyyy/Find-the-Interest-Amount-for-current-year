package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loanCalculator extends basePage{
	public loanCalculator(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath="//*[@id=\"loanamount\"]")
		WebElement loanamount;

		@FindBy(xpath="//*[@id=\"loaninterest\"]")
		WebElement loaninterest;

		@FindBy(xpath="//*[@id=\"loanterm\"]")
		WebElement loantenure;

		@FindBy(xpath="//*[@id=\"loanfees\"]")
		WebElement loanfees;

		@FindBy(xpath="//*[@id=\"loanamountslider\"]")
		WebElement loanamountSlider;

		@FindBy(xpath="//*[@id=\"loaninterestslider\"]")
		WebElement loaninterestSlider;

		@FindBy(xpath="//*[@id=\"loantermslider\"]")
		WebElement loantenureslider;

		@FindBy(xpath="//*[@id=\"loanfeesslider\"]")
		WebElement loanfeesslider;
		
		@FindBy(xpath="//*[@id=\"ltermwrapper\"]/div[1]/div/div/div/div/div/label[1]")
		WebElement year;
		
		@FindBy(xpath="//*[@id=\"ltermwrapper\"]/div[1]/div/div/div/div/div/label[2]")
		WebElement month;
		
		@FindBy(xpath="//*[@id=\"loantermsteps\"]/span[1]/span")
		WebElement yearsliderLower;
		
		@FindBy(xpath="//*[@id=\"loantermsteps\"]/span[7]/span")
		WebElement yesrsliderUpper;
		
		@FindBy(xpath="//*[@id=\"loantermsteps\"]/span[1]/span")
		WebElement monthsliderLower;
		
		@FindBy(xpath="//*[@id=\"loantermsteps\"]/span[7]/span")
		WebElement monthsliderUpper;
		
		@FindBy(xpath="//*[@id=\"loan-amount-calc\"]/a[1]")
		WebElement LoanAmountCalculator;
		
		@FindBy(xpath="//*[@id=\"ltermwrapper\"]/div[1]/div/div/div/div/div/label[1]")
		WebElement yearLAC;
		
		@FindBy(xpath="//*[@id=\"ltermwrapper\"]/div[1]/div/div/div/div/div/label[2]")
		WebElement monthLAC;
		
		@FindBy(xpath="//*[@id=\"ltermwrapper\"]/div[1]/label")
		WebElement loan_tenure_text;
		
		@FindBy(xpath="//*[@id=\"loantermsteps\"]/span[1]/span")
		WebElement yearsliderLowerLAC;
		
		@FindBy(xpath="//*[@id=\"loantermsteps\"]/span[7]/span")
		WebElement yesrsliderUpperLAC;
		
		@FindBy(xpath="//*[@id=\"loantermsteps\"]/span[1]/span")
		WebElement monthsliderLowerLAC;
		
		@FindBy(xpath="//*[@id=\"loantermsteps\"]/span[7]/span")
		WebElement monthsliderUpperLAC;


			public void displayloanamount() {
				System.out.println(loanamount.isDisplayed()); 
			}
			public void displayloaninterest() {
				System.out.println(loaninterest.isDisplayed());	
			}
			public void displayloantenure() {
				System.out.println(loantenure.isDisplayed());
			}
			public void displayloanfees() {
				System.out.println(loanfees.isDisplayed());	
				}
			public void displayloanamountSlider() {
				System.out.println(loanamountSlider.isDisplayed());
			}
			public void displayloaninterestSlider() {
				System.out.println(loaninterestSlider.isDisplayed());
			}
			public void displayloantenureslider() {
				System.out.println(loantenureslider.isDisplayed());
			}
			public void displayloanfeesslider() {
				System.out.println(loanfeesslider.isDisplayed());
			}
			
			public void scrollDown() throws InterruptedException {
				WebElement element = loan_tenure_text;
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(5000);
				}
			
			public void yearScale() {
				year.click();
				String u=yesrsliderUpper.getText();
				String l=yearsliderLower.getText();
				System.out.println("Scale for loan tenure in year for loan calculator"+"("+l+","+ u+")");
			}
			
			public void monthScale() {
				month.click();
				String u=monthsliderUpper.getText();
				String l=monthsliderLower.getText();
				System.out.println("Scale for loan tenure in month for loan calculator"+"("+l+","+ u+")");
			}
			
			public void clickLoanAmountCalculator() {
				LoanAmountCalculator.click();
			}
			public void yearScaleLAC() {
				yearLAC.click();
				String u=yesrsliderUpperLAC.getText();
				String l=yearsliderLowerLAC.getText();
				System.out.println("Scale for loan tenure in year for loan account calculator"+"("+l+","+ u+")");
			}
			public void monthScaleLAC() {
				monthLAC.click();
				String u=monthsliderUpperLAC.getText();
				String l=monthsliderLowerLAC.getText();
				System.out.println("Scale for loan tenure in month for loan amount calculator"+"("+l+","+ u+")");
			}
}
