package guru;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Guru99 {
	@Test
	public void guru(){
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Testing')]")).click();
//		List<WebElement> alloptions = driver.findElements(By.className("sub-menu show"));
//		System.out.println(alloptions.size());
		driver.findElement(By.id("menu-item-4600")).click();
		String title = driver.getTitle();
		System.out.println(title);
		assertEquals(title, "Software Testing Tutorial: Free QA Course");	
	}

}
