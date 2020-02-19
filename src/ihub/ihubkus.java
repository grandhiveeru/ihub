package ihub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ihubkus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     driver.get("http://183.82.123.14/iHubMultiStoresDev/storeAssistant_Login");
			     driver.findElement(By.xpath("(//input[@name=\"userName\"])[1]")).sendKeys("Kusumanchiwcs@Ihubwarehouse.In");
			     driver.findElement(By.xpath("(//input[@name=\"password\"])[1]")).sendKeys("Store.123");
			     driver.findElement(By.xpath("//button[@class=\"btn btn-prime btn-block\"]")).click();
			     Thread.sleep(3000);
			     
			 WebElement issue = driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[5]/ng-view/div/div[3]/section[1]/div/div/div[2]/div/div[1]/img"));
			     issue.click();
		WebElement issue1 = driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[5]/ng-view/div/div[3]/section[7]/div[2]/div/div/div[3]/div/div[1]/img"));
		issue1.click();
	WebElement issue2 = driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[5]/ng-view/div/div[3]/div[4]/div[1]/div[1]/ul/li[2]/a"));
	issue2.click();
			     

	}

}
