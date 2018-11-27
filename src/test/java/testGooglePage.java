import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
        //System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

        /*String pathToChromeDriver = Paths.get(".\\drivers\\chromedriver.exe").toAbsolutePath().toString();
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        driver = new ChromeDriver();*/

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability("takesScreenshot", true);
        caps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                ".\\drivers\\phantomjs"
        );
        driver = new PhantomJSDriver(caps);
    }
    @Test
    public void start(){
        driver.navigate().to("https://google.com");
        System.out.println(driver.getTitle());
    }

    @After
    public void SetDown(){
        driver.close();
        driver.quit();
    }
}
