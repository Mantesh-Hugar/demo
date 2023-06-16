package pageObject;

import org.openqa.selenium.By;
import actionDriver.WebActionDriver;
import fileUtil.FileLib;

public class CreateUserCredentials {
	
	public static WebActionDriver webDriverAction;
	
//	private static By clickOnVisit = By.xpath("//a[normalize-space()='here']");
//	private static By clickOnPopup=By.xpath("//*[@id=\"dismiss-button\"]");

	private static By enterEmailID = By.xpath("//input[@name='emailid']");
	private static By clickOnSubmitButton = By.xpath("//input[@name='btnLogin']");
	public static FileLib fileLib;

	public CreateUserCredentials() {
		webDriverAction = new WebActionDriver();
		fileLib = new FileLib();
	}

	public void generateCredentials(String newUser) throws Throwable {
//       webDriverAction.clickOnElement(clickOnVisit);
//       webDriverAction.acceptAlert();
//       webDriverAction.clickByJS(clickOnPopup);
//       webDriverAction.implicityWaitTime(20);

		webDriverAction.sendKeys(enterEmailID, newUser);
		Thread.sleep(2000);
		webDriverAction.clickOnElement(clickOnSubmitButton);
	}
}
