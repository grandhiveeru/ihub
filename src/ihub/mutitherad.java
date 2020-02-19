package ihub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mutitherad {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver1 = new ChromeDriver();
			  driver1.manage().window().maximize();
		driver1.get("http:google.com");
	 

	  
  }
}
