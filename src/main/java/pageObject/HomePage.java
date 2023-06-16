package pageObject;

import org.openqa.selenium.By;

import actionDriver.WebActionDriver;

public class HomePage {
	
	public static WebActionDriver webActionDriver;
	private static By logout=By.xpath("//a[normalize-space()='Log out']");

	public HomePage() {
		webActionDriver = new WebActionDriver();
	}
	
	public void logOutPage() throws Throwable {
		webActionDriver.clickOnElement(logout);		
	}	
}
