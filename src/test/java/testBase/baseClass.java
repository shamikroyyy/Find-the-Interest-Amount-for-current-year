package testBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseClass {

public static WebDriver driver;
 public Properties p;


@BeforeClass
public void setup() throws IOException
{
	p=new Properties();
	FileReader file =new FileReader(".//src/test/resources/config.properties");
	p.load(file);
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(p.getProperty("app_url"));
	driver.manage().window().maximize();
}

//@Parameters("browser")
//@BeforeClass
//public void crossBrowser(String browser) throws IOException{
//	p=new Properties();
//	FileReader file =new FileReader(".//src/test/resources/config.properties");
//	p.load(file);
//	switch(browser.toLowerCase()) {
//	case "chrome":
//		driver=new ChromeDriver();
//		break;
//	case "edge":
//		driver=new EdgeDriver();
//		break;
//	default:
//		driver=null;	
//	}
//	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.get(p.getProperty("app_url"));
//	driver.manage().window().maximize();
//}

@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
public String captureScreen(String tname) throws IOException {
	 
	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
	File targetFile=new File(targetFilePath);
	sourceFile.renameTo(targetFile);
	return targetFilePath;

}
}


