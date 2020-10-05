package com.cukes.stepdefinitions.ui;

import org.testng.Assert;

import com.cukes.pages.SearchResultPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchResultStep {

	private SearchResultPage searchResultPage;

	public SearchResultStep(SearchResultPage searchResultPage) {
		this.searchResultPage = searchResultPage;
	}

	@Then("I should see the list of searched cars")
	public void i_should_see_the_list_of_searched_cars() {
		Assert.assertTrue(searchResultPage.carList.isVisible(), "List of cars not present");
	}

	@And("The page title should be {string}")
	public void the_page_title_should_be(String data) {
		Assert.assertEquals(searchResultPage.getPageTitle(), data, "Incorrect page title");
	}

}
