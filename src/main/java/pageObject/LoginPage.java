package pageObject;

import org.openqa.selenium.By;
import actionDriver.WebActionDriver;
import fileUtil.FileLib;

public class LoginPage  {
	
	public static WebActionDriver webActionDriver;
	public static By userID = By.xpath("//input[@name='uid']");
	private static By password = By.xpath("//input[@name='password']");
	private static By loginButton = By.xpath("//input[@name='btnLogin']");
	private static By logout=By.xpath("//a[normalize-space()='Log out']");
	public static FileLib fileLib;

	public LoginPage() {
		webActionDriver = new WebActionDriver();
		fileLib=new FileLib();
	}
	
	public void demoSite(String username,String pwd) throws Throwable {
		webActionDriver.sendKeys(userID,username );
		webActionDriver.ClearBrowserCache();
		webActionDriver.sendKeys(password,pwd);
		webActionDriver.isElementEnabled(loginButton);
		webActionDriver.clickOnElement(loginButton);
		webActionDriver.implicityWaitTime(20);
		webActionDriver.clickOnElement(logout);	                              
	}
}


