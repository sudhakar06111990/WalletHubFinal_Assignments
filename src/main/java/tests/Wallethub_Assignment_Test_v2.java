package tests;
import java.net.MalformedURLException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import helper.Properties1;
import utility.Base1;
import utility.DriverUtils;

public class Wallethub_Assignment_Test_v2 extends Base1 {
	public static ExtentTest t;
	LoginPage1 obj_login=new LoginPage1();
	HomePage obj_home=new HomePage();
	DriverUtils d=new DriverUtils();
	public static ExtentTest test;
	public static ExtentSparkReporter report;
	

	@BeforeClass
	public void intializeDriver() throws Exception
	{
		d.IntializeDriver(Properties1.helperProperty("wallet_URL"));
		t.pass("Driver got initialized");
	}
	
	
	@Test
	public void test_wallethub_assignment_002() throws Exception
	{	
		//Clicked on reviews tab
		Base1.driver.findElement(TestInsurancePage.TabReviews).click();
		t.pass("User clicked on Reviews Tab");
		Thread.sleep(2000);		
		
		//hovering and clicking on reviews rating as per assignment
		TestInsurancePage.hoverandclickReviews();
		t.pass("User hovered and clicked on reviews rating as per assignment");
		Thread.sleep(4000);
		 
		 //Clicked on dropdown 
		 Base1.driver.findElement(TestInsurancePage.drpventure).click();
		 t.pass("User clicked on dropdown");
		 Thread.sleep(500);
		 
		 //Selected Health Insurance from the dropdown
		 Base1.driver.findElement(TestInsurancePage.drpval).click();
		 t.pass("User selected Health Insurance from the dropdown");
		 Thread.sleep(500);
		 
		 //Entered long comment
		 Base1.driver.findElement(TestInsurancePage.inpTxtArea).sendKeys(Properties1.helperProperty("comment"));
		 t.pass("Entered long comment as: "+Properties1.helperProperty("comment"));
		 Thread.sleep(3000);
		 
		 //hit submit button at the top
		 Base1.driver.findElement(TestInsurancePage.btnSubmit).click();
		 t.pass("User hit on submit button at the top");
		 Thread.sleep(7000);
		 
		 //Validate the title after hitting submit button 
		 TestInsurancePage.validatingPageTitle(Properties1.helperProperty("registerpagetitle"));
		 t.pass("Validated title of the page successfully with page title as: "+Properties1.helperProperty("registerpagetitle"));
		 
		 
		 //Hit login tab to login
		 Base1.driver.findElement(TestInsurancePage.TabLogin).click();
		 Thread.sleep(1000);	
		 t.pass("User hit on login tab to login");

		
		 //enter valid username
		 Base1.driver.findElement(TestInsurancePage.inpUsername).sendKeys(Properties1.helperProperty("username_wallet"));
		 Thread.sleep(1000);
		 t.pass("Entered username is: "+Properties1.helperProperty("username_wallet"));

		 //enter valid password
		 Base1.driver.findElement(TestInsurancePage.inpPassword).sendKeys(Properties1.helperProperty("password_wallet"));
		 Thread.sleep(1000);
		 t.pass("Entered password is: ********");

		 
		 //Hit login button
		 Base1.driver.findElement(TestInsurancePage.BtnLogin).click();
		 Thread.sleep(10000);	
		 t.pass("Logged in successfully into wallet hub portal");
		
		//Validate the comments added after login under reviews lists 
		TestInsurancePage.validatingStringunderPageSource(Properties1.helperProperty("comment"));	
		 t.pass("Validate the comments successfully after adding under reviews lists and comment is: " +Properties1.helperProperty("comment"));
			
    }
	
	@AfterClass
	public void ClosingDriver() throws MalformedURLException
	{
		d.closeDriver();
		test.pass("Driver got terminated successfully");	
	}

}
