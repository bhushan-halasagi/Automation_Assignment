package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.page.object.LoginPage;

public class Utility {
	public static Logger logger = LogManager.getLogger(Utility.class);
	public static WebDriver driver;

	public Utility() {

	}

	public Utility(WebDriver driverInstance) {
		driver = driverInstance;
	}

	public void clickElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			throw e;
		}
	}

	public void clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void sendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			throw e;
		}
	}

//    public static void AssertTitle(String element) {
//        try {
//            Assert.assertEquals(element,LoginPage.title.getText());
//        } catch (Exception e) {
//            throw e;
//        }
//
//    }

	public String getAppUrl() throws IOException {
		String link;
		FileInputStream fs = null;
		XSSFWorkbook w = null;
		XSSFSheet sheet = null;
		File g = new File("./src/test/resources/Data/AppData.xlsx");
		fs = new FileInputStream(g);
		w = new XSSFWorkbook(fs);
		sheet = w.getSheetAt(0);
		link = sheet.getRow(2).getCell(1).getStringCellValue();
		return link;
	}
}