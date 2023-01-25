package com.stepdefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.LoginPage;
import com.utilities.AutomationBase;
import com.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_SD extends Utility {
	String username = "bhushanbsh@gmail.com";
	String pass = "Bhushan@123";

	public static WebDriver driver;
	Properties prop = new Properties();

	// SAXReader sr=new SAXReader();
	// Document d = null;
//	String link, password;
//	File g=new File("./src/test/resources/Data/AppData.xlsx");
//	
//	FileInputStream fs=null;
//	XSSFWorkbook w=null;
//	XSSFSheet sheet = null;
	public Register_SD(WebDriver driverInstance) {
		super();
	}

	public Register_SD() {
		// TODO Auto-generated constructor stub
	}
//	@Given("I navigate to the login page")
//	public void i_navigate_to_the_login_page() throws IOException, InterruptedException {
//	   AutomationBase.launchApp(getAppUrl());
//	   Thread.sleep(2000);
//	}
//
//	@When("I submit username and password")
//	public void i_submit_username_and_password() {
//        clickElement(LoginPage.username);
//		sendKeys(LoginPage.username,username );
//		sendKeys(LoginPage.password,pass );
//
//	}
//
//	@Then("I should be logged in")
//	public void i_should_be_logged_in() {
//	   clickElement(LoginPage.login);
//	}

	@Given("User is on Register page")
	public void user_is_on_register_page() throws IOException {
		AutomationBase.launchApp(getAppUrl());
	}

	@Given("User enters Username with the <{string}>")
	public void user_enters_username_with_the(String string) {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(LoginPage.regEmail, string);
	}

	@Given("User enters Password with the <{string}>")
	public void user_enters_password_with_the(String string) {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(LoginPage.regPassword, string);
	}

	@Given("User Clicks on Register button")
	public void user_clicks_on_Register_button() {
		clickElement(LoginPage.register);
	}

	@Then("User is Registered")
	public void user_is_registered() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is registered Successfully");
	}

}