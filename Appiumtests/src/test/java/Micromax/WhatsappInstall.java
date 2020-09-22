package Micromax;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WhatsappInstall {
	
	 static AndroidDriver<WebElement> driver;
	    
		public static void main(String[] args) throws MalformedURLException {
			
			DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 5.0);
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Micromax");
			
			dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\Raj Bihari\\Desktop\\apk folder\\WhatsApp.apk");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<WebElement>(url ,dc);
			
			System.out.println("Application downloaded !!!!!!!!!!!!!!!");
		


}
}