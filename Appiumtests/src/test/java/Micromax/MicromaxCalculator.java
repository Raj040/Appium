package Micromax;

import java.net.MalformedURLException;
import java.net.URL;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MicromaxCalculator {

	
	static AndroidDriver<WebElement>driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
	//	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 5.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Micromax A107");
		
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url ,dc);
		
        System.out.println("Application Started......");
		
		 driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
		 driver.findElement(By.id("com.android.calculator2:id/op_div")).click();
		 driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
		 driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		 
		 
		 WebElement Result = driver.findElement(By.id("com.android.calculator2:id/formula"));
		 
		if (Result.getText().equals("1")) {
			System.out.println("Result  True!!!!!!!!!!!!!");
			
		}
		else {
			System.out.println("Result  False!!!!!!!!!!!!");
		}
		driver.quit();
		
	
	}
	
}
