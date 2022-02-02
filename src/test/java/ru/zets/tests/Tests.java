package ru.zets.tests;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("Owner")
public class Tests extends TestBase {
    @Test
    void RegistrationPageTest(){
        registrationPage.openPage()
                .typeFirstName(data.firstName)
                .typeLatsName(data.lastName)
                .typeEmail(data.email)
                .genderSelect("Male")
                .typePhone(data.phone)
                .typeSubject("Comp")
                .hobbySelect("Reading")
                .hobbySelect("Music")
                .uploadPicture()
                .typeAddress(data.address)
                .openListOfStates("harya")
                .openListOfCities("Karnal");
        registrationPage.calndar.setDate("2000", "April", "22");
        registrationPage.submitTheForm();
        registrationPage.resultForm("Date of Birth", "22 April,2000");

    }
}