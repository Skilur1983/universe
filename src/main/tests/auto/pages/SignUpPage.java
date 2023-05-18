package auto.pages;

import auto.WebPageDriver;
public class SignUpPage {

    private WebPageDriver driverD;
    private final String FIRSTNAMEFIELD = "//input[@id='sign-up__first-name']";
    private final String LASTNAMEFIELD = "//input[@id='sign-up__last-name']";
    private final String EMAILFIELD = "//input[@id='sign-up__email']";
    private final String PASSWORDFIELD = "//input[@id='sign-up__password']";
    private final String CONFIRMPASSWORDFIELD = "//input[@id='sign-up__confirm-password']";
    private final String SIGNUPBUTTON = "//button[text()='Sign up']";
    private final String OKAFTERSIGNUPBUTTON = "//button[text()='OK']";

    public SignUpPage(WebPageDriver driverD) {
        this.driverD = driverD;
    }

    public SignUpPage enterFirstName(String firstName) {
        driverD.waitUntil(10, FIRSTNAMEFIELD);
        driverD.sendKeysByXPath(FIRSTNAMEFIELD, firstName);

        return this;
    }

    public SignUpPage enterLastName(String login) {
        driverD.waitUntil(10, LASTNAMEFIELD);
        driverD.sendKeysByXPath(LASTNAMEFIELD, login);

        return this;
    }
    public SignUpPage enterEmail(String email) {
        driverD.waitUntil(10, EMAILFIELD);
        driverD.sendKeysByXPath(EMAILFIELD, email);

        return this;
    }

    public SignUpPage enterPassword(String password) {
        driverD.waitUntil(10, PASSWORDFIELD);
        driverD.sendKeysByXPath(PASSWORDFIELD, password);
        driverD.sendKeysByXPath(CONFIRMPASSWORDFIELD, password);

        return this;
    }

    public SignUpPage signUp() {
        driverD.click(SIGNUPBUTTON);

        return this;
    }

    public SignUpPage OKAfterSignUpClick(){
        driverD.waitUntil(10, OKAFTERSIGNUPBUTTON);
        driverD.click(OKAFTERSIGNUPBUTTON);
        return this;
    }
}
