package com.newtours.framework.stepdefs;
/**
 * Class to test flight booking feature
 * @author Rachna.Chawla
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;

import com.newtours.framework.common.TestBase;
import com.newtours.framework.common.UISystemConstant;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlight extends TestBase {

	static Logger log = Logger.getLogger(BookFlight.class);

	/**
	 * Constructor for BookFlight.java
	 * 
	 * @throws IOException
	 */
	public BookFlight() throws IOException {
		FileInputStream ip = null;
		try {
			final File file = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\propertyFiles\\"
					+ "bookFlight.properties");
			ip = new FileInputStream(file);
			prop.load(ip);

		} finally {
			if (ip != null) {
				ip.close();
			}
		}
	}

	@Given("^I navigate to the home page$")
	public void i_navigate_to_the_home_page() {
		try {
			log.info("## TEST BOOK FLIGHTS ##");
			//open mercury New Tours website
			driver.get(prop.getProperty("url"));
			// Wait implicitly for 30 seconds for page to load
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//maximize page
			driver.manage().window().maximize();
		} catch (Exception e) {
			log.error("Exception in i_navigate_to_the_home_page: ", e);
		}
	}

	@When("^I submit username and password$")
	public void i_submit_username_and_password(DataTable table)
			throws Exception {
		try {
			List<Map<String, String>> data = table.asMaps(String.class,
					String.class);
			//Enter user name
			sendkeys(prop.getProperty("userName"), data.get(0).get("userName"));
			//Enter password
			sendkeys(prop.getProperty("password"), data.get(0).get("password"));
			//click Sign-In button
			click(prop.getProperty("signin"));
			log.info("Entered username, password and clicked on login button");
		} catch (Exception e) {
			log.error("Exception in i_submit_username_and_password: ", e);
		}
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() {
		try {
			Thread.sleep(9000); // wait to sync page
			//validate successful login 
			Assert.assertEquals(UISystemConstant.LOGIN_PAGE_TITLE.getValue(),
					driver.getTitle());
		} catch (Exception e) {
			log.error("Exception in i_should_be_logged_in: ", e);
		}
	}

	@When("^I select number of passengers \"([^\"]*)\"$")
	public void i_select_number_of_passengers(String passengers) {
		try {
			//select number of passengers
			selectDropDownList(prop.getProperty("passengerSelect"), passengers);
		} catch (Exception e) {
			log.error("Exception in i_select_number_of_passengers: ", e);
		}
	}

	@When("^I select Departing From as \"([^\"]*)\"$")
	public void i_select_Departing_From_as(String departPort) {
		try {
			//select Departure location
			selectDropDownList(prop.getProperty("departurePort"), departPort);
		} catch (Exception e) {
			log.error("Exception in i_select_Departing_From_as: ", e);
		}
	}

	@When("^I select Departure Month \"([^\"]*)\" and Day as \"([^\"]*)\"$")
	public void i_select_Departure_Month_and_Day_as(String departMonth,
			String departDay) {
		try {
			//select departure month
			selectDropDownList(prop.getProperty("departureMonth"), departMonth);
			//select departure day
			selectDropDownList(prop.getProperty("departureDay"), departDay);
		} catch (Exception e) {
			log.error("Exception in i_select_Departure_Month_and_Day_as: ", e);
		}
	}

	@When("^I select Arriving In as \"([^\"]*)\"$")
	public void i_select_Arriving_In_as(String arrPort) throws Exception {
		try {
			//select Arrival location
			selectDropDownList(prop.getProperty("arrivalPort"), arrPort);
		} catch (Exception e) {
			log.error("Exception in i_select_Arriving_In_as: ", e);
		}
	}

	@When("^I select Arrival Month \"([^\"]*)\" and Day as \"([^\"]*)\"$")
	public void i_select_Arrival_Month_and_Day_as(String arrMonth, String arrDay)
			throws Exception {
		try {
			//select arrival month
			selectDropDownList(prop.getProperty("arrivalMonth"), arrMonth);
			//select arrival day
			selectDropDownList(prop.getProperty("arrivalDay"), arrDay);
		} catch (Exception e) {
			log.error("Exception in i_select_Arrival_Month_and_Day_as: ", e);
		}
	}

	@Then("^I click on the find Flights Continue button$")
	public void i_click_on_the_find_Flights_Continue_button() {
		try {
			//select flights and click continue button
			click(prop.getProperty("findFlightsContinue"));
		} catch (Exception e) {
			log.error(
					"Exception in i_click_on_the_find_Flights_Continue_button: ",
					e);
		}
	}

	@Then("^I click on the reserve Flights Continue button$")
	public void i_click_on_the_reserve_Flights_Continue_button() {
		try {
			Thread.sleep(2000);// wait to sync page
			//reserve flights by clicking continue button
			click(prop.getProperty("reserveFlightContinue"));
		} catch (Exception e) {
			log.error(
					"Exception in i_click_on_the_reserve_Flights_Continue_button: ",
					e);
		}
	}

	@And("^I enter FirstName as \"([^\"]*)\" and LastName as \"([^\"]*)\"$")
	public void i_enter_FirstName_as_and_LastName_as(String firstName,
			String lastName) throws Exception {
		try {
			//enter passenger first name
			sendkeys(prop.getProperty("firstName"), firstName);
			//enter passenger last name
			sendkeys(prop.getProperty("lastName"), lastName);
		} catch (Exception e) {
			log.error("Exception in i_enter_FirstName_as_and_LastName_as: ", e);
		}
	}

	@Then("^I enter Card Number as \"([^\"]*)\"$")
	public void i_enter_Card_Number_as(String cardNum) throws Exception {
		try {
			//enter passenger card number
			sendkeys(prop.getProperty("cardNumber"), cardNum);
		} catch (Exception e) {
			log.error("Exception in i_enter_Card_Number_as: ", e);
		}
	}

	@Then("^I click on the Secure Purchase button$")
	public void i_click_on_the_Secure_Purchase_button() {
		try {
			Thread.sleep(2000); //wait to sync page
			//click Secure Purchase button to confirm booking
			click(prop.getProperty("purchase"));
		} catch (Exception e) {
			log.error("Exception in i_click_on_the_Secure_Purchase_button: ", e);
		}
	}

	@Then("^I should see Flight confirmation page$")
	public void i_should_see_Flight_confirmation_page() {
		try {
			//verify confirmation page is loaded
			Assert.assertEquals(
					UISystemConstant.CONFIRMATION.getValue(),
					extractText(prop.getProperty("confirmation")));
			
			Assert.assertEquals(
					UISystemConstant.BOOKING_CONFIRMATION_PAGE_TITLE.getValue(),
					driver.getTitle());
			
		} catch (Exception e) {
			log.error("Exception in i_should_see_Flight_confirmation_page: ", e);
		}
	}
}
