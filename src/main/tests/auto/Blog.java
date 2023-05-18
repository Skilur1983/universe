package auto;

import auto.stories.DashboardStory;
import auto.stories.PostStory;
import auto.stories.SignUpStory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import auto.stories.SignInStory;

public class Blog extends WebSettings {

    public String testURL = "http://127.0.0.1:7000/"; // simply paste any URL you would like to test
    public String existingEmail = "";
    public String existingPassword = "";
    public String newUserFirstName = "";
    public String newUserLastName = "";
    public String newUserEmail = "";
    public String newUserPassword = "";
    public String newPostTitle = "Post me away";
    public String newPostBody = "Lorem Ipsum and so on";
    String screenshotDirectory = "";

    @BeforeMethod
    public void start() {
        driverD.get(testURL);
    }

    @Test
    public void step1SignUp() {
        SignUpStory signUp = new SignUpStory(driverD);
        signUp.signUp(newUserFirstName, newUserLastName, newUserEmail, newUserPassword);


        driverD.saveScreenShot(screenshotDirectory+"step1SignUp"+".png");
    }

    @Test
    public void step2SignOut() {
        DashboardStory dashboardStory = new DashboardStory(driverD);
        dashboardStory.signOut();

        driverD.saveScreenShot(screenshotDirectory+"step2SignOut"+".png");
    }


    @Test
    public void step3SignIn() {
        SignInStory signIn = new SignInStory(driverD);
        signIn.signIn(existingEmail, existingPassword);

        driverD.saveScreenShot(screenshotDirectory+"step3SignIn"+".png");
    }

    @Test
    public void step4Posting() {
        PostStory post = new PostStory(driverD);
        post.createPost(newPostTitle, newPostBody);

        driverD.saveScreenShot(screenshotDirectory+"step4Posting"+".png");
    }
}
