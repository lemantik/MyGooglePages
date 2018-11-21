import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
//import java.nio.file.Paths;

public class testGooglePage {

    public WebDriver driver;

    @Before
    public void setUp(){

        DesiredCapabilities capability = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL("http://10.6.220.14:4444/wd/hub"), capability);

        /*driver.get(siteBase.toString());
        String page = driver.getPageSource();*/

        /*String pathToChromeDriver = Paths.get(".\\drivers\\chromedriver.exe").toAbsolutePath().toString();
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        driver = new ChromeDriver();*/

    }
    @Test
    public void start(){
        driver.navigate().to("https://google.com");
    }

    @After
    public void SetDown(){
        driver.close();
        driver.quit();
    }
}
