package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Base1;


public class HomePage {
	public static By lnkHome = By.xpath("//a[@aria-label='Home']//span");
	public static By txtmind = By.xpath("//span[contains(text(),'on your mind')]");
	public static By Spntext = By.xpath("//div[contains(@aria-label,'mind')]//span");
	public static By BtnPost = By.xpath("//span[contains(text(),'Post')]");
	
	
	
	public void clickHome() throws Exception
	{
		Base1.driver.findElement(lnkHome).click();
		Thread.sleep(5000);
	}

	public void clickontext() throws Exception
	{
		Base1.driver.findElement(txtmind).click();
		Thread.sleep(4000);
	}
	
	public void enterPost(String t) throws Exception
	{
		Actions actions = new Actions(Base1.driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.sendKeys("Hello World");
		actions.sendKeys(Keys.ENTER);	
		actions.perform();
		Thread.sleep(2000);
	}

	
	public void clickonPost() throws Exception
	{
		Base1.driver.findElement(BtnPost).click();
		Thread.sleep(2000);
	}


}
