package MyFinalProject1a.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static ChromeDriver driver;

    public void startDriver() {
        String driverPath = "C:\\Users\\Ludmila\\IdeaProjects\\SomeProjectGradle\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    public void scrollDown () {
//        JavascriptExecutor js = (JavascriptExecutor) BasePage.driver;
//        js.executeScript("window.scrollBy(0, 900)");
//
//}
public void stopDriver() {
    driver.close();
}
}

