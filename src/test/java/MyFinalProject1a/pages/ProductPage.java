package MyFinalProject1a.pages;

import MyFinalProject1a.Models.ProductModel;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
     //BasePage basePage = new BasePage();
    ProductModel productModel = new ProductModel();

    private final By selectProduct = By.xpath("//a[@data-gtm-link='787152']");
    private final By addToCardButton = By.id("add_to_cart_btn");
    //private final By priceOnPage = By.xpath("//span[@class='price']");
    private By priceOnPage = By.xpath("//span[@class='price']/child::span[1]");
    private By priceOnPageCurrency = By.xpath("//span[@class='price']/child::span[2]");
    private final By nameOnPage = By.xpath("//*[@class='product-righter google-rich-snippet']/h1");
    private final By closePopUpWindow = By.xpath("//button[@class='fancybox-button fancybox-close-small']");
    private final By goToCard = By.xpath("//i[@class='cart-block__icon icon-svg']");

    public void selectProductFromHomePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(selectProduct).click(); }

    public void addProductToCart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(addToCardButton).click();
    }

    public void getPriceOnProductPage() {
        String priceOnProductPage = driver.findElement(priceOnPage).getText() + " " + driver.findElement(priceOnPageCurrency).getText();
        System.out.println("aaaa");
        System.out.println(priceOnProductPage);
        System.out.println("dddd");
        productModel.setProductPrice(priceOnProductPage);
        // productModel.setProductPrice(priceOnProductPage.substring(0, priceOnProductPage.length() - 7));
    }
    public void getNameOnProductPage() {
        String productNameOnProductPage = driver.findElement(nameOnPage).getText();
        System.out.println(productNameOnProductPage);
        productModel.setProductName(productNameOnProductPage);
    }

    public void closePopUp () throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(closePopUpWindow).click();
    }
    public void switchToParent() {
        driver.switchTo().parentFrame();
    }

    public void goToCard() {
        driver.findElement(goToCard).click();
}
}
