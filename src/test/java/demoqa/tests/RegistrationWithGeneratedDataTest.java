package demoqa.tests;

import demoqa.checks.RegistrationPageCheckups;
import demoqa.components.CalendarComponent;
import demoqa.pageobjects.RegistrationPage;
import demoqa.utils.Fields;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegistrationWithGeneratedDataTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationPageCheckups registrationPageCheckups = new RegistrationPageCheckups();
    CalendarComponent calendarComponent = new CalendarComponent();
    Fields fields = new Fields();

    @DisplayName("Registration test w generated data")
    @Test
    void  userRegistrationTest () {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName(fields.userFirstName)
                .setLastName(fields.userLastName)
                .setUserEmail(fields.userEmail)
                .setGender(fields.userGender)
                .setUserMobileNumber(fields.userMobileNumber)
                .setSubject(fields.userSubject)
                .setHobbies(fields.userHobby)
                .setAddress(fields.userAddress)
                .uploadFile(fields.userPhoto)
                .selectState(fields.userState)
                .selectCity(fields.userCity);

        calendarComponent.setBirthDate(fields.userBirthDay, fields.userBirthMonth, fields.userBirthYear);

        registrationPage.submitInformation();

        registrationPageCheckups
                .checkResult("Student Name", fields.userFullName)
                .checkResult("Student Email", fields.userEmail)
                .checkResult("Gender", fields.userGender)
                .checkResult("Mobile", fields.userMobileNumber)
                .checkResult("Date of Birth", fields.userFullBirthday)
                .checkResult("Subjects", fields.userSubject)
                .checkResult("Hobbies", fields.userHobby)
                .checkResult("Picture", fields.userPhoto)
                .checkResult("Address", fields.userAddress)
                .checkResult("State and City", fields.userStateAndCity);
    }

}
