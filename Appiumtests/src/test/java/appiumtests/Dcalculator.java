package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dcalculator {

	static AndroidDriver<WebElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 8.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		
		dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		dc.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url ,dc);
		
        System.out.println("Application Started......");
		
		 driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();
		 driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add")).click();
		 driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03")).click();
		 driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal")).click();
		
		 System.out.println("Calculator Work done......");
		 
		WebElement result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc"));
		 if(result.getText().equals("5")) 
		    {
			 System.out.println("Result Pass!!!!!!!!!!!!!!!!!!!!!");
		    }
		 else {
			 System.out.println("Result Fail!!!!!!!!!!!!!!!!!!!!!");
		      }
		 
		 driver.quit();
	}

}
