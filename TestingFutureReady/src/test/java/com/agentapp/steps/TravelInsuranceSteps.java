package com.agentapp.steps;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.agentapp.pageobjects.TravelInsPageObjects;

import io.cucumber.java.en.Then;




/**
 * @author Nilmini Amarasinghe
 *
 * 
 */
public class TravelInsuranceSteps{
	WebDriver driver;

	@Then("^Navigate to Travel Insurance page$")
	public void navigate_to_travel_insurance_page() throws Throwable {
		Thread.sleep(20000);
		System.out.println("Travel Insurance");		
		//	TravelInsPageObjects.linkTravelInsurance(driver).click();
		//		}
	}

	@Then("^User select destination$")
	public void user_select_destination() throws Throwable {
		Thread.sleep(50000);
		try {
			System.out.println("Travel Insurance2");		
			TravelInsPageObjects.dropdownSelectDes(driver).click();
			System.out.println("Travel Insurance3");		
			//TravelInsPageObjects.selectCountry(driver).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	@Then("^User select number of travellers$")
	public void user_select_number_of_travellers() throws Throwable {

	}

	@Then("^Select user trip details$")
	public void select_user_trip_details() throws Throwable {
	}

}
