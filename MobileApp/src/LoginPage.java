import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage extends MageBase{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("developer@adolmedia.com");
		driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("Dev@#tech175");
		driver.findElementByClassName("android.widget.Button").click();
	}

}
