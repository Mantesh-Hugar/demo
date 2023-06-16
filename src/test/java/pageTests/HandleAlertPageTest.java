package pageTests;

import java.util.Map;

import org.testng.annotations.Test;
import actionDriver.WebActionDriver;
import baseClass.BaseClass;
import configPropertyFile.Config_Properties;
import fileUtil.FileLib;
import pageObject.HandleAlertPage;
import pageObject.HomePage;
import pageObject.LoginPage;

public class HandleAlertPageTest extends BaseClass {

	public static WebActionDriver webActionDriver;
	private static FileLib fileLib;
	public static String url;
	public LoginPage loginPage;
	public HomePage homePage;
	public HandleAlertPage handleAlertPage;

	public HandleAlertPageTest() {
		webActionDriver = new WebActionDriver();
		fileLib = new FileLib();
		loginPage = new LoginPage();
		homePage = new HomePage();
		handleAlertPage = new HandleAlertPage();
	}
	
	@Test
	public void handleAlert(Map<String, String> map) throws Throwable {
		url=fileLib.getPropertyData(Config_Properties.URL);
		webActionDriver.getURL(url);
		loginPage.demoSite(map.get("userID"), map.get("password"));
		homePage.logOutPage();
		handleAlertPage.handlingAlert();
	}
}
