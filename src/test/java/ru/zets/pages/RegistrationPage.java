package ru.zets.pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import ru.zets.pages.CalendarPage.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    private SelenideElement
            titleForm = $(byText("Student Registration Form")),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            GenderRadioButtons = $("#genterWrapper"),
            MobileNumberInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbySelect = $("#hobbiesWrapper"),
            uploadPictureField = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            listOfStates = $("#state"),
            stateInput =$("#react-select-3-input"),
            cityList = $("#city"),
            cityInput =$("#react-select-4-input"),
            submitRegistrationButton = $("#submit"),
            successfulText = $(byText("Thanks for submitting the form")),
            resultsTable = $(".table-responsive");


    public CalendarPage calndar = new CalendarPage();


    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        titleForm.shouldHave(Condition.visible);
        return this;
    }

    public RegistrationPage typeFirstName(String name) {
        firstNameInput.setValue(name);
        return this;
    }

    public RegistrationPage typeLatsName(String name) {
        lastNameInput.setValue(name);
        return this;
    }

    public RegistrationPage typeEmail(String email) {
        userEmailInput.setValue(email);
        return this;
    }

    public RegistrationPage genderSelect(String gender) {
        GenderRadioButtons.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage typePhone(String phone) {
        MobileNumberInput.setValue(phone);
        return this;
    }

    public RegistrationPage typeSubject(String subject) {
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage hobbySelect(String value) {
        hobbySelect.find(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture() {
        uploadPictureField.uploadFile(new File("src/test/resources/1.png"));
        return this;
    }

    public RegistrationPage typeAddress(String address) {
        addressInput.setValue(address);
        return this;
    }

    public RegistrationPage openListOfStates(String value) {
        listOfStates.scrollIntoView(true);
        listOfStates.click();
        stateInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage openListOfCities(String value) {
        cityList.click();
        cityInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage submitTheForm() {
        submitRegistrationButton.click();
        return this;
    }

    public RegistrationPage resultForm(String key, String value) {
        successfulText.shouldHave(Condition.visible);
        resultsTable.$(byText(key)).parent().shouldHave(text(value));
        return this;

    }
}
