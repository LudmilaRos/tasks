package MyFinalProject.pages;

import MyFinalProject.pages.models.UserModel;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    Helper helper = new Helper();
     UserModel userModel = new UserModel();

    private static String baseUrl = "https://www.1a.lv/";

    private final By removeCookiesOnFirstPage = By.xpath("//a[@href='javascript:void(0)']");
    private final By enterSearchProduct = By.id("q");
    private final By pressSearchProduct = By.className("main-search-submit");
   private final By selectProduct = By.xpath("//a[@data-gtm-link='787175']");

    private final By addToCardButton = By.id("add_to_cart_btn");
    //private final By addToCardButton = By.xpath("//button[@class='class='ks-add-to-cart-catalog-btn ks-button-size-ms ks-main-button '], [@type='submit']");
    private final By closePopUpWindow = By.xpath("//button[@class='fancybox-button fancybox-close-small']");
    private final By goToCard = By.xpath("//i[@class='cart-block__icon icon-svg']");
    private final By continueOrder = By.xpath("//input[@class='main-button cart-main-button']");
    private final By enterUnregisteredUEmail = By.id("user_email");
    private final By pressContinueButton = By.xpath("//form[@id='new_user_guest']//input[@class='users-session-form__submit']");

    public  void openBaseUrl() {
        driver.get(baseUrl);
    }
 public void removeCookies() {
 driver.findElement(removeCookiesOnFirstPage).click();
 }

 public void enterProductName() {
     driver.findElement(enterSearchProduct).sendKeys("phone");
     driver.findElement(pressSearchProduct).click();
 }

// public void chooseProduct() throws InterruptedException {
//     //Thread.sleep(2000);
//     helper.scrollDown();
//     Thread.sleep(2000);
//     driver.findElement(selectProduct).click();
 //}
 public void addToCart() throws InterruptedException {
     helper.scrollDown();
     Thread.sleep(2000);
     driver.findElement(selectProduct).click();
     helper.scrollDown();
     Thread.sleep(2000);
     driver.findElement(addToCardButton).click();
 }

 public void switchToParent() {
     driver.switchTo().parentFrame();
 }
 public void closePopUp() {
     driver.findElement(closePopUpWindow).click();
 }
 public void goToCardPage() {
     driver.findElement(goToCard).click();
 }
 public void pressContinue () {
     driver.findElement(continueOrder).click();
 }
 public void enterEmail() {
     driver.findElement(enterUnregisteredUEmail).sendKeys(userModel.getUserEmail());
     driver.findElement(pressContinueButton).click();
 }
}


