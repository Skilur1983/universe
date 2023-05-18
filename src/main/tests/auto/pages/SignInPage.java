package auto.pages;

import auto.WebPageDriver;
public class SignInPage {

    private WebPageDriver driverD;
    private final String EMAILFIELD = "//input[@id='sign-in__email']";
    private final String PASSWORDFIELD = "//input[@id='sign-in__password']";
    private final String SIGNINBUTTON = "//button[text()='Sign in']";

    public SignInPage(WebPageDriver driverD) {
        this.driverD = driverD;
    }

    public SignInPage enterEmail(String email) {
        driverD.waitUntil(10, EMAILFIELD);
        driverD.sendKeysByXPath(EMAILFIELD, email);

        return this;
    }

    public SignInPage enterPassword(String password) {
        driverD.waitUntil(10, PASSWORDFIELD);
        driverD.sendKeysByXPath(PASSWORDFIELD, password);

        return this;
    }

    public SignInPage signIn() {
        driverD.click(SIGNINBUTTON);

        return this;
    }

}
