package ihub;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class keywordservice {
	WebDriver driver;
    WebDriverWait wait;
    Properties properties;        
    
    public keywordservice() {
        properties = new Properties();
        try {
            properties.load(keywordservice.class.getClassLoader()
                    .getResourceAsStream("application.properties"));
        } catch (IOException e) {
            System.out.println("Properties not loaded");
            e.printStackTrace();
        }
    }
 
    public void openBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", properties.getProperty("gecko.path"));
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.path"));
            driver = new ChromeDriver();
        }
//            else if (browserName.equalsIgnoreCase("IE")) {
//                driver = new InternetExplorerDriver();
//            }
    }
 
    public void openUrl(String url) {
        driver.navigate().to(url);
    }
 
    private By locatorValue(String locatorType, String value) {
        By by;
        switch (locatorType) {
            case "id":
                by = By.id(value);
                break;
            case "name":
                by = By.name(value);
                break;
            case "xpath":
                by = By.xpath(value);
                break;
            case "css":
                by = By.cssSelector(value);
                break;
            case "linkText":
                by = By.linkText(value);
                break;
            case "partialLinkText":
                by = By.partialLinkText(value);
                break;
            default:
                by = null;
                break;
        }
        return by;
    }
 
    public void enterText(String locatorType, String value, String text) {
            By locator = locatorValue(locatorType, value);
            WebElement element = driver.findElement(locator);
            element.sendKeys(text);
    }
 
 
    public void clickOnLocator(String locatorType, String value) {
        By locator = locatorValue(locatorType, value);
        WebElement element = driver.findElement(locator);
        element.click();
    }
 
    public void closeBrowser() {
         wait = new WebDriverWait(driver,2);
         driver.close();
    }
 
 
    public boolean verify(String locatorType, String value,String attribute,String valueToCheck){
        By locator = locatorValue(locatorType, value);
        WebElement element = driver.findElement(locator);
        String elementValue =element.getAttribute(attribute);
        if(valueToCheck != null){
            return valueToCheck.equalsIgnoreCase(elementValue);
        }
        return element != null;
    }
}