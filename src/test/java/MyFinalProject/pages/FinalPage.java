package MyFinalProject.pages;

import FinalProject1a.pages.ProductModel;
import org.openqa.selenium.By;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FinalPage extends HomePage {
        ProductModel productModel = new ProductModel();

        private final By firstPrice = By.xpath("//span[@class='price']");
        private final By firstName = By.xpath("//*[@class='product-righter google-rich-snippet']/h1");
        private final By lastPrice = By.xpath("//span[@class='checkout-order-summary-total__price']");
        private final By lastName = By.xpath("//a[@class='detailed-cart-item__name-link']");
        //    private final By listOfProducts = By.xpath("//div[@class='detailed-cart-block default-form detailed-cart-item']");
        private final By listOfProducts = By.xpath("//p[@class='detailed-cart-item__name']");

//        AssertPage(ChromeDriverService chromeDriverService) {
//            super(chromeDriverService);
//        }

        public void checkMainPageLoaded() throws InterruptedException {

            String mainPage = driver.getCurrentUrl();
            Thread.sleep(2000);
            assertThat(mainPage).isEqualTo("https://www.1a.lv/");
        }

        public void compareProductTitle()
        {
            String basketProductName = driver.findElement(listOfProducts).getText();
            assertThat(basketProductName).isEqualTo(productModel.getProductName());
        }

        public void getFirstPriceAndName() {
            String priceOnProductPage = driver.findElement(firstPrice).getText();
            productModel.setProductPrice(priceOnProductPage.substring(0, priceOnProductPage.length() - 7));

            String productNameOnProductPage = driver.findElement(firstName).getText();
            System.out.println(productNameOnProductPage);
            productModel.setProductName(productNameOnProductPage);

        }
//        public void getFinalProductName(){
//            String priceOnOrderSummary = driver.findElement(lastName).getText();
//            assertThat(priceOnOrderSummary).isEqualTo(productModel.getProductPrice());
//        }

        public void getFinalPrice() {
            String bucketPrice = driver.findElement(lastPrice).getText();
            assertThat(bucketPrice).isEqualTo(productModel.getProductPrice());
        }
    }

