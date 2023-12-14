package Mobiletesting;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL; // Add this import statement

public class Miscellanous  extends BaseTest{

	@Test
	public void WifiSettingName() throws MalformedURLException {

		// code to start server
		// AndroidDriver , IOSDriver              
		// appium code -. appium server -> moblie
	
		//ConfigureAppium();
		
		
		
		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		//driver.startActivity(activity);
		
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	    driver.findElement(By.id("android:id/checkbox")).click();
	    
	    DeviceRotation landscape=new DeviceRotation (0,0,90);
	    driver.rotate(landscape);
	    
	    driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	    
	    driver.setClipboardText("Siva WIFI");
	    
	    driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
	    driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    driver.pressKey(new KeyEvent(AndroidKey.HOME));
	    
		
	    
		//tearDown();
	}
}
