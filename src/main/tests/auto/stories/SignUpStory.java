package auto.stories;

import auto.pages.IndexPage;
import auto.pages.SignUpPage;
import auto.WebPageDriver;

public class SignUpStory {

    private WebPageDriver driver;

    public SignUpStory(WebPageDriver driver) {
        this.driver = driver;
    }

    public SignUpStory signUp(String firstName, String lastName, String email, String password) {
        IndexPage index = new IndexPage(driver);
        index.signUp();
        SignUpPage signUp = new SignUpPage(driver);
        signUp.enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .enterPassword(password)
                .signUp()
                .OKAfterSignUpClick();
        return this;
    }
}
