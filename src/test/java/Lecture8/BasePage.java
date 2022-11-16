package Lecture8;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static ChromeDriver driver;
    private static String baseUrl = "";

    public void startDriver() {
        String path = "C:\\Users\\user\\Downloads\\someProject\\SomeProjectGradle\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", path);
        driver = new ChromeDriver();
    }

    public void openBaseUrl(String url) {
        baseUrl = url;
        driver.get(baseUrl);
    }

    public void stopDriver() {
        driver.quit();
    }
}


