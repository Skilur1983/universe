package auto;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;

public class WebPageDriver {

    private ChromeDriver driver;
    private WebDriverWait wait;

    public void saveScreenShot(String screenshotPath){
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // Save the screenshot to the specified path
            FileUtils.copyFile(screenshot, new File(screenshotPath));
            Reporter.log("Screenshot saved at: " + screenshotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public WebPageDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver", "/home/dmitry/DevTool/chromedriver"); // sets path to the ChromeDriver on your drive
        this.driver = new ChromeDriver(options);

        Dimension screenSize = new Dimension(1440, 980); // sets browser window size
        driver.manage().window().setSize(screenSize);
    }

    public void quit() {
        driver.quit();
    }

    public void get(String url) {
        driver.get(url);
    }

    public void click(String xpath) {
        driver.findElementByXPath(xpath).click();
    }

    public void sendKeysByXPath(String name, String keys) {
        driver.findElementByXPath(name).sendKeys(keys);
    }

    public void waitUntil(int howLong, String xPath) {
        wait = new WebDriverWait(driver, howLong);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
    }


}
