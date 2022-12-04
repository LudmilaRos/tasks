package Lecture8;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CarsPage extends BasePage {

    private static final By minPrice = By.id("f_o_8_min");
    private static final By maxPrice = By.id("f_o_8_max");
    private static final By minYear = By.id("f_o_18_min");
    private static final By maxYear = By.id(" ");
    private static final By volumeSelector = By.cssSelector("select[name='topt[15][min]']");
    private static final By colorSelector = By.cssSelector("select[name='opt[17]']");
    private static final By submitButton = By.xpath("//input[@class='b s12']");
    private static Select Volume;

    public void fillMinMaxAge(String min, String max) {
        driver.findElement(minYear).sendKeys(min);
        driver.findElement(maxYear).sendKeys(max);
    }
    public  void fillMinMaxPrice(String min, String max) {
        driver.findElement(minPrice).sendKeys(min);
        driver.findElement(maxPrice).sendKeys(max);
    }
    public  void fillMinMaxYear(String min, String max) {
        driver.findElement(minYear).sendKeys(min);
        driver.findElement(maxYear).sendKeys(max);
    }
    public  void changeVolume(String volumeValue) {
        Select dealType = new Select(driver.findElement(volumeSelector));
        if ("3.0".equals(volumeValue)) {
            Volume.selectByValue("3.0");
        } else {
            System.out.println("Something went wrong");
        }
    }
    public  void changeColor(String colorValue) {
        Select dealType = new Select(driver.findElement(colorSelector));
        if ("Белый".equals(colorValue)) {
            dealType.selectByValue("https://www.ss.com/lv/transport/cars/filter/");
        } else {
            System.out.println("Something went wrong");
        }
    }
    public  void pressSubmitButton() {
        driver.findElement(submitButton).click();
    }


}


//driver.findElement(By.id("mtd_97")).click();
//        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
//        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
//        //driver.findElement(By.id("f_o_18_min")).sendKeys("2006");
//        driver.findElement(By.id("f_o_15_min")).sendKeys("3.0");
//        //driver.findElement(By.id("f_o_17")).sendKeys("Белый");
//
//        String name;
//        Select yearType = new Select(driver.findElement(By.cssSelector(name="topt[18][min]")));
//
//        yearType.selectByValue("2001");
//       // driver.findElement(By.id("f_o_1276_max")).sendKeys("5");
//
//        WebElement submit = driver.findElement(By.id("Submit"));
//        driver.quit();
//
//
//
////        driver.findElement(By.xpath("//input[@class='b s12']")).click();
////        Select dealType = new Select(driver.findElement(By.cssSelector("select[name=\"topt[15][max]\"]")));
//
//    }
//}