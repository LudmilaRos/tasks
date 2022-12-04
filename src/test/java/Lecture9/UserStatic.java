package Lecture9;

import lombok.Getter;
import org.openqa.selenium.By;

@Getter

public class UserStatic extends BasePage {
    String username = "lr@montech.lv";
    String password =  "barcelona";
    private static final By closeCookie = By.className("ch2-btn ch2-allow-all-btn ch2-btn-primary ch2-btn-text-xxs");
    private static final By loginButton = By.className("skip-link skip-account skip-active");
    private static final By userName = By.name("login[username]");
    private static final By userPassword = By.name("login[password]");

    public void login (String username, String userpassword) {
        driver.findElement(closeCookie).click();
        driver.findElement(loginButton).click();
        driver.findElement(userName).sendKeys("username");
        driver.findElement(userPassword).sendKeys("barcelona");

    }
}
