package com.cbt.tests;

import com.cbt.utilities.BrowserFactoryCBT;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    static StringUtility strUtil = new StringUtility();

    public static void main(String[] args) {

        chromeTest();
        firefoxTest();
        ieTest();

    }

    public static void chromeTest() {
        WebDriver driver = BrowserFactoryCBT.getDriver("chrome");
        driver.get("https://google.com");
        String googleTitle = "Google";
        driver.get("https://etsy.com");
        String etsyTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        driver.navigate().back();
        strUtil.verifyEquals(googleTitle, driver.getTitle());
        driver.navigate().forward();
        strUtil.verifyEquals(etsyTitle, driver.getTitle());
        driver.quit();
    }

    public static void firefoxTest() {
        WebDriver driver = BrowserFactoryCBT.getDriver("firefox");
        driver.get("https://google.com");
        String googleTitle = "Google";
        driver.get("https://etsy.com");
        String etsyTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        driver.navigate().back();
        strUtil.verifyEquals(googleTitle, driver.getTitle());
        driver.navigate().forward();
        strUtil.verifyEquals(etsyTitle, driver.getTitle());
        driver.quit();
    }

    public static void ieTest() {
        WebDriver driver = BrowserFactoryCBT.getDriver("ie");
        driver.get("https://google.com");
        String googleTitle = "Google";
        driver.get("https://etsy.com");
        String etsyTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        driver.navigate().back();
        strUtil.verifyEquals(googleTitle, driver.getTitle());
        driver.navigate().forward();
        strUtil.verifyEquals(etsyTitle, driver.getTitle());
        driver.quit();
    }
}
