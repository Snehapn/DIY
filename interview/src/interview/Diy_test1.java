package interview;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Diy_test1 {
	@Test
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		File appDir = new File("src");
		File app = new File(appDir, "app-stage-release.apk");
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_30_x86");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	Thread.sleep(6000);
	//	driver.findElement(By.xpath("//android.widget.TextView[@text ='Continue']")).click();
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//android.widget.TextView[@text ='Continue']")).click();
	//	driver.findElement(By.xpath("//android.widget.TextView[@text ='Done']")).click();
		Thread.sleep(12000);
		// driver.findElementsByClassName("android.widget.ImageView").get(29).click();
		// driver.findElement(By.xpath("(//android.widget.ImageView)[2]")).click();
		driver.findElements(
				By.xpath("//android.widget.ImageView[@resource-id ='com.diy.stage:id/bottom_navigation_item_icon']"))
				.get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Sign In']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.EditText[@text='Nickname']")).sendKeys("testname1");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("testname1");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Sign In']")).click();
		Thread.sleep(10000);

		String validateTest = driver.findElement(By.xpath("//android.widget.TextView[@text='Course Library']"))
				.getText();
		Assert.assertEquals(validateTest, "Course Library");
		System.out.println(validateTest);

	}
}