package com.edutech.script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browserdriver\\chromedriver_win32\\chromedriver.exe");
		
		DesiredCapabilities dc =DesiredCapabilities.chrome();
	
	
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		driver.get("http://seleniumhq.org");
		Thread.sleep(5000);
		driver.quit();
	}
}
