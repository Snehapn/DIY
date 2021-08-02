package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PreSignInCourseLibraryPage {

	public PreSignInCourseLibraryPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//driver.findElements(By.xpath("//android.widget.ImageView[@resource-id ='com.diy.stage:id/bottom_navigation_item_icon']"))
	// .get(0).click();
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id ='com.diy.stage:id/bottom_navigation_item_icon']")
	public List<WebElement> navigationOption;

	public List<WebElement> getnavigationOption() {
		return navigationOption;
	}

}
