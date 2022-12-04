@SmokeTest
  @Dogs


  Feature: Testing Dogs page functionality

    Scenario: Dogs page functionality
      Given I open base url
      When I change category to dogs
      And I fill min age 10 and max age 101
      And I fill min price 0 and max price 10000
      And I press submit button
      And I change deal to sell
      Then I stop driver



      @Cars

      Feature: Testing Cars page functionality
        Scenario: Cars page functionality
          Given I open base url
          When I change category to cars
          And I writing min price 6000 and max price 10000
          And I fill min year 2006
          And I pressing submit button
          And I change volume to 3.0
          And I change color to white
          Then I stop driver



        homePage.openBaseUrl();
        homePage.chooseCategory("cars");
        CarsPage.fillMinMaxPrice("6000","10000");
        CarsPage.fillMinMaxYear("2006","");
        CarsPage.pressSubmitButton();
        CarsPage.changeVolume("3.0");
        CarsPage.changeColor("Белый");
        homePage.stopDriver();





