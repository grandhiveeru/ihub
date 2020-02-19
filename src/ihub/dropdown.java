package ihub;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class dropdown {
  @Test
  public void f() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize(); 
			    
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.get("https://www.ihubdirect.in/MultiStoresReports");
   driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("reportsadmin@ihubstores.in");
   driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[@type=\"submit\"] ")).click();
   Thread.sleep(3000);
   
   WebElement table = driver.findElement(By.xpath("(//select[@name=\"SelectVendor\"])[2]"));
   List<WebElement> rows = table.findElements(By.tagName("option"));
   java.util.Iterator<WebElement> i = rows.iterator();
  // System.out.println(i);
   while(i.hasNext()) 
  // System.out.println(i.hasNext());
   {
	   
       WebElement row = i.next();
       System.out.println(row.getText());
   }
	
  }
//   public Boolean selectByText( String text ) {
//  	    WebElement dropDown = driver.findElement( By.xpath( ".//dropdown/path" ) );
//  	    dropDown.click();
//  	    List<WebElement> allOptions = dropDown.findElements(By.xpath(".//option"));
//  	    for ( WebElement we: allOptions) { 
//  	        dropDown.sendKeys( Keys.DOWN ); //simulate visual movement
//  	        Thread.sleep(250);       
//  	        if ( we.getText().contains( text ) ) Select.selectByVisibleText("Value1");
//  	    }
//  	    
//  	}



	

  }

