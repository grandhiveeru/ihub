package uipackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class flightconfimationpage {
	WebDriver driver;
	public flightconfimationpage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.NAME,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")
	@CacheLookup
	WebElement logout;
	public void logoutpress() {
		logout.click();
	}
	

}
