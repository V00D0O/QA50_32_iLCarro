package ui_tests;

import manager.AppManager;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.SortedMap;

public class LoginTests extends AppManager {
    @Test
    public void loginPositiveTest(){
        System.out.println("first test");
        HomePage homePage = new HomePage(getDriver());
    }

}
