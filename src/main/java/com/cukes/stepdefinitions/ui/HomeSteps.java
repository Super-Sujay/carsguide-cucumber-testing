package com.cukes.stepdefinitions.ui;

import com.cukes.pages.HomePage;

import io.cucumber.java8.En;

public class HomeSteps implements En {

	public HomeSteps(HomePage homePage) {
		Given("I am on the home page {string} of cars guide website", (String data) -> homePage.openPage(data));
		When("I move to Cars For Sale menu", () -> homePage.buyAndSell.moveMousePointer());
		Then("I click on {string}", (String data) -> homePage.clickElementWithLinkText(data));
	}

}
