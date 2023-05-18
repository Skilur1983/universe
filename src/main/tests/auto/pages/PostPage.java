package auto.pages;

import auto.WebPageDriver;

public class PostPage {

    private WebPageDriver driverD;
    private final String POSTTITLE = "//h2";
    private final String ENTERTITLE = "//h2[@class='post-form__title form__heading form__control editable']";
    private final String POSTBODY = "//p[@class='post-form__description form__control editable']";
    private final String ENTERBODY = "//p[@class='post-form__description form__control editable']";
    private final String POSTBUTTON = "//button[text()='Post']";

    public PostPage(WebPageDriver driverD) {
        this.driverD = driverD;
    }

    public PostPage enterPostTitle(String postTitle) {
        driverD.waitUntil(10, POSTTITLE);
        driverD.click(POSTTITLE);
        driverD.sendKeysByXPath(ENTERTITLE, postTitle);

        return this;
    }

    public PostPage enterPostBody(String postBody) {
        driverD.click(POSTBODY);
        driverD.sendKeysByXPath(ENTERBODY, postBody);

        return this;
    }

    public PostPage sendPost() {
        driverD.click(POSTBUTTON);

        return this;
    }


}
