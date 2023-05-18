package auto;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebSettings {

    public WebPageDriver driverD;

    @BeforeTest
    public void setUp() {
        driverD = new WebPageDriver(); // it should be set before @After
    }

    @AfterTest
    public void close() {
        driverD.quit(); // don't forget to quit. Otherwise, there will be zombie
    }
}
