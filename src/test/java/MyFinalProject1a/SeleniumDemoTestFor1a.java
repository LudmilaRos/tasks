package MyFinalProject1a;

import MyFinalProject1a.Models.ProductModel;
import MyFinalProject1a.Models.UserModel;
import MyFinalProject1a.pages.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class SeleniumDemoTestFor1a extends BasePage {
 HomePage homePage = new HomePage();
 ProductPage productPage = new ProductPage();
 CartPage cartPage = new CartPage();
 Helper helper = new Helper();
 UserModel userModel = new UserModel();
 OrderInfoPage orderInfoPage = new OrderInfoPage();
 ProductModel productModel = new ProductModel();





    @Test
    public void finalTest() throws InterruptedException {
        homePage.openBaseUrl();
        homePage.removeCookies();
        homePage.searchProduct("phone");
        helper.scrollDown(600);
        productPage.selectProductFromHomePage();
        helper.scrollDown(500);
        //productPage.addProductToCart();
        productPage.getNameOnProductPage();
        productPage.getPriceOnProductPage();
        productPage.addProductToCart();
        productPage.closePopUp();
        productPage.switchToParent();
        productPage.goToCard();
        cartPage.getNameOnCartPage();
        cartPage.getPriceOnCartPage();
        cartPage.completeOrder(userModel.getUserEmail());
        orderInfoPage.clickGetInOffice();
        orderInfoPage.clickDeliveryAddress();
        helper.scrollDown(700);
        orderInfoPage.enterUserName(userModel.getUserName());
        orderInfoPage.enterUserSurname(userModel.getUserSurname());
        orderInfoPage.enterPhoneNumber(userModel.getUserPhoneNr());
        helper.scrollDown(2000);
        orderInfoPage.pressSaveDataButton();
        orderInfoPage.pressContinue();
        orderInfoPage.paymentWay();
}
}
