package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class browserTestMethod {

    public static void testBrowser(String browser) {
        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        String titleGoogleBack = driver.getTitle();
        StringUtility.verifyEquals(titleGoogleBack, titleGoogle);
        driver.navigate().forward();
        String titleEtsyForward = driver.getTitle();
        StringUtility.verifyEquals(titleEtsyForward, titleEtsy);
        driver.quit();
    }

}
