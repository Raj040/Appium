package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DialNumber {
	
    static AndroidDriver<WebElement> driver;
    
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 8.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		
		dc.setCapability("appPackage", "com.samsung.android.messaging");
		dc.setCapability("appActivity", "com.android.mms.ui.ConversationComposer");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url ,dc);
		
		System.out.println("Message Open!!!!!!!!!!!!!!!");
		
		driver.findElement(By.id("com.samsung.android.messaging:id/recipients_editor_to")).sendKeys("9472535801");
		driver.findElement(By.id("com.samsung.android.messaging:id/editor_body")).sendKeys("Heloo....");
		driver.findElement(By.id("com.samsung.android.messaging:id/send_button")).click();
		
		System.out.println("Message Sent!!!!!!!!!!!!!!!");
		//after sending message the upper part ui display
		
		WebElement ui = driver.findElement(By.id("com.samsung.android.messaging:id/actionbar_compose_message_list_title"));
		String yes = ui.getText();
		System.out.println(yes);
	}

}
