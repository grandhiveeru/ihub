package ihub;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setbroswersize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  
			  driver.get("http:google.com");
		
		System.out.println(driver.manage().window().getSize());
//		Dimension d = new Dimension(420,600);
//		driver.manage().window().setSize(d);
//		Thread.sleep(2000);
		
       
		((JavascriptExecutor)driver).executeScript("window.resizeTo(900, 668);");
		System.out.println(driver.manage().window().getSize());
		
	}

}
