package com.piit.session.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	static WebDriver driver;
	
	@FindBy(id="homeval")
	WebElement homeValue;
	@FindBy(id="downpayment")
	WebElement downPay;
	@FindBy(id="loanamt")
	WebElement loan;
	@FindBy(id="intrstsrate")
	WebElement interest;
	@FindBy(xpath="//a[@class='example8 cboxElement']//input[@name='ratebutton'] ")
	WebElement button;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void homeValueput(String digits) {
		homeValue.clear();
		homeValue.sendKeys(digits);
	}
	public void downPaymentid(String ui) {
		downPay.clear();
		downPay.sendKeys(ui);
	}
	public void ir(String ow) {
		interest.clear();
		interest.sendKeys(ow);
	}
	public void bt() {
		button.click();
	}

}
