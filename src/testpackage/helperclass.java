package testpackage;

import org.testng.annotations.Test;

import frameworks.browserfactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class helperclass {
	public static WebDriver driver;
	browserfactory obj1;
	
	public helperclass() {
		
	}
	
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in @BeforeMethod");
	  helperclass.driver= browserfactory.getDriver("chorme");
  }

  @AfterMethod
  public void close() {
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("in @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
