package MyFinalProject.pages;

import org.openqa.selenium.JavascriptExecutor;

public class Helper {

   public void scrollDown () {
       JavascriptExecutor js = (JavascriptExecutor) BasePage.driver;
       js.executeScript("window.scrollBy(0, 600)");

   }
}
