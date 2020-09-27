package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;
	public PageBase(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void openNewTab(String url) {
		driver.switchTo().newWindow(WindowType.WINDOW.TAB);
		driver.get(url);
	}
	public void goToFirstTab() {
		Set<String> handles=driver.getWindowHandles();
		List<String> lS = new ArrayList<String>(handles);
		String parentWindow= lS.get(0);
		String chiledWindo = lS.get(1);
		driver.switchTo().window(parentWindow);
	}
	public void goToSecondtTab() {
		Set<String> handles=driver.getWindowHandles();
		List<String> lS = new ArrayList<String>(handles);
		String parentWindow= lS.get(0);
		String chiledWindo = lS.get(1);
		driver.switchTo().window(chiledWindo);
	}
	public void goToThirdTab() {
		Set<String> handles=driver.getWindowHandles();
		List<String> lS = new ArrayList<String>(handles);
		String parentWindow= lS.get(0);
		String chiledWindo = lS.get(1);
		String thiredWindo = lS.get(2);
		driver.switchTo().window(thiredWindo);
	}


}
