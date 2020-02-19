package ihub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class threads {

	public static void main(String[] args) {
		
			  
		 System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
			WebDriver	driver = new ChromeDriver();
				  driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/V4/");
	        driver.findElement(By.name("uid")).sendKeys("Driver 1");	 
				

	}

}
