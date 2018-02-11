package MobileTestPack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MultiTouch {
	//WebDriver dr;
	AndroidDriver dr;
	Dimension size;
	@Test
	public void multitouch() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","moto e4");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","7.1");
		
		cap.setCapability("appPackage", "com.the511plus.MultiTouchTester");
		cap.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester");
		
		dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		size = dr.manage().window().getSize();
		System.out.println(size);
		
		int x1 = (int)(size.width*0.2);
		int y1 = (int) (size.height*0.2);
		
		int x2 = (int)(size.width*0.2);
		int y2 = (int) (size.height*0.75);
		
		int x3 = (int)(size.width*0.8);
		int y3 = (int) (size.height*0.1);
		
		int x4 = (int)(size.width*0.8);
		int y4 = (int) (size.height*0.6);
		
		int x5 = (int)(size.width*0.4);
		int y5 = (int) (size.height*0.6);
		
		TouchAction action1 = new TouchAction(dr).longPress(x1,y1).waitAction(2000);
		TouchAction action2 = new TouchAction(dr).longPress(x2,y2).waitAction(2000);
		TouchAction action3 = new TouchAction(dr).longPress(x3,y3).waitAction(2000);
		TouchAction action4 = new TouchAction(dr).longPress(x4,y4).waitAction(2000);
		TouchAction action5 = new TouchAction(dr).longPress(x5,y5).waitAction(2000);

		MultiTouchAction action = new MultiTouchAction(dr);
		
		action.add(action1).add(action2).add(action3).add(action4).add(action5).perform();
		
		Thread.sleep(5000);
		
		dr.quit();
		
		
		
		
		
	}

}
