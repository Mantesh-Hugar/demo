package baseClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import actionDriver.WebActionDriver;
import extentReport.ExtentManager;

public class BaseClass {

	public static WebActionDriver webActionDriver;
	private static ExtentManager extentManager;

	public BaseClass() {
		extentManager = new ExtentManager();
		webActionDriver = new WebActionDriver();
	}

	@BeforeSuite
	public void extentReport() {
		extentManager.setUpExtentReport();

	}

	
	@BeforeClass
	@Parameters({ "browser" })
	public void launchBrower(String browserName) {
		webActionDriver.selectBrowser(browserName);
	}
	
	@BeforeMethod
	@Parameters({ "browser" })
	public void launchBrowerIfClosed(String browserName) {
		if(webActionDriver.checkBroswerSession()==null) {
		webActionDriver.selectBrowser(browserName);
		} else {
			
		}
	}
	
	@AfterMethod
	public void closeBrowser() {
		webActionDriver.closeBrowser();
	}
	
	
//	@Parameters({ "author", "category" })
//	@AfterTest
//	public void assignAuthorAndCategory(String assignAuthor, String assignCategory) {
//		Capabilities capbil = ((RemoteWebDriver) webActionDriver.getDriver()).getCapabilities();
//		String device = capbil.getBrowserName() + "_"
//				+ capbil.getBrowserVersion().substring(0, capbil.getBrowserVersion().indexOf("."));
//		extentManager.extent_SystemInfo(device, assignAuthor, assignCategory);
//
//	}

	@AfterSuite
	public void endExtentReport() throws Exception {
		extentManager.endExtentReport();
	}
}
