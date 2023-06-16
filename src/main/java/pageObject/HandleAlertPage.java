package pageObject;

import actionDriver.WebActionDriver;

public class HandleAlertPage {

	public static WebActionDriver webActionDriver;

	public HandleAlertPage() {
		webActionDriver = new WebActionDriver();
	}
	
	public void handlingAlert() {
		webActionDriver.acceptAlert();
		webActionDriver.getTitle();
	}
}
