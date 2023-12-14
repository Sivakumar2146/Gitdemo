package Mobiletesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL; // Add this import statement

public class AppiumBasic  extends BaseTest{

	@Test
	public void WifiSettingName() throws MalformedURLException {

		// code to start server
		// AndroidDriver , IOSDriver              
		// appium code -. appium server -> moblie
	
		//ConfigureAppium();
		
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	    driver.findElement(By.id("android:id/checkbox")).click();
	    
	    
	    driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	    driver.findElement(By.id("android:id/edit")).sendKeys("Siva WIFI");
		driver.findElement(By.id("android:id/button1")).click();
		
	    
	    
	    
		//tearDown();
	}
}
