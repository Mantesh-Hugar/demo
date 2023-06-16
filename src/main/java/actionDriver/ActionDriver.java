package actionDriver;

import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface ActionDriver {

	public WebDriver getDriver();
	
	public void selectBrowser(String browserName);
	
	public void getURL(String url);
	
	public void scrollByVisibilityOfElement( By ele);
	
	public void pageLoadTimeOutIs(int timeInSec);
	
	public void implicityWaitTime(int timeInSec);
	
	public void ClearBrowserCache();
	
	public void nagivateToGivenUrl(String url, int timeInSec);
	
	public void nagivateToNextpage();
	
	public void nagivateToPreviouspage();
	
	public void sendKeys(By ele, String text);
	
	public WebElement getElement(By ele);
	
	public String isElementDisplayed(By ele);
	
	public WebDriverWait getInstanceOfWebDriverWait(int timeInSec);
	
	public void waitForTitleContains(String titleText, int timeInSec);
	
	public void waitForElementToVisable(By ele, int timeInSec);
	
	public String isElementEnabled(By ele);
	
	public String isElementSelected(By ele);
	
	public void clickOnElement(By ele);
	
	public Select getInstancesOfSelect(By ele);
	
	public void selectByValue(By ele,String value);
	
	public void selectByIndex(By ele,int indexValue);
	
	public void selectByVisibleText(By ele,String visibleText);
	
	public void deSelectByVisibleText(By ele, String visibleText);
	
	public void deSelectByValue(By ele,String value);
	
	public void deSelectByIndex(By ele,int indexValue);
	
	public void deSelectAll(By ele);
	
	public void getAllSelectOption(By ele);
	
	public void getFristSelected(By ele);
	
	public  Alert InitiatingAlert();
	
	public void acceptAlert();
	
	public void getTextFromAlert();
	
	public void dismissAlert();
	
	public void alertSendKeys(String text);
	
	public void scrollByPixelVertically(int pixelValue);
	
	public void scrollByPixelValues(int X,int Y);
	
	public void scrollByPixelHorizontal(int pixelValue);
	
	public void getCurrentURL();
	
	public void getTitle();
	
	public  String getWindowHandle();
	
	public  Set<String> getWindowHandles();
	
	public String getScreenShot(String fileName);
	
	public void switchToFrame(By ele);
	
	public void switchToParentFrame();
	
	public void switchToDefaultFrame();
	
	public String getScreenShot() throws Exception;
	
	public void enterTextThroughJS(By ele, String text);
	
	public void clickByJS(By ele);
	
	public SessionId checkBroswerSession();
	
	public void openNewWindow();
	
	public void openNewTab();
	
	public String getElementScreenshot(By ele);
	
	public void clickByWebDriverWait(By ele, int timeInSec);
	
	public void sendKeysByWebDriverWait(By ele, int timeInSec, String text);
	
	public Actions getInstanceOfAction();

	public void closeBrowser();
	
	public void highlighter(WebElement element);
	
}
