package ihub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nothing {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("http:google.com");
			  driver.findElement(By.xpath(""));
			  driver.findElement(By.xpath("")).click();
			  driver.findElement(By.xpath("")).clear();
			  driver.findElement(By.xpath("")).sendKeys("");
			  driver.findElement(By.xpath(""));
			  
			  
			  
			  
		
	

	}

}
