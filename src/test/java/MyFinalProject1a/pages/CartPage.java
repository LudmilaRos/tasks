package MyFinalProject1a.pages;

import MyFinalProject1a.Models.ProductInCartModel;
import MyFinalProject1a.Models.ProductModel;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;


public class CartPage extends BasePage {

       ProductInCartModel productInCartModel = new ProductInCartModel();
        ProductModel productModel = new ProductModel();
        ProductPage productPage = new ProductPage();

        SoftAssertions softAssertions = new SoftAssertions();

        //private final By lastPrice = By.xpath("//span[@class='checkout-order-summary-total__price']");
        private final By lastPrice = By.id("cart-full-total-price");
        // private final By listOfProducts = By.xpath("//a[@class='detailed-cart-item__name-link']");
        private final By nameOnSummary = By.xpath("//a[@class='detailed-cart-item__name-link']");
        private final By continueOrder = By.xpath("//input[@class='main-button cart-main-button']");
        private final By enterUnregisteredUserEmail = By.id("user_email");
        private final By pressContinueButton = By.xpath("//form[@id='new_user_guest']//input[@class='users-session-form__submit']");


        public void getNameOnCartPage() {
            String nameOnCartPage = driver.findElement(nameOnSummary).getText();
            System.out.println("fff");
            System.out.println(nameOnCartPage);
            System.out.println("ffff");
            productInCartModel.setFinalProductName(nameOnCartPage);
            softAssertions.assertThat(nameOnCartPage).isEqualTo(productPage.productModel.getProductName());
        }

        public void getPriceOnCartPage() {
            String priceOnCartPage = driver.findElement(lastPrice).getText();
            System.out.println( priceOnCartPage);
            productInCartModel.setFinalProductPrice(priceOnCartPage);
            softAssertions.assertThat(priceOnCartPage).isEqualTo(productPage.productModel.getProductPrice());
        }

//    public void compareData() {
//        softAssertions.assertThat(productInCartData.getFinalProductPrice()).isEqualTo(productModel.getProductPrice());
//        softAssertions.assertThat(productInCartData.getFinalProductName()).isEqualTo(productModel.getProductName());
//
//    }



        public void completeOrder(String userEmail) {
            driver.findElement(continueOrder).click();
            driver.findElements(enterUnregisteredUserEmail).get(1).sendKeys(userEmail);
            driver.findElement(pressContinueButton).click();
    }
}
