package tek.tdd.tests;

import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;

public class CreateAccountTest extends UIBaseClass {

    /*CreateAccountTest
    Story 4: Navigate to Create Account page and Create new Account
    Validate New Account Created.*/


    @Test
    public void validateAccountCreated () {
        clickOnElement(newAccountPage.createAccountButton);
        sendText(newAccountPage.nameInput, "Charlie");
        sendText(newAccountPage.emailInput, "Charlie234@gmail.com");
        sendText(newAccountPage.passwordInput, "Password123!");
        sendText(newAccountPage.confirmPasswordInput, "Password123!");
        clickOnElement(newAccountPage.signUpButton);

    }
}
