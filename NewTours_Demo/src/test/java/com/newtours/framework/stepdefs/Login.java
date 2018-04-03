package com.newtours.framework.stepdefs;
/**
 * Class to test Login feature
 * @author Rachna.Chawla
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;

import com.newtours.framework.common.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends TestBase {

	static Logger log = Logger.getLogger(Login.class);
/**
 * Constructor for Login.java
 * @throws IOException
 */
	public Login() throws IOException {
		FileInputStream ip = null;
		try {
			final File file = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\propertyFiles\\"
					+ "login.properties");
			ip = new FileInputStream(file);
			prop.load(ip);

		} finally {
			if (ip != null) {
				ip.close();
			}
		}
	}

	@Given("^I am on the Homepage page on URL \"([^\"]*)\"$")
	public void i_am_on_the_Homepage_page_on_URL(String url) {
		try {
			//open mercury New Tours website
			driver.get(prop.getProperty("url"));
			// Wait implicitly for 60 seconds for page to load
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			//maximize page
			driver.manage().window().maximize();
			log.info("## TEST LOGIN FUNCTIONALITY ##");
		} catch (final Exception e) {
			log.error("Exception in i_am_on_the_Homepage_page_on_URL: ", e);
		}

	}

	@Then("^I should see \"([^\"]*)\"  as page title$")
	public void i_should_see_as_page_title(String pageTitle) {
		try {
			//verify home page for New Tours is loaded
			Assert.assertEquals(pageTitle, driver.getTitle());
		} catch (final Exception e) {
			log.error("Exception in i_should_see_as_page_title: ", e);
		}
	}

	@When("^I enter Username as \"([^\"]*)\"$")
	public void i_enter_Username_as(String user) {
		try {
			//enter username
			sendkeys(prop.getProperty("userName"), user);
		} catch (final Exception e) {
			log.error("Exception in i_enter_Username_as: ", e);
		}
	}

	@And("^I enter Password as \"([^\"]*)\"$")
	public void i_enter_Password_as(String password) {
		try {
			//enter password
			sendkeys(prop.getProperty("password"), password);	
		} catch (final Exception e) {
			log.error("Exception in i_enter_Password_as: ", e);
		}
	}

	@And("^I click on the Login button$")
	public void i_click_on_the_Login_button() {
		try {
			//click signin button
			click(prop.getProperty("signin"));
		} catch (final Exception e) {
			log.error("Exception in i_click_on_the_Login_button: ", e);
		}
	}

	@Then("^I should see the title as \"([^\"]*)\"$")
	public void i_should_see_the_title_as(String title) {
		try {
			Thread.sleep(9000);//wait to sync webpage
			//verify login is successful
			Assert.assertEquals(title, driver.getTitle());
		} catch (final Exception e) {
			log.error("Exception in i_should_see_the_title_as: ", e);
		}
	}

}
