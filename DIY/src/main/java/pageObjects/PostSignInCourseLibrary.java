package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PostSignInCourseLibrary {

	public PostSignInCourseLibrary(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// driver.findElement(By.xpath("//android.widget.TextView[@text='Course
	// Library']"))
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Course Library']")
	public WebElement courseLibrary;

	public WebElement getcourseLibrary() {
		return courseLibrary;
	}

}
