package MyFinalProject.pages;

import org.openqa.selenium.JavascriptExecutor;

import static MyFinalProject.pages.BasePage.driver;

public class Helper {

   public void scrollDown () {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0, 600)");

   }
}
