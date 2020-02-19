package ihub;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class howtogetalllinks {

	public static void main(String[] args) {
		String baseUrl = "http://205.147.109.73/iHubDirectUAT/Home_Page/";		
	//	String baseurl = "http://183.82.123.14/iHubMultiStoresDev/storeAssistant_Login";
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");					
        WebDriver driver = new ChromeDriver();		
        
        		
        String underConsTitle = "Under Construction: ihub";					
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

			driver.get(baseUrl);		
			 driver.findElement(By.xpath("//*[@id=\"StoreLoc\"]/div/div/form/div/div[2]/div/div[2]/div/div/autocomplet/div/input")).sendKeys("Hyderabad");
			 WebElement textbox = driver.findElement(By.xpath("//*[@id=\"StoreLoc\"]/div/div/form/div/div[2]/div/div[2]/div/div/autocomplet/div/input"));
		     textbox.sendKeys(Keys.ENTER);
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
        String[] linkTexts = new String[linkElements.size()];							
			int					i = 0;					

			//extract the link texts of each link element		
			for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();							
			i++;			
        }		

			//test each link		
			for (String t : linkTexts) {							
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals(underConsTitle)) {							
                System.out.println("\"" + t + "\""								
                        + " is under construction.");			
            } else {			
                System.out.println("\"" + t + "\""								
                        + " is working.");			
            }		
				
        }		
			driver.quit();

	}

}
