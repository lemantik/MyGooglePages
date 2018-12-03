import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.nio.file.Paths;

public class testGooglePage {

    public WebDriver driver;

    @Before
    public void setUp(){

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability("takesScreenshot", true);
        caps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "drivers/phantomjs.exe"
        );
        driver = new PhantomJSDriver(caps);
    }
    @Test
    public void start(){
        driver.navigate().to("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println(((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64));
    }

    @After
    public void SetDown(){
        driver.close();
        driver.quit();
    }
}
