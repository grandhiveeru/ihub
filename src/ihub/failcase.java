package ihub;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;


public class failcase {
	 static WebDriver driver;
	 @Test
	 public void screenshotmethod() throws Exception
	 {
	  System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize();
			    
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.softwaretestingmaterial.com");
	driver.navigate().refresh();
	//driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
	driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath
	  
  }
  @AfterMethod
  public void ScreenShot() throws IOException {
	// if(ITestResult.FAILURE==result.getStatus()) {

	  File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("//home/veerendra/BBB.png"));
				System.out.println("Successfully captured a screenshot");
		  
	
		  
	  driver.quit();
	  // close application
	 }}	  
  


