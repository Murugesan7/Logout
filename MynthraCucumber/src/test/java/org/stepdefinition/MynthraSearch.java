package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.base.MynthraPOJO;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class MynthraSearch extends BaseClass {
	 MynthraPOJO m;
	@When("To launch the url of mynthra application")
	public void toLaunchTheUrlOfMynthraApplication() {
	   Url("https://www.walmart.com/");
	}

	@When("To enter the iphone product and click search button")
	public void toEnterTheIphoneProductAndClickSearchButton(DataTable d) {
		m = new MynthraPOJO();
		List<String> l = d.asList();
		Passtxt(l.get(0), m.getSearchBar());
		Click(m.getSearchButton());
	}

}
