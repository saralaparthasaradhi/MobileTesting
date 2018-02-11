package MobileTestPack;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwipeAction {
	
	AndroidDriver dr;
	Dimension size;
	@Test
	public void swipe() throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","Moto E4");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","7.1.1");
		
		capabilities.setCapability("appPackage", "com.pdanet");
		capabilities.setCapability("appActivity", "com.foxfi.HotspotSettings");
		
		dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		size= dr.manage().window().getSize();
		
		System.out.println(size);
		int starty= (int) (size.width*0.80);
		int endy= (int)(size.width*0.20);
		
		int startx,endx;
		
		startx=endx= size.height/2;
		
		dr.swipe(startx, starty, endx, endy,3000);
		
		Thread.sleep(5000);
		
		dr.swipe(endx, endy, startx, starty, 3000);
		
		dr.quit();
		
	}

}
