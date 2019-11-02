package com.piit.session.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  Home ob=new Home(driver);
	  Thread.sleep(6000);
	  ob.homeValueput("800000");
	  Thread.sleep(6000);
	  ob.downPaymentid("8000");
	  Thread.sleep(6000);
	  ob.ir("4.0");
	  Thread.sleep(6000);
	  ob.bt();
	  
  }
  @BeforeClass
  
  public void beforeClass() {
	   
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\JESMIN\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
	  }
  
 /* @Parameters("browser")
  public void beforeClass(String browsers) {
	  if(browsers.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\JESMIN\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
	  }else if(browsers.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\JESMIN\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");

			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
	  }else {
		  System.out.println("Lauch correct browser");
	  }
  }*/

  @AfterClass
  public void afterClass() {
  }

}
