package ru.zets.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class CalendarPage {
        private SelenideElement
                selectCalendar = $("#dateOfBirthInput"),
                yearSelector = $(byClassName("react-datepicker__year-select")),
                mountsSelector = $(byClassName("react-datepicker__month-select"));



        public void setDate(String year, String month, String day){
            selectCalendar.click();
            yearSelector.click();
            yearSelector.selectOptionByValue(year);
            mountsSelector.click();
            mountsSelector.selectOptionContainingText(month);
            $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();

        }
}
