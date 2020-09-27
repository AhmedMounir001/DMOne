package tests;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import pages.PageTest;

public class TestRun extends TestBase{
	
	String gitHub="https://github.com";
	String mvnRepo="https://mvnrepository.com";
	String google="https://www.google.com/";
	PageTest obj;
	@Test
	public void getURL() throws InterruptedException {
		driver.get(gitHub);
		obj = new PageTest(driver);
		
		obj.openNewTab(mvnRepo);
		obj.openNewTab(google);
		obj.goToSpecificTAB();
		Thread.sleep(3000);
		//obj.openNewTab(gitHub);
	}

}
