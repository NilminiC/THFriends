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
public class PetInsPageObjects {
	static WebDriver driver;
	private static WebElement element;
	public static By petLink=By.xpath("//a[contains(text(),'Pet')]");

	public PetInsPageObjects(WebDriver Driver) {
		this.driver = Driver;
	}
	
	
	public static WebElement getlinkPetInsurance() {		
		return driver.findElement(petLink);
	}

	public static WebElement clickPet1(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@type='text']"));
		return element;
	}
	
	public static WebElement ClickPet2(WebDriver driver) {
		element = driver.findElement(By.xpath("/div[@id='travel-insurance']/section/div/div/div/div/div/div/div[2]/div/ul/li[35]/div"));
		return element;
	}
	
	
}
