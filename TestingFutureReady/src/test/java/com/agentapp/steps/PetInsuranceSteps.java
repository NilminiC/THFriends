package com.agentapp.steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.agentapp.pageobjects.PetInsPageObjects;
import com.agentapp.pageobjects.TravelInsPageObjects;

import io.cucumber.java.en.Then;




/**
 * @author Nilmini Amarasinghe
 *
 * 
 */
public class PetInsuranceSteps{
	WebDriver driver;

	
	  @Then("^Navigate to Pet Insurance page$") public void
	  navigate_to_Pet_Insurance_page() throws Throwable { 
	  Thread.sleep(50000);
	  System.out.println("Pet Insurance");
	  try {
		 PetInsPageObjects.getlinkPetInsurance().click();
	} catch (NullPointerException e) {
		e.printStackTrace();
	}
	  }
	  
	  @Then("^Select the Falcon Insurer$") public void select_the_Falcon_Insurer()
	  throws Throwable {
		  try {
			  driver.findElement(By.xpath("//img[@alt='logo']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	   }
	  
	  @Then("^User fill in the prospect detail for the plan$") public void
	  user_fill_in_the_prospect_detail_for_the_plan() throws Throwable {
	  
	  }
	  
	  @Then("^Select the plan$") public void select_the_plan() throws Throwable {
		  try {
			  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			  driver.findElement(By.xpath("(//button[@type='button'])[12]")).click(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 



}
