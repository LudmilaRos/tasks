package Lecture8;

import Lecture8.DogsPage;
import Lecture8.HomePage;
import org.junit.jupiter.api.Test;

public class Test2 {

    HomePage homePage = new HomePage();
    CarsPage carsPagePage = new CarsPage();

    @Test
    public void someDemoTest() {
        homePage.openBaseUrl();
        homePage.chooseCategory("cars");
        CarsPage.fillMinMaxPrice("6000","10000");
        CarsPage.fillMinMaxYear("2006","");
        CarsPage.pressSubmitButton();
        CarsPage.changeVolume("3.0");
        CarsPage.changeVoColor("Белый");
        homePage.stopDriver();
    }


}