package appiumtests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	
	
	public static void main(String[] args) {
		try {
			openCalculator();
		    }
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
		}

	public static void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "SM-G570F");
		cap.setCapability("udid", "42003bf74e31c3cb");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0.0");
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application Started......");
		
		MobileElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
		MobileElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
		MobileElement three = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03"));
		MobileElement equals = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
		
		two.click();
		plus.click();
		three.click();
		equals.click();
		
		
		
		
		
	}
}
