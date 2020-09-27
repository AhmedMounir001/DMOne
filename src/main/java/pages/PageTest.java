package pages;

import org.openqa.selenium.WebDriver;

public class PageTest extends PageBase {

	public PageTest(WebDriver driver) {
		super(driver);
		
	}
	

	PageBase newObj;
	public void check(String URL) {
	/*
		PageBase checkSwitch = new PageBase(driver);
		checkSwitch.switchTabs(URL);
		checkSwitch.switchTabs(URL);
		checkSwitch.getWindowHandle("0");*/
	}
	public void openNewURLinNewTab(String newURL) {
		newObj = new PageBase(driver);
		newObj.openNewTab(newURL);
	}
	public void goToSpecificTAB() {
		newObj = new PageBase(driver);
		newObj.goToFirstTab();
		newObj.goToThirdTab();
	}
}
