package MyFinalProject1a.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {


        String baseUrl = "https://www.1a.lv/";

        private final By removeCookiesNotification = By.xpath("//a[@href='javascript:void(0)']");
        private final By enterSearchQuery = By.id("q");
        private final By pressSearchProduct = By.className("main-search-submit");


        public void openBaseUrl() {
            startDriver();
            driver.get(baseUrl);
        }

        public void removeCookies() throws InterruptedException {
            Thread.sleep(1500);
            driver.findElement(removeCookiesNotification).click();
        }

        public void searchProduct(String productSearchQuery) {
            driver.findElement(enterSearchQuery).sendKeys(productSearchQuery);
            driver.findElement(pressSearchProduct).click();
        }
    }

