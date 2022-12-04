package HomeWork.pages;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;



public class ProfilePage extends BasePage {

    @Data
    public class ProfileModel {
        String name;
        String surname;
        String dayOfBirth;
        String monthOfBirth;
        String yearOfBirth;
        String phoneNumber;
        String city;
        String gender;
        String language;

    }
    public ProfileModel profileModel = new ProfileModel();
    private By profileEditForumCinemas = By.xpath("//a[@href='/mypage/profile/']");
    private By name = By.id("inputFirstName");
    private By surname = By.id("inputLastName");
    private By dayOfBirth = By.id("bdDay");
    private By monthOfBirth = By.id("bdMonth");
    private By yearOfBirth = By.id("bdYear");
    private By phoneNumber = By.id("inputMobile");
    private By city = By.id("inputCity");

    private By femaleGender = By.id("genderFemale");
    private By language = By.id("preferredLanguage");
    private By submit = By.xpath("//button[@type='submit'][@class='btn btn-primary']");

  private By checkedGender = By.xpath("//input[@checked='']");


    public void chooseProfileAction(String action) {
        if ("change profile".equals(action)) {
            driver.findElement(profileEditForumCinemas).click();
        } else {
            System.out.println("Something went wrong in profile page!");
        }
    }

    public void goProfileName(String enterName) {
        driver.findElement(name).clear();
        driver.findElement(name).sendKeys(enterName);
    }

    public void goProfileSurname(String enterSurname) {
        driver.findElement(surname).clear();
        driver.findElement(surname).sendKeys(enterSurname);
    }

    public void goProfileDayOfBirth(String enterDayOfBirth) {
        Select dOfBirth = new Select(driver.findElement(dayOfBirth));
        dOfBirth.selectByValue(enterDayOfBirth);
    }

    public void goProfileMonthOfBirth(String enterMonthOfBirth) {
        Select mOfBirth = new Select(driver.findElement(monthOfBirth));
        mOfBirth.selectByValue(enterMonthOfBirth);
    }
    public void goProfileYearOfBirth(String enterYearOfBirth) {
        Select yOfBirth = new Select(driver.findElement(yearOfBirth));
        yOfBirth.selectByValue(enterYearOfBirth);
    }

    public void goProfilePhoneNumber(String enterPhoneNumber) {
        driver.findElement(phoneNumber).clear();
        driver.findElement(phoneNumber).sendKeys(enterPhoneNumber);
    }

    public void goProfileCity(String enterCity) {
        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(enterCity);
    }

    public void goGender (String yourGender) {
        driver.findElement(By.id("genderFemale")).click();
    }


    public void goProfileLanguage(String enterLanguage) {
        Select languageSelection = new Select(driver.findElement(language));
        if (enterLanguage.equals("english")) {
            languageSelection.selectByValue("1000");
        } else if (enterLanguage.equals("russian")) {
            languageSelection.selectByValue("1004");
        } else if (enterLanguage.equals("latvian")) {
            languageSelection.selectByValue("1002");
        } else {
            System.out.println("Try again");
        }
    }

    public void goProfileSubmit() {
        driver.findElement(submit).click();
    }

    public void collectData() {
        profileModel.setName(driver.findElement(name).getAttribute("value"));
        profileModel.setSurname(driver.findElement(surname).getAttribute("value"));
        profileModel.setDayOfBirth(driver.findElement(dayOfBirth).getAttribute("data-value"));
        profileModel.setMonthOfBirth(driver.findElement(monthOfBirth).getAttribute("data-value"));
        profileModel.setYearOfBirth(driver.findElement(yearOfBirth).getAttribute("data-value"));
        profileModel.setPhoneNumber(driver.findElement(phoneNumber).getAttribute("value"));
        profileModel.setCity(driver.findElement(city).getAttribute("value"));
        profileModel.setGender(driver.findElement(checkedGender).getAttribute("id"));
        profileModel.setLanguage(driver.findElement(language).getAttribute("data-value"));
    }
}


