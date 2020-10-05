package com.cukes.stepdefinitions.ui;

import com.cukes.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

	private HomePage homePage;

	public HomeSteps(HomePage homePage) {
		this.homePage = homePage;
	}

	@Given("I am on the home page {string} of cars guide website")
	public void i_am_on_the_home_page_of_cars_guide_website(String string) {
		homePage.openPage(string);
	}

	@When("I move to Cars For Sale menu")
	public void i_move_to_Cars_For_Sale_menu() {
		homePage.buyAndSell.moveMousePointer();
	}

	@Then("I click on {string}")
	public void i_click_on(String data) {
		homePage.clickElementWithLinkText(data);
	}

}
