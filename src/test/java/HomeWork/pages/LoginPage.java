package HomeWork.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By username = By.id("input-userName");
    private By password = By.id("input-password");

    private By submitButton = By.xpath("//button[@class='btn btn-primary btn-block']");


    public void loginForumCinemas(String enterUsername, String enterPassword) {
        driver.findElement(username).sendKeys(enterUsername);
        driver.findElement(password).sendKeys(enterPassword);
    }

    public void pressSubmitButton() {
        driver.findElement(submitButton).click();
    }
}
