package MobileTestPack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	//WebDriver dr;
	AndroidDriver dr;
	@Test
	public void calculator() throws MalformedURLException, InterruptedException {
		
        DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","Moto E4");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","7.1.1");
		
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		capabilities.setCapability("appActivity", "com.android.calculator2.CalculatorGoogle");
		
		dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		Thread.sleep(5000);
		/*dr.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
		Thread.sleep(2000);

		dr.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		Thread.sleep(2000);

		dr.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
		Thread.sleep(2000);

		dr.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		Thread.sleep(5000);
		String ans = dr.findElement(By.id("com.google.android.calculator:id/result")).getText();
		System.out.println("============");
		System.out.println(ans);
		System.out.println("=============");*/

		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(4000);
		dr.findElementByAndroidUIAutomator("UiSelector().text(\"4\")").click();
		Thread.sleep(2000);
		dr.findElementByAndroidUIAutomator("UiSelector().text(\"×\")").click();
		Thread.sleep(2000);
		dr.findElementByAndroidUIAutomator("UiSelector().text(\"2\")").click();
		Thread.sleep(2000);
		dr.findElementByAndroidUIAutomator("UiSelector().text(\"=\")").click();
		Thread.sleep(5000);
		
		dr.quit();


	}
}
