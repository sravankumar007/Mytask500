package com.gmaild;
import org.openqa.selenium.WebDriver;
import Actions.Actions;


public class LoginPageMethods {

	LoginPageLocators loc = new LoginPageLocators();
	Actions actions = new Actions();

	public void typeEmail(String email, WebDriver driver) {
		actions.sendKeys(LoginPageLocators.Username, driver, email);;
	}
	public void typePassword(String pwd, WebDriver driver) {
		actions.sendKeys(LoginPageLocators.password, driver, pwd);
	}
	public void nextClick(WebDriver driver) {
		actions.clickOnEle(LoginPageLocators.Next, driver);
	}
	public void LoginConfirmText(WebDriver driver, String gottext) {
		actions.getText(LoginPageLocators.Compose, driver, gottext);
	}
	public void wrongPwdText(WebDriver driver, String gottext) {
		actions.getText(LoginPageLocators.wrongpwd, driver, gottext);
	}
	
	

}
