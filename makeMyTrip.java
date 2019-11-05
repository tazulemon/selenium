import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\JESMIN\\eclipse-workspace\\Udemy\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//li[contains(text(),'Round Trip')]")).click();
		driver.findElement(By.xpath(" //span[contains(text(),'From')]")).click();

		Thread.sleep(6000);
		WebElement from = driver.findElement(By.xpath("//input[contains(@placeholder,'From')] "));
		
		 from.sendKeys("kol"); 
		 Thread.sleep(4000);
		 from.sendKeys(Keys.DOWN); 
		 Thread.sleep(4000);
		 from.sendKeys(Keys.DOWN);
		// This part is not working 		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 String script="return document.getElementById(\"react-autowhatever-1\").value;";
		 String text2=(String) js.executeScript(script);
		 System.out.println(text2);
		from.sendKeys(Keys.ENTER);
		 
		 
		 driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys("goa"); 
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//p[contains(text(),'Goa, India')]")).click();
		 
		 Thread.sleep(4000);
		 
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();

		while (!driver.findElement(By.xpath("//div[@class='DayPicker-Month']")).getText().contains("February")) {
			driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton DayPicker-NavButton--next')]"))
					.click();
		}

		List<WebElement> dates = driver.findElements(By.className("dateInnerCell"));
		int count = driver.findElements(By.className("dateInnerCell")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("dateInnerCell")).get(i).getText();
			if (text.equalsIgnoreCase("5")) {
				driver.findElements(By.className("dateInnerCell")).get(i).click();
				break;
			}
		}
		while (!driver.findElement(By.xpath("//div[@class='DayPicker-Month']")).getText().contains("March")) {
			driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton DayPicker-NavButton--next')]"))
					.click();
		}
		for (int i = 0; i < count; i++) {
			String text1 = driver.findElements(By.className("dateInnerCell")).get(i).getText();
			if (text1.equalsIgnoreCase("1")) {
				driver.findElements(By.className("dateInnerCell")).get(i).click();
				break;
			}
		}

	}

}
