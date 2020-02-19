package ihub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sign {

	public static void main(String[] args) throws InterruptedException {
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
     driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul[2]/li[5]/a[1]")).click();
   //  driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul[2]/li[5]/a[2]")).click();
     Thread.sleep(500);
     
     driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[1]/form/div[1]/div/input")).sendKeys("7659910411");
     driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[1]/form/div[2]/div/input")).sendKeys("Veerendra.123");
     driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[1]/form/div[3]/div/div/div[1]/button")).click();
     Thread.sleep(1000);
   //*[@id="confirmModal"]/div/div/div/div[2]/div/div[1]/form/div[4]/a
   //  driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[1]/form/div[4]/a")).click();
     
     driver.findElement(By.xpath("//a[@class=\"fc-reverse\"]")).click();
     
     driver.findElement(By.xpath("//*[@id=\"forgotmodel\"]/div/div/div[2]/form[1]/div[2]/div/button")).click();
     
     
     
     
     
     

	}

}
