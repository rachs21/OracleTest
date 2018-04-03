package com.newtours.framework.common;

/**
 * This class contains all the methods, variables used commonly across different classes
 * @author Rachna.Chawla
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	protected static volatile WebDriver driver = null;
	public static Properties prop = null;
	static Logger log = Logger.getLogger(TestBase.class);

	/**
	 * Constructor for Test Base class
	 * 
	 * @throws IOException
	 */
	public TestBase() throws IOException {
		FileInputStream ip = null;
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir")
							+ "\\src\\test\\resources\\propertyFiles\\"
							+ "config.properties");
			prop = new Properties();
			prop.load(fis);

		} finally {
			if (ip != null) {
				ip.close();
			}
		}
	}

	/**
	 * Method to initialize Chrome browser
	 *
	 * @return
	 */
	protected static WebDriver initializeChrome() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty(UISystemConstant.USER_DIR.getValue())
						+ File.separator + "src" + File.separator + "test"
						+ File.separator + "resources" + File.separator
						+ "drivers" + File.separator + "chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	/**
	 * Method to initialize IE browser
	 *
	 * @return
	 */
	protected static WebDriver initializeIE() {
		System.setProperty("java.net.preferIPv4Stack", "true");
		System.setProperty("webdriver.ie.driver",
				System.getProperty(UISystemConstant.USER_DIR.getValue())
						+ File.separator + "src" + File.separator + "test"
						+ File.separator + "resources" + File.separator
						+ "drivers" + File.separator + "IEDriverServer.exe");
		final DesiredCapabilities capabilities = DesiredCapabilities
				.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,
				true);
		capabilities
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
		capabilities.setCapability(
				InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, "accept");
		driver = new InternetExplorerDriver(capabilities);

		return driver;
	}

	/**
	 * Method to initialize Firefox browser
	 *
	 * @return
	 */
	protected static WebDriver initializeFirefox() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty(UISystemConstant.USER_DIR.getValue())
						+ File.separator + "src" + File.separator + "test"
						+ File.separator + "resources" + File.separator
						+ "drivers" + File.separator + "geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);

		return driver;
	}

	/**
	 * Method to send input to an Input box
	 * 
	 * @param cs
	 * @param str
	 */
	public static void sendkeys(final String xp, final String str) {
		try {
			driver.findElement(By.xpath(xp)).sendKeys(str);
		} catch (final Exception e) {
			log.error("Exception in sendkeys: ", e);
		}
	}

	/**
	 * Method For click of a web element
	 *
	 * @param id
	 */
	public static void click(final String xp) {
		try {
			WebElement ele = driver.findElement(By.xpath(xp));
			if (ele.isDisplayed() && ele.isEnabled() && ele.isSelected()) {
				ele = driver.findElement(By.xpath(xp));
				ele.click();
				log.info("Clicked");
			} else {
				ele = driver.findElement(By.xpath(xp));
				ele.sendKeys(Keys.ENTER);
				log.info("Entered");
			}
		} catch (final Exception e) {
			log.error("Exception in click method: ", e);
		}
	}

	/**
	 * Method to get text in a web Element using xpath
	 *
	 * @param id
	 * @return
	 */
	public static String extractText(final String xp) {
		try {
			final String text = driver.findElement(By.xpath(xp)).getText();
			return text;
		} catch (final Exception e) {
			log.error("Exception in extractText method: ", e);
			return null;
		}

	}

	/**
	 * Method to select a value from dropdown list
	 * 
	 * @param cs
	 * @param str
	 */
	public static void selectDropDownList(final String xp, final String str) {
		try {
			final Select sel = new Select(driver.findElement(By.xpath(xp)));
			sel.selectByVisibleText(str);

		} catch (final Exception e) {
			log.error("Exception in selectDropDownList: ", e);
		}
	}

	/**
	 * Method for configuration of extent reports
	 * 
	 * @return
	 */
	public String getReportConfigPath() {
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

}
