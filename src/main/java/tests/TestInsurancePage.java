package tests;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Base1;
public class TestInsurancePage {
	public static By TabReviews = By.xpath("//span[contains(text(),'Reviews') and @class='nav-txt']");
	public static String svg_list="(//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']/*[name()='svg'])";
	public static By drpventure = By.xpath("(//span[@class='dropdown-placeholder'])[2]");
	public static By drpval = By.xpath("(//li[@class='dropdown-item'])[14]");
	public static By inpTxtArea = By.xpath("//textarea[@class='textarea wrev-user-input validate']");
	public static By btnSubmit = By.xpath("//div[contains(text(),'Submit')]");
	public static By TabLogin = By.xpath("//a[text()='Login']");
	public static By inpUsername = By.xpath("//input[@id='em-ipt']");
	public static By inpPassword = By.xpath("//input[@id='pw1-ipt']");
	public static By BtnLogin = By.xpath("//button[@type='button']");
	
	public static void validatingPageTitle(String title) throws IOException
	{
		if(Base1.driver.getTitle().equals(title))
		{	
			System.out.println("Validated title successfully");
		}
		else
		{
			System.out.println("Failed to validate title");
		}
	}

	
	public static void hoverandclickReviews() throws IOException, InterruptedException
	{
		List<WebElement> list = Base1.driver.findElements(By.xpath(TestInsurancePage.svg_list));
		Actions act = new Actions(Base1.driver);
		//hovering and clicking on reviews rating as per assignment
		 for (int i = 0; i < list.size(); i++) {
			 act.moveToElement(list.get(i)).perform();
			 Thread.sleep(1000);
			 //putting logic to click at iteration 4 as per the assignment 
			 if(i==3)
			 {
				 act.click(list.get(i)).build().perform();
				 break;
			 }    
		    } 		
	}
	public static void validatingStringunderPageSource(String title) throws IOException
	{
	
	if(Base1.driver.getPageSource().contains(title))
	{	
		System.out.println("Validated message successfully with content as:"+title);
	}
	else
	{
		System.out.println("Message not existing with content as:"+title);
	}
	}
}
