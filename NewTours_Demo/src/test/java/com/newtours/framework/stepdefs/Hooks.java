package com.newtours.framework.stepdefs;

/**
 * This class contains all Hooks for before and after feature execution
 * @author Rachna.Chawla
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.cucumber.listener.Reporter;
import com.newtours.framework.common.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase {
	static Logger log = Logger.getLogger(Hooks.class);
	String browser = prop.getProperty("browser");

	public Hooks() throws IOException {
		FileInputStream ip = null;
		try{
		ip = new FileInputStream(
				System.getProperty("user.dir")
						+ "\\src\\test\\resources\\propertyFiles\\"
						+ "config.properties");
		Properties prop = new Properties();
		prop.load(ip);}
		finally {
			if (ip != null) {
				ip.close();
			}
		}
	}

	@Before
	/**
	 * Initialize the selected browser
	 * Browser selection in config.properties
	 */
	public void openBrowser() throws Exception {

		if (browser == null) {
			browser = "chrome";
		}
		switch (browser) {
		case "chrome":
			// initialize Chrome Browser
			initializeChrome();
			break;
		case "firefox":
			// initialize Firefox Browser
			initializeFirefox();
			break;
		case "ie":
			// initialize Internet Explorer Browser
			initializeIE();
			break;
		default:
			// initialize Internet Explorer Browser as default
			initializeIE();
			break;
		}
		log.info("Opening Browser...." + browser);
		//delete all cookies
		driver.manage().deleteAllCookies();
	}

	@After
	/**
	 * Method to quit driver
	 */
	public void tearDown(Scenario scenario) {
		try {
			if (browser == "ie") {
				if (scenario.isFailed()) {
					try {
						scenario.write("Current Page URL is "
								+ driver.getCurrentUrl());
						byte[] screenshot = ((TakesScreenshot) driver)
								.getScreenshotAs(OutputType.BYTES);
						scenario.embed(screenshot, "image/png");
					} catch (WebDriverException somePlatformsDontSupportScreenshots) {
						System.err.println(somePlatformsDontSupportScreenshots
								.getMessage());
						log.error(somePlatformsDontSupportScreenshots
								.getMessage());
					}
				}
			}
		} catch (final Exception e) {
			log.error("Exception in tearDown: ", e);
		} finally {
			driver.quit();
		}
	}

	@AfterClass
	/**
	 * method to configure extent reports
	 */
	public void writeExtentReport() {
		Reporter.loadXMLConfig(new File(
				"src/test/resources/config/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");

	}

}
