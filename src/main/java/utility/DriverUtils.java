package utility;
import utility.Base1;
import utility.DriverUtils;
import java.net.MalformedURLException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentTest;
import helper.Properties1;

public class DriverUtils {
public void IntializeDriver(String URL1) throws Exception
{
	DesiredCapabilities caps =DesiredCapabilities.firefox();
	caps.setBrowserName("firefox");
	caps.setCapability("binary", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	Base1.driver=new FirefoxDriver(caps);
	Base1.driver.manage().window().maximize();
	Base1.driver.get(URL1);
	//test.pass("User is able to launch No broker application successfully");
}

public void closeDriver() throws MalformedURLException
{
	Base1.driver.close();
	Base1.driver.quit();
	//test.pass("User is able to close driver successfully");
}

}
