package ihub;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class failtestcase {
	WebDriver driver;
	
  @Test
  public void screenshotmethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();	
			//driver.get("http://newtours.demoaut.com/");
			
//			WebElement user = driver.findElement(By.name("userName"));
//			user.sendKeys("test");
//			WebElement pwd = driver.findElement(By.name("password"));
//			pwd.sendKeys("test");
//			WebElement signin = driver.findElement(By.name("login"));
//			signin.click();
//			
			driver.get("https://www.ihubdirect.in/MultiStoresReports");
		     driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("reportsadmin@ihubstores.in");
		     driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.12");
		     driver.findElement(By.xpath("//button[@type=\"subit\"]")).click();
		     Thread.sleep(1000);
             driver.findElement(By.xpath("")).click();
		     		

  }
  @AfterMethod
  public void screenShot(ITestResult result) {
	  if(ITestResult.FAILURE==result.getStatus()) {
		  try {
			 TakesScreenshot screenshot=(TakesScreenshot)driver;
			 File src=screenshot.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src, new File("/home/veerendra/Documents/"+result.getName()+".png"));
			 System.out.println("Succesfully captured a screenshot");
		  }
		  catch (Exception e){
			  System.out.println("Exception while taking screenshot"+e.getMessage());
			  
			  
		  }
			  
	  }
	  driver.quit();
  }

}
