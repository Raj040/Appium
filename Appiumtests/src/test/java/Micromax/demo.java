package Micromax;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class demo {

	public static void main(String[] args) throws MalformedURLException {
		
		
		
		DesiredCapabilities capabilities=DesiredCapabilities.android();
		
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Micromax A107");
	    capabilities.setCapability(MobileCapabilityType.VERSION,"5.0");
		
	    URL url= new URL("http://127.0.0.1:4723/wd/hub");

		WebDriver driver = new AndroidDriver(url, capabilities);
		
	    driver.get("http://www.facebook.com");
	    System.out.println("Title "+driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("hdgdijw@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("jabjabb");
		driver.findElement(By.id("u_0_5")).click();
		driver.quit();
	

	}

}
