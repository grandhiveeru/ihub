package ihub;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newtab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/home/veerendra/Downloads/chromedriver_linux64/chromedriver");
             WebDriver	driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("http:guru99.com");
			  
			 // driver.execute_script(window.open("http://google.com","_blank");''')
			  
			//  ActionChains(driver).key_down(Keys.CONTROL).send_keys('t').key_up(Keys.CONTROL).perform();
//			  driver.execute_script("window.open('');");
//			  driver.switch_to.window(driver.window_handles[1]);
//			  driver.get("www.facebook.com");
			  
//			  driver.get("https://mail.google.com/");
//			  String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
//			  driver.findElement(By.linkText("www.facebook.com")).sendKeys(selectLinkOpeninNewTab);
			 // driver.find_element_by_tag_name('body').send_keys(Keys.COMMAND + 't');
			  WebElement link = driver.findElement(By.linkText("Blog"));

			//this action will click the WebElement with the link identified above, hold CONTROL Key (or COMMAND if you're using Mac), click the WebElement and relese the Keys.CONTROL (use Keys.COMMAND if you're using Mac).
			new Actions(driver)
			.keyDown(Keys.COMMAND)
			.click(link)
			.keyUp(Keys.COMMAND)
			.build()
			.perform();

			  
			  


	}

}
