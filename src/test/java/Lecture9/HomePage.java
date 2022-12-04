package Lecture9;

import HomeWork.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage extends BasePage {

    private static String baseUrl = "https://www.janisroze.lv/";
    private By login = By.xpath("//input[@name='login[username]']");
    private By register = By.xpath("//input[@name='login[password]']");

    public void openJanaRozeUrl() {
        startDriver();
        driver.get(baseUrl);
    }

    public void LoginOrRegister(String action) {
        if ("login".equals(action)) {
            driver.findElement(login).click();
        } else if ("profile".equals(action)) {
            String profile = driver.findElement(register).getAttribute("href");
            driver.get(profile);
        } else {
            System.out.println("Something went wrong");
        }


    }}

