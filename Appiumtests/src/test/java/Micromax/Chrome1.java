package Micromax;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Chrome1 {
	
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 5.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Micromax A107");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(MobileCapabilityType.NO_RESET, "true");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url ,dc);
		
		 System.out.println("Application Started......");
		
     	 driver.get("https://www.google.com/");
		 driver.findElement(By.name("q")).click();
		 driver.findElement(By.name("q")).sendKeys("selenium");
	     driver.findElement(By.xpath("//button[@class='Tg7LZd']")).click();
	     
	     System.out.println("Work Completed!!!!!!!!!!!!");



}}
