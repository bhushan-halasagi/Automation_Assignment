package com.stepdefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.page.object.LoginPage;
import com.utilities.AutomationBase;
import com.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class App_SD extends Utility {

	String username = "bhushanbsh@gmail.com";
	String pass = "Bhushan@123";
	public static WebDriver driver;
//	Properties prop=new Properties();
//	String link, password;
//	File g=new File("./src/test/resources/Data/AppData.xlsx");
//	
//	FileInputStream fs=null;
//	XSSFWorkbook w=null;
//	XSSFSheet sheet = null;

	public App_SD(WebDriver driverInstance) {
		super();
	}

	public App_SD() {
		// TODO Auto-generated constructor stub
	}

	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		AutomationBase.launchApp(getAppUrl());
		Thread.sleep(2000);
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		clickElement(LoginPage.username);
		sendKeys(LoginPage.username, username);
		sendKeys(LoginPage.password, pass);
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		clickElement(LoginPage.login);
	}

	@Given("User is on Homepage")
	public void user_is_on_homepage() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Home Page");
	}
	
	@Then("User enters Old Password with <{string}>")
	public void user_enters_old_password_with(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    sendKeys(LoginPage.oldPass,string);
	}

	@Then("User enters New Password with <{string}>")
	public void user_enters_new_password_with(String string) {
	    // Write code here that turns the phrase above into concrete actions
		sendKeys(LoginPage.newPass,string);
	}

	@Then("User enters New Password again with <{string}>")
	public void user_enters_new_password_again_with(String string) {
	    // Write code here that turns the phrase above into concrete actions
		sendKeys(LoginPage.confirmPass,string);
	}

	
	@When("User clicks on orders")
	public void user_clicks_on_orders() {
		// Write code here that turns the phrase above into concrete actions
		clickElement(LoginPage.orders);
	}

	@When("User clicks on go to shop")
	public void user_clicks_on_go_to_shop() {
		// Write code here that turns the phrase above into concrete actions
		clickElement(LoginPage.shop);
	}

	@Then("User navigates to shopping page")
	public void user_navigates_to_shopping_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User navigates to shopping Page");
	}

	@Then("User adds a price filter")
	public void user_adds_a_price_filter() {
		// Write code here that turns the phrase above into concrete actions

		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(LoginPage.slider, 30, 0).build();
		((Actions) action).perform();
	}

	@Then("User clicks on filter")
	public void user_clicks_on_filter() {
		// Write code here that turns the phrase above into concrete actions
		clickElement(LoginPage.FilterBtn);
	}

	@When("User clicks on Account details")
	public void user_clicks_on_account_details() {
		// Write code here that turns the phrase above into concrete actions
		clickElement(LoginPage.Account);
	}

	@Then("User enters First Name with <{string}>")
	public void user_enters_first_name_with(String string) {
		// Write code here that turns the phrase above into concrete actions
		clear(LoginPage.First);
		sendKeys(LoginPage.First, string);
	}

	@Then("User enters Last Name with <{string}>")
	public void user_enters_last_name_with(String string) {
		// Write code here that turns the phrase above into concrete actions
		clear(LoginPage.Last);
		sendKeys(LoginPage.Last, string);
	}

	@Then("User clicks on Save Changes")
	public void user_clicks_on_save_changes() {
		// Write code here that turns the phrase above into concrete actions
		clickElement(LoginPage.Save);
		System.out.println("Account details saved");
	}

}
