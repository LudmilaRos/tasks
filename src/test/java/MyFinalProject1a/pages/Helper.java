package MyFinalProject1a.pages;


public class Helper extends BasePage{
    //    public void scrollDown () {
//        JavascriptExecutor js = (JavascriptExecutor) BasePage.driver;
//        js.executeScript("window.scrollBy(0, 900)");
//
//    }
    public void scrollDown(int verticalPixels) {
        driver.executeScript("window.scrollBy(0," + verticalPixels + ")","");
    }
}

