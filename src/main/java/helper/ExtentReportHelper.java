package helper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportHelper {
	public static ExtentReports extent;
	public ExtentSparkReporter spark;
	@BeforeClass
	public void extentTest() {
		extent=new ExtentReports();
		spark=new ExtentSparkReporter("index.html");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Wallethub Project Assignment Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);		
	}
	@AfterTest
	public void endReport() {
		extent.flush();
	}

}
