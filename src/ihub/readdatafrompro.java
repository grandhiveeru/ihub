package ihub;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdatafrompro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		File file =new File("/home/veerendra/eclipse-workspace/ihub/datafile.properties");
		FileInputStream fileInput=null;
		try {
			fileInput= new FileInputStream(file);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
      Properties prop=new Properties();
      
      try {
    	  prop.load(fileInput);
    	  
      }catch(IOException e) {
    	  e.printStackTrace();
    	  
      }
      System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
      WebDriver driver =new ChromeDriver();
      driver.get(prop.getProperty("URL"));
      Thread.sleep(2000);
      driver.findElement(By.name("userName")).sendKeys(prop.getProperty("username"));
      Thread.sleep(2000);
      driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
      Thread.sleep(2000);
      driver.findElement(By.xpath(".//*[@type=\"submit\"]")).click();
      
      System.out.println("URL::"+prop.getProperty("URL"));
      System.out.println("User name::"+prop.getProperty("username"));
      System.out.println("password::"+prop.getProperty("password"));
      
      
      
	}

}
