package com.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driverInstance) {
        PageFactory.initElements(driverInstance, this);
        driver = driverInstance;
    }
	
	
	
//	By username=By.xpath("//input[@id='logonInfo.logUserName']");
//	By password=By.xpath("//input[@id='logonInfo.logPassword']");
//	By loginbtn=By.xpath("//button[@id='sign-in-submit']");

	@FindBy(xpath = "//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a")
	public static WebElement logout;
	
	@FindBy(xpath = "//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a")
	public static WebElement orders;
	
	@FindBy(xpath = "//*[@id=\"page-36\"]/div/div[1]/div/div/a")
	public static WebElement shop;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")
	public static WebElement login;
	
	@FindBy(xpath = "//*[@id=\"username\"]")
	public static WebElement username;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@id=\"page-36\"]/div/div[1]/ul/li/text()")
	public static WebElement invalid;

	@FindBy(xpath = "//*[@id=\"reg_email\"]")
	public static WebElement regEmail;
	
	@FindBy(xpath = "//*[@id=\"reg_password\"]")
	public static WebElement regPassword;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")
	public static WebElement register;
	
	@FindBy(xpath = "//a[@aria-label='Men']")
	public static WebElement buy;
	
	@FindBy(xpath = "//a[@aria-label='main-menu, Men, New & Featured, New Releases']")
	public static WebElement product;
	
	@FindBy(xpath = "//a[contains(@aria-label,'Category for Shoes')]")
	public static WebElement tools;
	
	@FindBy(xpath = "//body//div//div[@data-test='browseShell']//div//div//div//div//div//div[2]//div[1]//figure[1]//a[1]")
	public static WebElement item;
	
	@FindBy(xpath = "//label[@for='skuAndSize__28691923']")
	public static WebElement size;
	
	@FindBy(xpath = "//button[@aria-label='Add to Bag']")
	public static WebElement addToCart;
	
	@FindBy(xpath = "//span[@class='pre-jewel pre-cart-jewel text-color-primary-dark']")
	public static WebElement cart;
	
	@FindBy(xpath = "//button[@name='move-to-favorites-button']//*[name()='svg']")
	public static WebElement select;
	
	@FindBy(xpath = "//button[@name='remove-item-button']//*[name()='svg']")
	public static WebElement delete;
	
	@FindBy(xpath = "//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/span[2]")
	public static WebElement slider;
	
	@FindBy(xpath = "//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[2]/button")
	public static WebElement FilterBtn;
	
	@FindBy(xpath = "//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[5]/a")
	public static WebElement Account;
	
	@FindBy(xpath = "//*[@id=\"account_first_name\"]")
	public static WebElement First;
	
	@FindBy(xpath = "//*[@id=\"account_last_name\"]")
	public static WebElement Last;
	
	@FindBy(xpath = "//*[@id=\"page-36\"]/div/div[1]/div/form/p[4]/input[3]")
	public static WebElement Save;
	
	@FindBy(xpath = "//*[@id=\"password_current\"]")
	public static WebElement oldPass;
	
	@FindBy(xpath = "//*[@id=\"password_1\"]")
	public static WebElement newPass;

	@FindBy(xpath = "//*[@id=\"password_2\"]")
	public static WebElement confirmPass;

	
	
}