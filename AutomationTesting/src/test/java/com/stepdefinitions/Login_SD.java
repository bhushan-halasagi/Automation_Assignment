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

public class Login_SD extends Utility {
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
	public Login_SD(WebDriver driverInstance) {
		super();
	}

	public Login_SD() {
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

	@Given("User is on Login page")
	public void user_is_on_login_page() throws IOException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashutpat\\Downloads\\chromedriver.exe");
//
//		fs=new FileInputStream(g);
//		w=new XSSFWorkbook(fs);
//		sheet=w.getSheetAt(0);
//				driver=new ChromeDriver();
//		try {
//			link=sheet.getRow(2).getCell(1).getStringCellValue();
//			driver.navigate().to(link);
//			driver.manage().window().maximize();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		AutomationBase.launchApp(getAppUrl());
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("User Clicks on login button")
	public void user_clicks_on_login_button() {
		clickElement(LoginPage.login);
	}

	@Then("Invalid request message should appear for register")
	public void invalid_request_message_should_appear_for_register() {
		System.out.println("Invalid Register");
	}

	@Then("Invalid request message should appear")
	public void invalid_request_message_should_appear() {
		System.out.println("Invalid login");
	}

	@Given("User enters only username with <{string}>")
	public void user_enters_only_username_with(String string) {
		sendKeys(LoginPage.username, string);
	}

	@Given("User enters only password with <{string}>")
	public void user_enters_only_password_with(String string) {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(LoginPage.password, string);
	}

	@Given("User enters username with <{string}>")
	public void user_enters_username_with(String string) {
		sendKeys(LoginPage.username, string);
	}

	@Given("User enters password with <{string}>")
	public void user_enters_password_with(String string) {
		sendKeys(LoginPage.password, string);
	}

	@Then("User is logged in")
	public void user_is_logged_in() {
		{
			System.out.println("User is on login page");
		}

	}

	@Then("User clicks on logout")
	public void user_clicks_on_logout() {
		// Write code here that turns the phrase above into concrete actions
		clickElement(LoginPage.logout);
		System.out.println("User successfully logged out");
	}

	@Given("User is on the home page")
	public void user_is_on_the_home_page() {
		// clickElement(LoginPage.buy);
		System.out.println("homepage");
	}

	@When("User clicks on drop down")
	public void user_clicks_on_drop_down() {
		clickElement(LoginPage.buy);
	}

	@When("selects a filter")
	public void selects_a_filter() {
		clickElement(LoginPage.product);
	}

	@Then("User should get the filtered results")
	public void user_should_get_the_filtered_results() {
		clickElement(LoginPage.tools);
	}

	@Given("User should be on the home page")
	public void user_should_be_on_the_home_page() {
		System.out.println("HomePage");
	}

	@Given("Product is selected")
	public void product_is_selected() {
		clickElement(LoginPage.item);
		clickElement(LoginPage.size);
	}

	@When("User clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		clickElement(LoginPage.addToCart);
	}

	@Then("Product should be added to the cart")
	public void product_should_be_added_to_the_cart() {
		System.out.println("Product added");
	}

	@When("User clicks on cart")
	public void user_clicks_on_cart() {
		clickElement(LoginPage.cart);
	}

	@Then("User should be redirected to checkout page")
	public void user_should_be_redirected_to_checkout_page() {
		System.out.println("redirected");
	}

	@When("User clicks on the selectall button")
	public void user_clicks_on_the_selectall_button() {
		clickElement(LoginPage.select);
	}

	@Then("All items get selected")
	public void all_items_get_selected() {
		System.out.println("selected");
	}

	@When("User clicks on the delete button")
	public void user_clicks_on_the_delete_button() {
		clickElement(LoginPage.delete);
	}

	@Then("Cart should get empty")
	public void cart_should_get_empty() {
		System.out.println("Card is Empty");
	}

}