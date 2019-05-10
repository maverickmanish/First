package com.automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAutomationX {
	private static WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		System.out.println("launching chrome browser 1");
		driver = new ChromeDriver();
		System.out.println("launching chrome browser 2");
		driver.navigate().to("http://google.com");
		System.out.println("launching chrome browser 3");
	}

	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		driver = new ChromeDriver();
		baseUrl = "https://jdwilliams.service-now.com/navpage.do";
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
	}

	public void testJavaAutomation() throws Exception {
		driver.get("https://jdwilliams.service-now.com/navpage.do");
		driver.findElement(By.xpath("//div[@id='edge_pinned_bookmarks']/div[5]/button/span[2]")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame |
		// index=2 | ]]
		driver.findElement(By.xpath("//div[@id='d1ad2f010a0a0b3e005c8b7fbd7c4e28_task']/div[3]")).click();
		driver.findElement(By.id("download_button")).click();
	}

}
