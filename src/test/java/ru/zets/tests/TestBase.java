package ru.zets.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import ru.zets.pages.RegistrationPage;
import ru.zets.data.DataGen;

public class TestBase {

    public DataGen data = new DataGen();
    public RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() { Configuration.startMaximized = true; }
}