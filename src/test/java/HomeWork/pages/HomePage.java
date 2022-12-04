package HomeWork.pages;


import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static String baseUrl = "https://www.forumcinemas.lv/";
    private By login = By.xpath("//a[@class='btn btn-login btn-default']");
    private By editProfile = By.xpath("//a[@href='/mypage/Index/'][@class='navbar-link']");

    public void openForumCinemasUrl() {
        startDriver();
        driver.get(baseUrl);
    }

    public void chooseAction(String action) {
        if ("goLogin".equals(action)) {
            driver.findElement(login).click();
        } else if ("goToProfile".equals(action)) {
            String profile = driver.findElement(editProfile).getAttribute("href");
            driver.get(profile);
        } else {
            System.out.println("Something went wrong");
        }
    }
}
