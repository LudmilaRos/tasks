package Lecture9;

import Lecture8.DogsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClassForDemo {
    HomePage homePage= new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void SomeTest() {
        homePage.openJanaRozeUrl();


    }
}


