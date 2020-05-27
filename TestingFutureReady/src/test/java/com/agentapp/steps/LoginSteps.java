package com.agentapp.steps;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.agentapp.base.BaseSetUp;
import com.agentapp.pageobjects.LoginPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/**
 * @author Nilmini Amarasinghe
 *
 * Futureready
 */
public class LoginSteps extends BaseSetUp{
	
//	LoginPageObjects loginObjects = new LoginPageObjects(driver);

	@Given("^User navigated to website url$")
	public void user_navigated_to_website_url() throws Throwable {
		driver =initializeDriver();
		driver.get(website);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	 @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		
		Thread.sleep(5000);
		System.out.println("check");
		Boolean value = LoginPageObjects.txtUserName(driver).isDisplayed();
		System.out.println(value);
		if(value == true) {
			LoginPageObjects.txtUserName(driver).clear();
			LoginPageObjects.txtUserName(driver).sendKeys(username);
			LoginPageObjects.txtPassword(driver).clear();
			LoginPageObjects.txtPassword(driver).sendKeys(password);
			LoginPageObjects.btnLogin(driver).click();
		}
		else {
		System.out.println("Login Page not displayed");
		}
	}


	@Then("^Check user login to the main page$")
	public void check_user_login_to_the_main_page() throws Throwable {
		Boolean value = LoginPageObjects.getImgFutureadyLogo(driver).isDisplayed();
		if(value==true){
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Page not displayed");
		}
		driver.close();
		driver=null;
	}


}
