package com.thoughtworks.cornucopia;

import com.thoughtworks.cornucopia.api.ScreenApi;
import com.thoughtworks.cornucopia.api.UserApi;
import org.junit.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserFlowTest extends FunctionalTestBase {

    @Test
    public void userFlow() {

        user.goToHomePage();
        screen.shouldShowHomePage();

    }
}