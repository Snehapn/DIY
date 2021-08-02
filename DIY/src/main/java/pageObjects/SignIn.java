package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignIn {

	public SignIn(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// driver.findElement(By.xpath("//android.widget.EditText[@text='Nickname']"))
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Nickname']")
	public WebElement nickname;

	// driver.findElement(By.xpath("//android.widget.EditText[@text='Password']"))
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
	public WebElement password;

	// driver.findElement(By.xpath("//android.widget.TextView[@text='Sign
	// In']")).click();
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sign In']")
	public WebElement signIn;

	public WebElement getnickname() {
		return nickname;
	}

	public WebElement getpassword() {
		return password;
	}

	public WebElement getsignIn() {
		return signIn;
	}

}
