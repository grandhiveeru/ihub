package ihub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class electro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize();
			   
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.get("http://205.147.109.73/iHubDirectUAT/Home_Page");
   //*[@id="StoreLoc"]/div/div/form/div/div[2]/div/div[2]/div/div/autocomplet/div/input
     driver.findElement(By.xpath("//*[@id=\"StoreLoc\"]/div/div/form/div/div[2]/div/div[2]/div/div/autocomplet/div/input")).sendKeys("Hyderabad");
     Thread.sleep(2000);
     
     WebElement textbox = driver.findElement(By.xpath("//*[@id=\"StoreLoc\"]/div/div/form/div/div[2]/div/div[2]/div/div/autocomplet/div/input"));
     textbox.sendKeys(Keys.ENTER);
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/div[2]/div/div/ul/li[2]/a")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[4]/ng-view/div/div/div[2]/section/div/div[1]/a/div[1]/img")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[4]/ng-view/div/div/div[2]/section/div/div[1]/a/div[1]/img")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[4]/ng-view/div/div[1]/div[2]/div/div/div[2]/section/ul/li[1]/div[1]/div[2]/div/div[1]/h4")).click();
     Thread.sleep(1000);
     
     for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	}
     
     driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[4]/ng-view/div/div[1]/div/div/div[2]/div[2]/div[1]/div[4]/div[3]/button[1]")).click();
     
    for(String handle:driver.getWindowHandles()) {
    	driver.switchTo().window(handle);
    }
     

	}

}
