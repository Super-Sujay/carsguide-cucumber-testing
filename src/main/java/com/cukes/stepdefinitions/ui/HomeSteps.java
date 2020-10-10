package com.cukes.stepdefinitions.ui;

import com.cukes.pages.HomePage;

import io.cucumber.java8.En;
import io.cucumber.java8.StepDefinitionBody.A0;

public class HomeSteps implements En {

	public HomeSteps(HomePage homePage) {
		Given("I am on the home page {string} of cars guide website", homePage::openPage);
		When("I move to Cars For Sale menu", (A0) homePage.buyAndSell::moveMousePointer);
		Then("I click on {string}", homePage::clickElementWithLinkText);
	}

}
