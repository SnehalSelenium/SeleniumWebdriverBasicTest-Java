package SeleniiumWebdriver.SeleniiumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsInSelenium {
	//There are two types of wait 1. static and dynamic wait
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Snehal S\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);//whenever we open any web browser we should give this pageload command because sometime its take long time so max we wait till 20 seceonds.
	}

}
