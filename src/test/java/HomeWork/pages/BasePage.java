package HomeWork.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
        public static ChromeDriver driver;
        //osnovnoj driver, static 4tob bila odna sessija (odno otkritoe okno)


        public void startDriver() {
            String path = "C:\\Users\\Ludmila\\IdeaProjects\\SomeProjectGradle\\src\\test\\resources\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", path);
            driver = new ChromeDriver();
        }

    public void scrollPage(int verticalPixels) {
          //  driver.executeScript("0, 500");
        driver.executeScript("window.scrollBy(0," + verticalPixels + ")", "");
    }


    public void stopDriver() {

            driver.quit();
    }
}





