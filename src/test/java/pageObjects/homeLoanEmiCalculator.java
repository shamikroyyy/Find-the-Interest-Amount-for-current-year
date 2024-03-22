package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utility.excelutility;

public class homeLoanEmiCalculator extends basePage {
	public homeLoanEmiCalculator(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//*[@id=\"year2024\"]")
WebElement year;

@FindBy(xpath="//*[@id=\"yearheader\"]")
WebElement yearInTable;

@FindBy(xpath="//*[@id=\"monthyear2024\"]/td/div/table")
WebElement month_details;
@FindBy(xpath="//li[@id='menu-item-3293']/a") 
WebElement homeEmi;
@FindBy(xpath="//tr[@class='row no-margin yearlypaymentdetails']") 
List<WebElement>rows;
@FindBy(xpath="//tr[@class='row no-margin yearlypaymentdetails'][1]//td") 
List<WebElement>cells;
	public void viewYear() {
		year.click();
	}
	
	public String viewMonth() {
		return month_details.getText();
	}
	
	public void scrollDown() throws InterruptedException {
	WebElement element = yearInTable;
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	Thread.sleep(5000);
	}
	
	public void excelPrint() throws IOException, InterruptedException {
		String path=System.getProperty("user.dir")+"\\TestData\\data.xlsx";
		excelutility ex= new excelutility(path);
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(3));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("menu-item-dropdown-2696"))));
		driver.findElement(By.id("menu-item-dropdown-2696")).click();
		driver.findElement(By.xpath("//a[@title = 'Home Loan EMI Calculator']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@class = 'noextras']/tbody/tr[@class = 'row no-margin yearlypaymentdetails']"))));
		int length=rows.size();
		System.out.println("The no of rows present in the excel are:"+length);
		for(int r=1;r<=length;r++) {
			for(int i =1;i<=7;i++)
			{
			String a=driver.findElement(By.xpath("//tr[@class='row no-margin yearlypaymentdetails']["+r+"]/td["+i+"]")).getText();
			ex.setCellData("Book1",r-1,i,a);
			}
 
		}
}
}
