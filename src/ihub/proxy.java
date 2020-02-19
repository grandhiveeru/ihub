package ihub;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class proxy {

	public static void main(String[] args) {
		
//		 Proxy p=new Proxy();
//         p.setHttpProxy("localhost:7777");
//
//		 // Create desired Capability object
//		DesiredCapabilities cap=new DesiredCapabilities();
//
//
//		// Pass proxy object p
//		cap.setCapability(CapabilityType.PROXY, p);
//
//		//System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
//
//		 // Open  firefox browser
//		
//         // @SuppressWarnings({ "deprecation", "unused" })
//		WebDriver driver=new FirefoxDriver(cap);
//
		 // from here onwards code will be same as normal script
		ChromeOptions option = new ChromeOptions();
		Proxy proxy = new Proxy();	
		proxy.setHttpProxy("localhost:8080");
		option.setCapability(CapabilityType.PROXY, proxy);
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver  driver  = new ChromeDriver(option);
		driver.get("http://newtours.demoaut.com/");


	}

}
