package MobileTestPack;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Amazon {

	WebDriver dr;
	
	@Test
	public void amazonDemo() throws MalformedURLException, InterruptedException {
		//File file = new File ("C:/Sarala-testing/Appium/Backup_files/com.amazon.mShop.android.shopping.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Moto E4");
		cap.setCapability("platformVersion","7.1");
		cap.setCapability("platformName","Android");
		
		cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		
		//cap.setCapability("app", file.getAbsolutePath());
		dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(5000);
		dr.quit();
		
	}
	
}
