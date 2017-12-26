package com.edutech.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestChrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browserdriver\\chrome2.34\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c.addArguments("start-maximized");
		c.setCapability("platform", "win10");
		WebDriver driver=new ChromeDriver(c);
		driver.get("http://www.seleniumhq.org");
		WebElement el = driver.findElement(By.xpath(".//*[@id='menu_download']/a"));
		//driver.navigate().refresh();
		el.click();
		
	}
}
