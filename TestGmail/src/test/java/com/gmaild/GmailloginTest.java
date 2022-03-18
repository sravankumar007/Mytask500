package com.gmaild;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailloginTest extends properties {
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	public void ValidLogin() throws Exception{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPageMethods g = new LoginPageMethods();
		g.typeEmail(Email, driver);
		g.nextClick(driver);
		g.typePassword(Password, driver);
		Thread.sleep(2000);
		g.nextClick(driver);
		g.LoginConfirmText(driver, gottext);
	}
	@Test
	public void InvalidLogin() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPageMethods g = new LoginPageMethods();
		g.typeEmail(Email, driver);
		g.nextClick(driver);
		g.typePassword(wrongPwd, driver);
		Thread.sleep(2000);
		g.nextClick(driver);
		g.wrongPwdText(driver, gottext);
	}
	
	@AfterMethod
	public void close() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
}
