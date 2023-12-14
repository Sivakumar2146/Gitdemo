package Mobiletesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Ecommece_tc_2_Error extends BaseTest {

	@Test
	public void FillForm() throws InterruptedException {

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Siva Pavi");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector())." + "scrollIntoView(text(\"Argentina\"));"))
				.click();
		// driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"
		// and @text=\"Argentina\"]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector())." + "scrollIntoView(text(\"Jordan 6 Rings\"));")).click();
		int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).size();

		for (int i = 0; i < productCount; i++) {
			String poductName = driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i)
					.getText();

			if (poductName.equalsIgnoreCase("Jordan 6 Rings")) {

				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).getText();

			}}

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);
		
		
		
		
	}

}
