package pageTests;

import java.util.Map;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import actionDriver.WebActionDriver;
import baseClass.BaseClass;
import configPropertyFile.Config_Properties;
import fileUtil.FileLib;
import pageObject.LoginPage;
import utility.DataDriven;

public class LoginPageTest extends BaseClass {

	public static WebActionDriver webActionDriver;
	private static FileLib fileLib;
	public static String url;
	public LoginPage loginPage;

	public LoginPageTest() {
		webActionDriver = new WebActionDriver();
		fileLib = new FileLib();
		loginPage = new LoginPage();

	}

	@Test(dataProvider = "getData2")

	public void firstTest(Map<String, String> map) throws Throwable

	{
		// webActionDriver.getURL(fileLib.getPropertyData(Config_Properties.URL));
		// OR
		url = fileLib.getPropertyData(Config_Properties.URL);
		webActionDriver.getURL(url);
		loginPage.demoSite(map.get("userID"), map.get("password"));

	}

	@DataProvider

	public Object[][] getData2() throws Exception

	{

		String file = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\Data.xlsx";

		return new DataDriven().dataSupplier(file);

	}

}
