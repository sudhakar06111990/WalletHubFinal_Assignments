package tests;
import java.io.IOException;
import org.openqa.selenium.By;
import helper.Properties1;
import utility.Base1;
public class LoginPage1 {
	public static By txtusername = By.xpath("(//*[@name='email'])[1]");
	public static By txtpassword = By.xpath("(//*[@name='pass'])[1]");
	public static By btnlogin = By.xpath("//*[@value='Log In']");
	public static By txtafterlogin = By.xpath("(//span[contains(text(),'Sudhakar')])[1]");
	

	
			
	public void enterUsername() throws Exception
	{
		Base1.driver.findElement(txtusername).sendKeys(Properties1.helperProperty("username"));
		Thread.sleep(500);
	}
	public void enterPassword() throws Exception
	{
		Base1.driver.findElement(txtpassword).sendKeys(Properties1.helperProperty("password"));
		Thread.sleep(500);
	}
	public void loginButton() throws IOException, InterruptedException
	{
		Base1.driver.findElement(btnlogin).click();
		Thread.sleep(2000);
	}
	
	public void validateTitle(String title) throws IOException
	{
		if(txtafterlogin.toString().contains(title))
		{
			//title got passed
			System.out.println(txtafterlogin.toString());
		}
		else
		{
			//title is not matching
		}
	}

}
