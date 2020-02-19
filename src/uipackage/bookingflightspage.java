package uipackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class bookingflightspage {
	WebDriver driver;
	public bookingflightspage(WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy(how=How.NAME,using="passFirst0")
	@CacheLookup
	WebElement firstNmae;
	@FindBy(how=How.NAME,using="passLat0")
	@CacheLookup
	WebElement lastName;
	@FindBy(how=How.NAME,using="pass.0.meal")
	@CacheLookup
	WebElement meal;
	@FindBy(how=How.NAME,using="creditCard")
	@CacheLookup
	WebElement cardType;
	@FindBy(how=How.NAME,using="creditNumber")
	@CacheLookup
	WebElement cardNumber;
	@FindBy(how=How.NAME,using="cc_exp_dt_mn")
	@CacheLookup
	WebElement expMonth;
	@FindBy(how=How.NAME,using="cc_exp_dt_yrs")
	@CacheLookup
	WebElement expYears;
	@FindBy(how=How.NAME,using="cc_frst_name")
	@CacheLookup
	WebElement cardFirstName;
	@FindBy(how=How.NAME,using="cc_mid_name")
	@CacheLookup
	WebElement cardMindName;
	@FindBy(how=How.NAME,using="cc_last_name")
	@CacheLookup
	WebElement cardLastName;
	@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[23]/td/input")
	@CacheLookup
	WebElement purchase;

	
	public void purchasepress(String fname,String lname, String meal2, String cType, String cNumber, String eMonth,String eYear,String cFirstName,String cMiddleName,String cLastName) {
		try {
			Thread.sleep(2000);
			firstNmae.sendKeys(fname);

			Thread.sleep(2000);
			lastName.sendKeys(lname);

			Thread.sleep(2000);
			meal.sendKeys(meal2);

			Thread.sleep(2000);
			cardType .sendKeys(cType);

			Thread.sleep(2000);
			cardNumber.sendKeys(cNumber);

			Thread.sleep(2000);
			expMonth.sendKeys(eMonth);

			//Thread.sleep(2000);
			expYears.sendKeys(eYear);

			Thread.sleep(2000);
			cardFirstName.sendKeys(cFirstName);

			Thread.sleep(2000);
			cardMindName.sendKeys(cMiddleName);

			Thread.sleep(2000);
			cardLastName.sendKeys(cLastName);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}
