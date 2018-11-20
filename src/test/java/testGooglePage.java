import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class testGooglePage {

    public WebDriver driver;

    @Before
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        String pathToChromeDriver = Paths.get(".\\drivers\\chromedriver.exe").toAbsolutePath().toString();
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        driver = new ChromeDriver();

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
