package ru.zets.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.CredentialsConfig;
import helpers.Attach;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.zets.pages.RegistrationPage;
import ru.zets.data.DataGen;

@Tag("Owner")
public class TestBase {

    public DataGen data = new DataGen();
    public RegistrationPage registrationPage = new RegistrationPage();
    public CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);
    String login = credentials.login();
    String password = credentials.password();
    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        String selenoid = System.getProperty("selenoid","selenoid.autotests.cloud/wd/hub");
        Configuration.remote = "https://%s:%s@"+selenoid;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",true);
        Configuration.browserCapabilities = capabilities;

    }
    @AfterEach
    public void teaedDown(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

    }

}