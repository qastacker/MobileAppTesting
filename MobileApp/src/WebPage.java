import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WebPage extends AppChromeBase {

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://cricbuzz.com");
		driver.findElementByXPath("//a[@href='#menu']").click();
		driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)","");
		Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Top Stories')]")).getAttribute("class").contains("header"));
	}

}
