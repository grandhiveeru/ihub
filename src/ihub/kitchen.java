package ihub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitchen {

	public static void main(String[] args) throws InterruptedException {
		//*[@id="top"]/div[2]/div[2]/div[2]/div/div/ul/li[7]/a
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize();
			    
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.get("http://205.147.109.73/iHubDirectUAT/Home_Page");
   //*[@id="StoreLoc"]/div/div/form/div/div[2]/div/div[2]/div/div/autocomplet/div/input
     driver.findElement(By.xpath("//*[@id=\"StoreLoc\"]/div/div/form/div/div[2]/div/div[2]/div/div/autocomplet/div/input")).sendKeys("Hyderabad");
     WebElement textbox = driver.findElement(By.xpath("//*[@id=\"StoreLoc\"]/div/div/form/div/div[2]/div/div[2]/div/div/autocomplet/div/input"));
     textbox.sendKeys(Keys.ENTER);
     Thread.sleep(500);
     driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/div[2]/div/div/ul/li[7]/a")).click();
     JavascriptExecutor js = (JavascriptExecutor) driver; 
 

	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
     
     driver.findElement(By.xpath("(//div[@class=\"category-name text-ellipsis\"])[10]")).click();
     
     
     
     
     
     
     
     
     
     
     
     
     

	}

}
