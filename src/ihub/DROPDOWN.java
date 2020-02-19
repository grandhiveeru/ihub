package ihub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DROPDOWN {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize(); 
			    
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.get("https://www.ihubdirect.in/MultiStoresReports");
     driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("reportsadmin@ihubstores.in");
     driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
     driver.findElement(By.xpath("//button[@type=\"submit\"] ")).click();
     Thread.sleep(3000);
	
     
     public Boolean selectByText( String text ) {
    	    WebElement dropDown = driver.findElement( By.xpath( ".//dropdown/path" ) );
    	    dropDown.click();
    	    List<WebElement> allOptions = dropDown.findElements(By.xpath(".//option"));
    	    for ( WebElement we: allOptions) { 
    	        dropDown.sendKeys( Keys.DOWN ); //simulate visual movement
    	        sleep(250);       
    	        if ( we.getText().contains( text ) ) select.selectByVisibleText("Value1");
    	    }
    	}

 

	}
}

