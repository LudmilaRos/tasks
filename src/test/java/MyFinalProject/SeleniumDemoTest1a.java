package MyFinalProject;

import MyFinalProject.pages.BasePage;
import MyFinalProject.pages.FinalPage;
import MyFinalProject.pages.HomePage;
import MyFinalProject.pages.OrderPage;
import MyFinalProject.pages.models.UserModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SeleniumDemoTest1a {
   // BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();
    FinalPage finalPage = new FinalPage();
    OrderPage orderPage = new OrderPage();
    UserModel userModel = new UserModel();

    @Before
    public void startChrome() {
        homePage.openBaseUrl("https://www.1a.lv/");
    }

//    @After
//    public void endChrome() {
//        basePage.stopChrome();
//    }

    @Test
   public void finalTest () throws InterruptedException {
        finalPage.checkMainPageLoaded();
        homePage.removeCookies();
        homePage.enterProductName();
      //  homePage.chooseProduct();
        //finalPage.getFirstPriceAndName();
        homePage.addToCart();
        finalPage.getFirstPriceAndName();
        homePage.closePopUp();
        homePage.switchToParent();
        homePage.goToCardPage();
        finalPage.compareProductTitle();
        homePage.pressContinue();
        homePage.enterEmail();
        orderPage.ChangeDelivery();
        orderPage.enterUserName(userModel.getUserName());
        orderPage.enterUserSurname(userModel.getUserSurname());
        orderPage.enterPhoneNumber(userModel.getUserPhoneNr());
        orderPage.pressSaveData();
        orderPage.pressContinue();
        orderPage.paymentWay();
        finalPage.getFinalPrice();
    }
}
