package ihub;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotparfeb {
 static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		//  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
		
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(screen);
		FileUtils.copyFile(screen,new File("/home/veerendra/Documents/New folder/vtuy.png"));

	}

}
