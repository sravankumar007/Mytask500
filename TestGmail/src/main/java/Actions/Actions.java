package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Actions {
	public void clickOnEle(By locator, WebDriver driver) {
		driver.findElement(locator).click();       
	}
	public void sendKeys(By locator, WebDriver driver, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	public String getText(By locator, WebDriver driver, String gottext) {
		gottext=driver.findElement(locator).getText();
		System.out.println(gottext);
		return gottext;
	}


}
