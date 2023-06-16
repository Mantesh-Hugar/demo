package pageTests;

import java.util.Map;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import actionDriver.WebActionDriver;
import baseClass.BaseClass;
import configPropertyFile.Config_Properties;
import fileUtil.FileLib;
import pageObject.CreateUserCredentials;
import utility.DataDriven;

public class CreateUserCredentialsTest extends BaseClass {
	public static WebActionDriver webDriverAction;
	public static FileLib fileLib;
	public static String url;
	public static CreateUserCredentials createUserCredentials;

	public CreateUserCredentialsTest() {
		webDriverAction = new WebActionDriver();
		fileLib = new FileLib();
		createUserCredentials = new CreateUserCredentials();
	}

	@Test(dataProvider = "createNewUser")
	public void generateCD(Map<String, String> map) throws Throwable {
		url = fileLib.getPropertyData(Config_Properties.URLC);
		webDriverAction.getURL(url);
		webActionDriver.ClearBrowserCache();
		createUserCredentials.generateCredentials(map.get("EmaiID"));

	}

	@DataProvider
	public Object[][] createNewUser() throws Exception
	{
		String file = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\Data.xlsx";

		return new DataDriven().dataSupplier(file);
	}
}
