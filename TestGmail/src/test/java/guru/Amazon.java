package guru;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver driver;
	@BeforeClass
	public void intialise() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void Search() {
		driver.get("https://www.amazon.com");
	  WebElement search =	driver.findElement(By.id("twotabsearchtextbox"));
	  search.sendKeys("Avg. Customer Review");
	  search.sendKeys(Keys.ENTER);
	String title =  driver.getTitle();
	System.out.println(title);
	  assertEquals(title, "Amazon.com : Avg. Customer Review");
	}
	@AfterClass
	public void close() {
		driver.quit();
	}

}
