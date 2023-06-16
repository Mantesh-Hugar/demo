package pageTests;

import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import actionDriver.WebActionDriver;
import baseClass.BaseClass;
import configPropertyFile.Config_Properties;
import fileUtil.FileLib;
import pageObject.HomePage;
import pageObject.LoginPage;
import utility.DataDriven;

public class HomePageTest extends BaseClass {

	public static WebActionDriver webActionDriver;
	public static FileLib fileLib;
	public static String url;
	public LoginPage loginPage;
	public HomePage homePage;

	public HomePageTest() {
		webActionDriver = new WebActionDriver();
		fileLib = new FileLib();
		loginPage = new LoginPage();
		homePage = new HomePage();
	}

	@Test(dataProvider = "getData1s")

	public void logOutTest(Map<String, String> map) throws Throwable {

		fileLib.getPropertyData(Config_Properties.URL);
		webActionDriver.getURL(url);
		loginPage.demoSite(map.get("userID"), map.get("password"));
//		homePage.logOutPage();

	}

	@DataProvider

	public Object[][] getData1() throws Exception

	{

		String file = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\Data.xlsx";

		return new DataDriven().dataSupplier(file);

	}
}
