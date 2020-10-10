package com.cukes.stepdefinitions.ui;

import org.automation.utilities.ExplicitWait;

import com.cukes.pages.CarSearchPage;

import io.cucumber.java8.En;

public class CarSearchSteps implements En {

	private CarSearchPage carSearchPage;

	public CarSearchSteps(CarSearchPage carSearchPage) {
		this.carSearchPage = carSearchPage;
		Then("I select Make as {string}", (String data) -> carSearchPage.make.selectByValue(data));
		And("I select Model as {string}", (String data) -> selectModel(data));
		And("I select Location as {string}", (String data) -> carSearchPage.location.selectByValue(data));
		And("I select Price is {string}", (String data) -> carSearchPage.price.selectByVisibleText(data));
		And("I click on Find My Next Car button", () -> carSearchPage.search.click());
	}

	private void selectModel(String data) {
		ExplicitWait wait = new ExplicitWait(10, 1000);
		wait.until(driver -> carSearchPage.model.getNumberOfOptions() > 1);
		carSearchPage.model.selectByValue(data);
	}

}