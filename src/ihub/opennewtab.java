package ihub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class opennewtab {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  
			//  driver.get("http:yahoo.com");
			  
			//*[@id="yui_3_18_0_3_1575451617020_1143"]
			 // driver.findElement(By.xpath("//*[@id=\"yui_3_18_0_3_1575451617020_1143\"]")).sendKeys(Keys.CONTROL +"t");

	            driver.get("http://stackoverflow.com/");

	         //   WebElement body = driver.findElement(By.tagName("body"));
	         //   body.sendKeys(Keys.CONTROL + "t");
	            
//	            driver.ExecuteScript("window.open('your url','_blank');");
	           JavascriptExecutor jse = (JavascriptExecutor)driver;
	          jse.executeScript("window.open()");
	          for (String handle : driver.getWindowHandles()) {
	  	    	driver.switchTo().window(handle);
	  	    	}
	            
//	            String a = "window.open('about:blank','http:google.com');";
//	            ((JavascriptExecutor)driver).executeScript(a);
	            
	          
	          driver.get("http:google.com");
	          driver.quit();
	          
	            
	            

	            
	            




			  
			    
  
     
     
  

	}

}
