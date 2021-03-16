package tests;
import java.net.MalformedURLException;
import helper.ExtentReportHelper;
import helper.Properties1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import utility.Base1;
import utility.DriverUtils;



public class Wallethub_Assignment_Test_v1 extends Base1{
	LoginPage1 obj_login=new LoginPage1();
	HomePage obj_home=new HomePage();
	DriverUtils d=new DriverUtils();
	public static ExtentTest test;

	@BeforeClass
	public void intializeDriver() throws Exception
	{
		test.pass("Driver got initialized");
		test=ExtentReportHelper.extent.createTest("TC001_Verify_Login_functionality_facebook").assignAuthor("Author: Sudhakar");	
		d.IntializeDriver(Properties1.helperProperty("fb_URL"));
		test.pass("User is able to launch Facebook application successfully with URL"+Properties1.helperProperty("fb_URL"));
	}
	
	@Test
	public void test_wallethub_assignment_001() throws Exception
	{	
		//Entering username
		obj_login.enterUsername();
		test.pass("enter username is:"+Properties1.helperProperty("username"));
	
		//Entering password
		obj_login.enterPassword();
		test.pass("enter password is::********");
		
		//hitting login button
		obj_login.loginButton();
		test.pass("User hit on login button");
		
		//validating page title
		obj_login.validateTitle(Properties1.helperProperty("loginpagetitle"));
		test.pass("Validated title successfully with page title as:"+Properties1.helperProperty("loginpagetitle"));
		
		
		//clicking on home button
		obj_home.clickHome();
		test.pass("User is able to click on Home Button successfully");
		
		//script to post comments
		obj_home.clickontext();
		test.pass("User is able to click on text: What's on your mind, Sudhakar");
		
		
		//Typing post
		obj_home.enterPost(Properties1.helperProperty("postMessage"));
		test.pass("Entered message is: "+Properties1.helperProperty("postMessage"));
		
		//clicking on post button
		obj_home.clickonPost();
		test.pass("User clicked on post button");

    }
	
	
	@AfterClass
	public void ClosingDriver() throws MalformedURLException
	{
		d.closeDriver();
		test.pass("Driver got terminated successfully");	
	}

}
