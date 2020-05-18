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
public class LifeInsPageObjects {
	WebDriver driver;
	private static WebElement element = null;

	public LifeInsPageObjects(WebDriver Driver) {
		this.driver = Driver;
	}
	
	
	public static WebElement linkTravelInsurance(WebDriver driver) {
		element = driver.findElement(By.linkText("Travel")); 
		return element; 
	}

	public static WebElement clickTravelDesLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@type='text']"));
		return element;
	}
	
	public static WebElement clickTravelDesCountry(WebDriver driver) {
		element = driver.findElement(By.xpath("/div[@id='travel-insurance']/section/div/div/div/div/div/div/div[2]/div/ul/li[35]/div"));
		return element;
	}
	
	
}
