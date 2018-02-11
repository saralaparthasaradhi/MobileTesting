package MobileTestPack;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileTestingDemo1 {

	//WebDriver driver;
	AndroidDriver driver;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Moto E4");
		capabilities.setCapability("platformVersion","7.1.1");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("appPackage","com.pdanet");
		capabilities.setCapability("appActivity", "com.foxfi.HotspotSettings");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/checkbox\")").click();
		Thread.sleep(6000);
		driver.quit();
		
		
		
		Thread.sleep(9000);
		driver.quit();
	}
	@Test
	public void testApp1() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","Moto E4");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("appPackage","com.android.contacts");
		capabilities.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
		
		driver = new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.android.contacts:id/floating_action_button\")").click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.android.contacts:id/right_button\")").click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}
