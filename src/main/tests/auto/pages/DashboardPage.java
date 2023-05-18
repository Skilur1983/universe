package auto.pages;

import auto.WebPageDriver;

public class DashboardPage {

    private WebPageDriver driverD;
    private final String NEWPOSTBUTTON = "//a[@class='header__link header__link--primary button']";
    private final String AVATARBUTTON = "//button[@class='dropdown__button']";
    private final String SIGNOUTBUTTON = "//button[text()='Sign out']";

    public DashboardPage(WebPageDriver driverD){
        this.driverD = driverD;
    }

    public DashboardPage clickNewPostButton(){
        driverD.waitUntil(10, NEWPOSTBUTTON);
        driverD.click(NEWPOSTBUTTON);

        return this;
    }

    public DashboardPage signOut() {
        driverD.waitUntil(5, AVATARBUTTON);
        driverD.click(AVATARBUTTON);
        driverD.click(SIGNOUTBUTTON);

        return this;
    }
}
