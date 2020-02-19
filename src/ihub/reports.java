package ihub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reports {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize(); 
			    
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.get("https://www.ihubdirect.in/MultiStoresReports");
     Thread.sleep(3000);
     
     JavascriptExecutor  js=(JavascriptExecutor)driver;
     js.executeScript("document.getElementById('Email').value='reportsadmin@ihubstores.in';");
     js.executeScript("document.getElementById('password').value='Store.123';");
     
//     JavascriptExecutor JS = (JavascriptExecutor)driver;
//  // To enter username
//  JS.executeScript("document.getElementById('User').value='SoftwareTestingMaterial.com'");
//  // To enter password
//  JS.executeScript("document.getElementById('Pass').value='tester'");

     
//     driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("reportsadmin@ihubstores.in");
//     driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
     driver.findElement(By.xpath("//button[@type=\"submit\"] ")).click();
	}

}
