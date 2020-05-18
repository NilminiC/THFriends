/**
 * 
 */
package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import com.agentapp.base.BaseSetUp;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
/**
 * @author Nilmini Amarasinghe
 *
 * 
 */
public class TravelInsurance extends BaseSetUp{
	 private WebDriver driver;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		  driver =initializeDriver();
			driver.get(website);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testTravel() throws Exception {
	    driver.get("https://friends.th.futuready.com/en/login");
	    driver.findElement(By.xpath("//input[@type='text']")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //input[@type='text'] | ]]
	    driver.findElement(By.xpath("//input[@type='password']")).click();
	    driver.findElement(By.xpath("//div[@id='login']/div[3]/div")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//div[@id='travel-insurance']/section/div/div/div/div/div/div/span/i")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).click();
	    driver.findElement(By.xpath("//div[@id='travel-insurance']/section/div/div/div/div/div/div/div[2]/div/ul/li[20]/div")).click();
	    driver.findElement(By.xpath("//div[@id='travel-insurance']/section/div/div/div[2]/div[2]/div/span[2]")).click();
	    driver.findElement(By.xpath("//div[@id='travel-insurance']/section/div/div/div[2]/div[2]/div/span")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
	    driver.findElement(By.linkText("27")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
	    driver.findElement(By.xpath("//div[@id='travel-insurance']/section/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div/div/header/div/a[2]/span/i")).click();
	    driver.findElement(By.xpath("//div[@id='travel-insurance']/section/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div/div/header/div/div/div/div[2]/span/select")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[@id='travel-insurance']/section/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div/div/header/div/div/div/div[2]/span/select | ]]
	    driver.findElement(By.xpath("(//a[contains(text(),'24')])[2]")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//div[@id='travel-insurance']/section/div/div/div[2]/div[3]/div/div/div/span[2]/span")).click();
	    driver.findElement(By.xpath("//div[@id='travel-insurance']/section/div/div/div[2]/div[3]/div/div/div/span")).click();
	    driver.findElement(By.xpath("//button[@type='info']")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    driver.findElement(By.xpath("//div[@id='__layout']/div/main/div[2]/div[3]/div/div[2]/div/div[3]/button/span")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).clear();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test");
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test");
	    driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[6]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("11-111-1119");
	    driver.findElement(By.xpath("//input[@type='email']")).click();
	    driver.findElement(By.xpath("//input[@type='email']")).clear();
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nilmini.ceilanco@gmail.com");
	    driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
	    driver.findElement(By.xpath("//div[@id='__layout']/div/main/div[2]/div/div[2]/div/div[5]/div/div/div/div/div[3]/div/div/header/div/div/div/div[2]/span/select")).click();
	    new Select(driver.findElement(By.xpath("//div[@id='__layout']/div/main/div[2]/div/div[2]/div/div[5]/div/div/div/div/div[3]/div/div/header/div/div/div/div[2]/span/select"))).selectByVisibleText("1991");
	    driver.findElement(By.xpath("//div[@id='__layout']/div/main/div[2]/div/div[2]/div/div[5]/div/div/div/div/div[3]/div/div/header/div/div/div/div[2]/span/select")).click();
	    driver.findElement(By.linkText("15")).click();
	    driver.findElement(By.xpath("//div[@id='__layout']/div/main/div[2]/div/div[2]/div/div[6]/div/div/label/span[2]")).click();
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.close();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
}
