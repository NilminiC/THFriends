/**
 * 
 */
package com.agentapp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Nilmini Amarasinghe
 *
 * 
 */
public class TravelInsPageObjects {
	static WebDriver driver;
	private static WebElement element; 
	
	public TravelInsPageObjects(WebDriver Driver) {
		this.driver = Driver;
	}
	
	
	public static WebElement dropdownSelectDes(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"travel-insurance\"]/section/div/div/div/div[1]/div[2]/span[3]"));
		return element; 
	}
	
	public static WebElement selectCountry(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"travel-insurance\"]/section/div/div/div/div[1]/div[1]/div/div[2]/div/ul/li[14]"));
		return element; 
	}
}
