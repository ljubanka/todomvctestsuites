package ua.net.itlabs.operations;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;

public class BaseTest {

    static {
        Configuration.browser = System.getProperty("driver.browser");
        Configuration.pageLoadStrategy = "normal";
    }
}
