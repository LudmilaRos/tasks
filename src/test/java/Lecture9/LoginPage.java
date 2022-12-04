package Lecture9;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By username = By.name("login[login]");
    private By password = By.name("login[password]");

    private By submitButton = By.xpath("//button[@id='send2']']");


    public void JanaRozeLogin(String myUserName, String myPassword) {
        driver.findElement(username).sendKeys(myUserName);
        driver.findElement(password).sendKeys(myPassword);
    }

    public void pressSubmitButton() {
        driver.findElement(submitButton).click();
    }
}

