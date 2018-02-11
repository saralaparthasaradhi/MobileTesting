package MobileTestPack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Demo2 {
	AndroidDriver dr;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","Moto E4");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("appPackage","com.android.contacts");
		capabilities.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
		
		dr = new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.android.contacts:id/floating_action_button\")").click();
		Thread.sleep(5000);
		dr.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.android.contacts:id/right_button\")").click();
		Thread.sleep(5000);
		
		dr.quit();
		
	}
}