package Micromax;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Chrome2 {

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
		cap.setCapability("deviceName", "Micromax A107");
		cap.setCapability("udid", "0123456789ABCDEF");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.0");
		cap.setCapability("browserName", "Chrome");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		driver.get("https://www.google.com/");
	//	driver.get("http://facebook.com");
		 driver.findElement(By.name("q")).click();
		 driver.findElement(By.name("q")).sendKeys("selenium");
	     driver.findElement(By.xpath("//button[@class='Tg7LZd']")).click();


}}
