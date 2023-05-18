package auto.stories;

import auto.WebPageDriver;
import auto.pages.DashboardPage;
import auto.pages.PostPage;

public class PostStory {

    private WebPageDriver driver;

    public PostStory(WebPageDriver driver) {
        this.driver = driver;
    }

    public PostStory createPost(String postTitle, String postBody) {

        DashboardPage dash = new DashboardPage(driver);
        dash.clickNewPostButton();
        PostPage post = new PostPage(driver);
        post.enterPostTitle(postTitle)
                .enterPostBody(postBody)
                .sendPost();

        return this;
    }
}
