package Lecture7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

    @Test
    public void someDemoTest() {
        String path = "C:\\Users\\Ludmila\\IdeaProjects\\SomeProjectGradle\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/ru/");
        driver.findElement(By.id("mtd_97")).click();
        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
        //driver.findElement(By.id("f_o_18_min")).sendKeys("2006");
        driver.findElement(By.id("f_o_15_min")).sendKeys("3.0");
        //driver.findElement(By.id("f_o_17")).sendKeys("Белый");

        String name;
        Select yearType = new Select(driver.findElement(By.cssSelector(name="topt[18][min]")));

        yearType.selectByValue("2001");
       // driver.findElement(By.id("f_o_1276_max")).sendKeys("5");

        WebElement submit = driver.findElement(By.id("Submit"));
        driver.quit();



//        driver.findElement(By.xpath("//input[@class='b s12']")).click();
//        Select dealType = new Select(driver.findElement(By.cssSelector("select[name=\"topt[15][max]\"]")));

    }
}
