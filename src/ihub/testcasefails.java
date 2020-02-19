package ihub;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcasefails {
	WebDriver driver;
	
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize();
			    
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  try{
      driver.get("https://www.softwaretestingmaterial.com");
driver.navigate().refresh();
//driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath	
         }catch(Exception e){
      File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile, new File("/home/veerendra/Documents/veerendra.png"));
}
 driver.close();
driver.quit(); 
	  
  }
}
