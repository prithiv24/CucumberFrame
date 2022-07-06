package org.logincommonfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunction {
	public static WebDriver driver;

	public static  void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static  void pageLoadOutTime() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	public static  void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	public static void enterUrl(String url) {
		driver.get(url);
	}
	public static  void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	public static void clickButton(WebElement element) {
		element.click();
	}
}
