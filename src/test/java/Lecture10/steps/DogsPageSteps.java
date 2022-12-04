package Lecture10.steps;

import Lecture8.DogsPage;
import io.cucumber.java.en.And;

public class DogsPageSteps {
    DogsPage dogsPage = new DogsPage();

    @And("^I fill min age (.*) and max age (.*)$")
    public void iFillMinAgeAndMaxAge(String min, String max) {
        dogsPage.fillMinMaxAge(min, max);
    }

    @And("^I fill min price (.*) and max price (.*)$")
    public void iFillMinPriceAndMaxPrice(String min, String max) {
        dogsPage.fillMinMaxPrice(min, max);
    }


    @And("^I change deal to (sell|buy)$")
    public void iChangeDealToSell(String dealType) {
        dogsPage.changeDealTypeTo(dealType);
    }

    @And("I press submit button")
    public void iPressSubmitButton() {
        dogsPage.pressSubmitButton();
    }


}
