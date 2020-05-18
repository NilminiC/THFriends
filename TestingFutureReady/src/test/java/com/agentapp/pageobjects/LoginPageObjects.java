/**
 * 
 */
package com.agentapp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Nilmini Amarasinghe
 *
 * 
 */
public class LoginPageObjects {
	WebDriver driver = null;
	private static WebElement element = null;

	public LoginPageObjects(WebDriver Driver) {
		this.driver = Driver;
	}

	public static WebElement txtUserName(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@type='text']"));
		return element;
	}
	
	public static WebElement txtPassword(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@type='password']"));
		return element;
	}

	public static WebElement btnLogin(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/div/form/div[3]/div/button"));
		return element;
	}


	public static WebElement getImgFutureadyLogo(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[@class='navbar-item']//img"));
		return element;
	}

}
