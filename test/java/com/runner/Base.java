package com.runner;

import java.io.File;
import java.io.IOException;
import java.util.Set;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	
	public static void browserlaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void switchWindow() {

		String parentWindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		for (String windows : allWindows) {

			if (!windows.equals(parentWindow)) {

				driver.switchTo().window(windows);
			}

		}
	}

	public static void Screenshot() throws IOException {

		TakesScreenshot sc = (TakesScreenshot) driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\debsa\\Documents\\Screenshot2\\amazon.png");
		FileUtils.copyFile(source, dest);
	}

}
