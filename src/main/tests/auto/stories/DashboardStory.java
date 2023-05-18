package auto.stories;

import auto.WebPageDriver;
import auto.pages.DashboardPage;

public class DashboardStory {

    private WebPageDriver driver;

    public DashboardStory(WebPageDriver driver) {
        this.driver = driver;
    }

    public DashboardStory signOut(){
        DashboardPage dp = new DashboardPage(driver);
        dp.signOut();
        return this;
    }
}
