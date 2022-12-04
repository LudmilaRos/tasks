package Lecture10.steps;

import Lecture8.CarsPage;
import io.cucumber.java.en.And;

public class CarsPageSteps {
    CarsPage carsPage = new CarsPage();

    @And("I writing min price {String} and max price {String}")
    public void iWritingMinPriceAndMaxPrice(String min, String max) {
        carsPage.fillMinMaxPrice(min, max);

    }

    @And("I fill min year {Sting}")
    public void iFillMinYear(String min, String max) {
        carsPage.fillMinMaxYear(min, "");
    }

    @And("I pressing submit button")
    public void iPressingSubmitButton() {
        carsPage.pressSubmitButton();

    }

    @And("I change volume to {double}")
    public void iChangeVolumeTo(String value) {
        carsPage.changeVolume("3.0");

    }

    @And("I change color to white")
    public void iChangeColorToWhite() {
    }
}
