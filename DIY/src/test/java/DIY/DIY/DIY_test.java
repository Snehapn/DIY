package DIY.DIY;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.PostSignInCourseLibrary;
import pageObjects.PreSignInCourseLibraryPage;
import pageObjects.SignIn;

public class DIY_test extends Base {
	@Test
	public void totalValidation() throws InterruptedException, IOException {
		
		service = startServer();
		AndroidDriver<AndroidElement> driver = capabilities("DIY_App");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PreSignInCourseLibraryPage presignin = new PreSignInCourseLibraryPage(driver);
		SignIn signin = new SignIn(driver);
		PostSignInCourseLibrary postsignin = new PostSignInCourseLibrary(driver);

		presignin.getnavigationOption().get(0).click();
		signin.getsignIn().click();

		signin.getnickname().sendKeys("testname1");
		signin.getpassword().sendKeys("testname1");
		signin.getsignIn().click();

		String validateTest = postsignin.getcourseLibrary().getText();
		Assert.assertEquals(validateTest, "Course Library");
		System.out.println(validateTest);

		service.stop();
	}
}