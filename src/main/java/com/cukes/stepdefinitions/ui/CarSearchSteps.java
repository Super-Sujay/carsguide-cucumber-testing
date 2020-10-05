package com.cukes.stepdefinitions.ui;

import org.automation.utilities.ExplicitWait;

import com.cukes.pages.CarSearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CarSearchSteps {

	private CarSearchPage carSearchPage;

	public CarSearchSteps(CarSearchPage carSearchPage) {
		this.carSearchPage = carSearchPage;
	}

	@Then("I select Make as {string}")
	public void i_select_Make_as(String data) {
		carSearchPage.make.selectByValue(data);
	}

	@And("I select Model as {string}")
	public void i_select_Model_as(String data) {
		ExplicitWait wait = new ExplicitWait(10, 1000);
		wait.until(driver -> carSearchPage.model.getNumberOfOptions() > 1);
		carSearchPage.model.selectByValue(data);
	}

	@And("I select Location as {string}")
	public void i_select_Location_as(String data) {
		carSearchPage.location.selectByValue(data);
	}

	@And("I select Price is {string}")
	public void i_select_Price_is(String data) {
		carSearchPage.price.selectByVisibleText(data);
	}

	@And("I click on Find My Next Car button")
	public void i_click_on_Find_My_Next_Car_button() {
		carSearchPage.search.click();
	}

}