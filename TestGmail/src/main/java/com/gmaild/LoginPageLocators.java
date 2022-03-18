package com.gmaild;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLocators {
	WebDriver driver;


	public static By Username = By.id("identifierId");
	public static By  Next    = By.xpath("//span[contains(text(),'Next')]");
	public static By password = By.name("password");
	public static By Compose  = By.xpath("//div[contains(text(),'Compose')]");
	public static By wrongpwd = By.xpath("//span[contains(text(),'Wrong password')]");

}







