import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by sumanth on 11/9/18.
 */
public class BaseClass {
    static AndroidDriver driver;
    @Before
    public void setup() throws MalformedURLException {
        //Installs and opens the app and navigated to SecretKey activity
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "57fada85");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("appPackage", "com.stooltool");
        capabilities.setCapability("appActivity", "com.stooltool.activities.SecretKeyActivity");
        File appDir = new File("/home/sumanth/testfolder");
        File app = new File(appDir, "app-universal-debug-29-08-19-08.apk");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @After
    public void die(){
        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {

    }

}
