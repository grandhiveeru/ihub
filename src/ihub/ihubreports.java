package ihub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ihubreports {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
		WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize(); 
			    
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.get("https://www.ihubdirect.in/MultiStoresReports");
     driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("reportsadmin@ihubstores.in");
     driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
     Thread.sleep(3000);
     
     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/ng-view/div/section/div[3]/div[1]/div[1]/div/div/div[2]/img")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/ng-view/div/section/div[3]/div[2]/div[3]/div/div/div[2]/img")).click();;
     Thread.sleep(2000);
     driver.findElement(By.xpath("//select[@ng-model=\"Cluster_ID\"]")).sendKeys("Hyderabad Cluster");
     
     Thread.sleep(2000);
    
     driver.findElement(By.xpath("//select[@ng-model=\"ParentID\"]")).sendKeys("Electronics And Home Appliances");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//select[@ng-model=\"SubCategoriID\"]")).sendKeys("Electronics");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//select[@ng-model=\"Location\"])[2]")).sendKeys("Vendor Orders");   
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//button[@class=\"btn btn-sm btn-warning\"])[1]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[1]/a/i")).click();
     Thread.sleep(3000);
    // driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[1]/a/span")).click();
     
    // Thread.sleep(2000);
     driver.findElement(By.xpath("(//select[@name=\"Level\"])[1]")).sendKeys("DC");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//select[@ng-model=\"DC_Unit\"]")).sendKeys("Hyderabad DC");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//select[@ng-model=\"ClusterID\"]")).sendKeys("Hyderabad Cluster");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//select[@ng-model=\"StoreID\"])[1]")).sendKeys("HyderabadCluster Store");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//select[@ng-model=\"Module\"]")).sendKeys("Bulk Order");
     
    
     for(String handle: driver.getWindowHandles()) {
    	 driver.switchTo().window(handle);
    	 
     }
     for(String handle: driver.getWindowHandles()) {
    	 driver.switchTo().window(handle);
     }for(String handle:driver.getWindowHandles()) {
    	 driver.switchTo().window(handle);
     }
     
     
    
     
     
     
     
     
     

	}

}
