package ua.net.itlabs.operations;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;

public class BaseTest {

    {
        Configuration.browser = System.getProperty("driver.browser");
    }
}
