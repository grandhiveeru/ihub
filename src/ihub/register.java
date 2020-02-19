package ihub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

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
     
     driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul[2]/li[5]/a[2]")).click();
   

     driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[2]/form/div[1]/div/input")).sendKeys("gveerendra");
     driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[2]/form/div[2]/div/div[1]/label[1]")).click();
     driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[2]/form/div[3]/div/input")).sendKeys("7659910411");
    
     driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[2]/form/div[4]/div/input")).sendKeys("grandhiveerendra@gmail.com");
     driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[2]/form/div[5]/div/input")).sendKeys("Veerendra.123");
     driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[2]/form/div[6]/div/input")).sendKeys("Veerendra.123");
     driver.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div/div[2]/div/div[2]/form/div[7]/div/label/i")).click();
     driver.findElement(By.xpath("(//button[@type=\"submit\"])[3]")).click();
     driver.findElement(By.xpath("//*[@id=\"confirmOTPModal\"]/div/div/form/div[2]/div[1]/div/input")).sendKeys("568915");
     driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
     
     
//     OutboundNotification outboundNotification = new OutboundNotification();
//     SerialModemGateway gateway = new SerialModemGateway("modem.com5", "COM5", 9600, "ZTE", "COM5");
//     gateway.setInbound(true);
//     gateway.setOutbound(true);
//     gateway.setSmscNumber("+917659910411"); // 10-digit Mobile Number
//     Service.getInstance().setOutboundMessageNotification(outboundNotification);
//     Service.getInstance().addGateway(gateway);
//     Service.getInstance().startService();
//     OutboundMessage msg = new OutboundMessage(ExcelConnect.strSMSTo, ExcelConnect.strSMSText);
//     Service.getInstance().sendMessage(msg);
//     System.out.println(msg);
//     System.out.println(ExcelConnect.strSMSTo + "-" + ExcelConnect.strSMSText);
//     Service.getInstance().stopService();
//     Service.getInstance().removeGateway(gateway);
     
     
     
     
     
     

	}

}
