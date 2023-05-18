package auto.stories;

import auto.pages.IndexPage;
import auto.pages.SignInPage;
import auto.WebPageDriver;

public class SignInStory {

    private WebPageDriver driver;

    public SignInStory(WebPageDriver driver) {
        this.driver = driver;
    }

    public SignInStory signIn(String email, String password) {
        IndexPage index = new IndexPage(driver);
        index.signIn();
        SignInPage signIn = new SignInPage(driver);
        signIn.enterEmail(email)
                .enterPassword(password)
                .signIn();
        return this;
    }
}
