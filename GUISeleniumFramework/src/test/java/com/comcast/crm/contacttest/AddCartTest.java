package com.comcast.crm.contacttest;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.AddCartPage;
import com.comcast.crm.objectrepositoryutility.BooksPage;
import com.comcast.crm.objectrepositoryutility.ElectronicsPage;
import com.comcast.crm.objectrepositoryutility.FurniturePage;
import com.comcast.crm.objectrepositoryutility.Home;

import lombok.experimental.UtilityClass;

@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class AddCartTest extends BaseClass {
	   
	/**
	 * testscript for adding product to cart
	 */
	@Test
	public void addProductCartTest() {
		/* creating obj for electronics page */
		ElectronicsPage ele = new ElectronicsPage(driver);
		
		/*creating obj for addcartpage page*/ 
		AddCartPage cart = new AddCartPage(driver);
		
		/*adding advance report to get the status of execution*/ 
		UtilityClassObject.getTest().log(Status.INFO, "navigate to electronics page");
		ele.getElectronicslink().click();
		Reporter.log("try to add item to cart");
		
		/*using actions class to scroll down the page*/ 
		Actions obj = new Actions(driver);
		obj.scrollByAmount(0, 500).perform();
	
		/*adding advance report to get the status of execution*/ 
		UtilityClassObject.getTest().log(Status.INFO, "click item add to cart");
		
		/*clicking on electronic product link*/ 
		ele.getLenovovibelink().click();
		
		obj.scrollByAmount(0, 500).perform();
		
		/*add lenovovibe product to cart*/ 
		ele.getLenovovibeaddtocart().click();
		
		/*clicking on alert popup*/ 
		wlib.switchtoAlertAndAccept(driver);
		UtilityClassObject.getTest().log(Status.INFO, "product is added to cart"); 
		Reporter.log("product added to cart successfully", true);

	}
}
