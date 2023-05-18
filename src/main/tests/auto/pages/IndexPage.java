package auto.pages;

import auto.WebPageDriver;
public class IndexPage {

    private WebPageDriver driverD;
    private final String SIGNUP = "//a[text()='Sign up']";
    private final String SIGNIN = "//a[text()='Sign in']";

    public IndexPage(WebPageDriver driverD) {
        this.driverD = driverD;
    }

    public IndexPage signUp() {
        driverD.waitUntil(5, SIGNUP);
        driverD.click(SIGNUP);

        return this;
    }

    public IndexPage signIn() {
        driverD.waitUntil(10, SIGNIN);
        driverD.click(SIGNIN);

        return this;
    }
}
