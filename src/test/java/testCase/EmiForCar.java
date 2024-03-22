package testCase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pageObjects.CarLoan;
import pageObjects.HomePage;
import testBase.baseClass;

public class EmiForCar extends baseClass{
@Test
	public void operations() throws InterruptedException, IOException {
		p=new Properties();
		FileReader file =new FileReader(".//src/test/resources/config.properties");
		p.load(file);
		HomePage hp=new HomePage(driver);
		hp.clickCarLoan();
		CarLoan cl=new CarLoan(driver);
		cl.sendKeysLA(p.getProperty("CarLoanAmount"));
		cl.sendKeysLI(p.getProperty("InterestRate"));
		cl.clickYear();
		cl.sendKeysLT(p.getProperty("LoanTenure"));
		cl.clickplussign();
		cl.scrollDown();
		String a=cl.principal();
		String b=cl.interest();		
		captureScreen("Emi_For_Car");
		System.out.println("The principal amount for 1 month is "+a);
		System.out.println("The interest amount for 1 month is "+b);
		driver.quit();
	}
	
}
