package MyFinalProject.pages;

import MyFinalProject.pages.models.UserModel;
import org.openqa.selenium.By;

public class OrderPage extends BasePage {
     Helper helper = new Helper();
     UserModel userModel = new UserModel();

    private final By getProductAtOffice = By.xpath("//input[@value='2']");
    private final By deliveryAddress = By.xpath("//input[@value='3210']");
    private final By userName = By.id("address_first_name");
    private final By userSurname = By.id("address_last_name");
    private final By userPhoneNumber = By.id("address_phone_number");
    private final By pressSaveUserDataButton = By.xpath("//button[@type='submit']");
    private final By pressContinueButton = By.xpath("//button[@class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']");
    private final By clickPaymentWay = By.id("payment_unused_22");

    public void ChangeDelivery() throws InterruptedException {
        driver.findElement(getProductAtOffice).click();
        Thread.sleep(2000);
        driver.findElement(deliveryAddress).click();
    }

    public void enterUserName(String name) {
        helper.scrollDown();
        driver.findElement(userName).sendKeys(userModel.getUserName());
    }

    public void enterUserSurname(String surname) {
        driver.findElement(userSurname).sendKeys(userModel.getUserSurname());
    }
    public void enterPhoneNumber(String number) {
        driver.findElement(userPhoneNumber).sendKeys(userModel.getUserPhoneNr());
    }
    public void pressSaveData() throws InterruptedException {
        helper.scrollDown();
        Thread.sleep(2000);
        driver.findElement(pressSaveUserDataButton).click();
    }

    public void pressContinue () throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(pressContinueButton).click();
    }

    public void paymentWay () {
        driver.findElement(clickPaymentWay).click();
    }
}
