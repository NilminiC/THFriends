package com.agentapp.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import config.ConfigDemo;

/**
 * @author Nilmini Amarasinghe
 *
 * FutureReady App
 */

public class BaseSetUp {
	public static WebDriver driver;
	public static String browserName = null;
	public static String website = null;

	public WebDriver initializeDriver() throws IOException
	{
		String projectPath = System.getProperty("user.dir");
		ConfigDemo.getConfigProperties();

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/Drivers/geckoDriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}


	public static void tearDownDriver() {
		driver.close();
		System.out.println("Success");
	}

}
