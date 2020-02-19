package ihub;

import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;



public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize();
			    
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.get("http://live.demoguru99.com/index.php/backendlogin");
   driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("user01");
   driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("guru99com");
   driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
   driver.findElement(By.xpath("//*[@id=\"message-popup-window\"]/div[1]/a")).click();
   driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();
   driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[2]/a")).click();
   driver.findElement(By.xpath("//*[@id=\"sales_invoice_grid_table\"]/thead/tr[1]/th[3]/sp/")).click();
  }
  @AfterMethod
  public void screen(ITestResult result) {
	  if(ITestResult.FAILURE==result.getStatus()) {
		  try {
			  TakesScreenshot screenshot=(TakesScreenshot)driver;
				// Call method to capture screenshot
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location 
				// result.getName() will return name of test case so that screenshot name will be same as test case name
				FileUtils.copyFile(src, new File("home/veerendra/Documents/"+result.getName()+".png"));
				System.out.println("Successfully captured a screenshot");
		  }
	  catch (Exception e)
	  {

	  System.out.println("Exception while taking screenshot "+e.getMessage());
	  } 
		  
	  driver.quit();
	  // close application
	  }}}
	  



	  
 

	  
