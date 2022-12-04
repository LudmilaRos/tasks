package Lecture10.steps;

import Lecture8.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
    HomePage homePage = new HomePage();
    @Given("I open base url")
    public void iOpenBaseUrl() {
        homePage.openBaseUrl();
    }

    @When("^I change category to (dogs|cars)$")
    public void iChangeCategoryToDogs(String category) {
        homePage.chooseCategory(category);
    }


    @Then("I stop driver")
    public void iStopDriver() {
        homePage.stopDriver();
    }
}
