package org.example.ajwa.utils;

import org.example.ajwa.driverFactory.DriverFactory;

import java.time.Duration;

public class WaitUtil {
    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void implicitWaitForSeconds(int seconds) {
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
}
