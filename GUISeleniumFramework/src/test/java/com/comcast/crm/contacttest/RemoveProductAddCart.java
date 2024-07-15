package com.comcast.crm.contacttest;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.AddCartPage;
import com.comcast.crm.objectrepositoryutility.FurniturePage;

public class RemoveProductAddCart extends BaseClass {
	@Test
	public void RemoveProductCartTest() throws InterruptedException {
		/* creating obj in furniture class */
		FurniturePage furniture = new FurniturePage(driver);
		/* creating obj in addcartpage class */
		AddCartPage cart = new AddCartPage(driver);
		/* clicking furniture link */
		furniture.getFurniturelink().click();
		UtilityClassObject.getTest().log(Status.INFO, "clicked furniture link");
		Reporter.log("clicked furniture link", true);
		/* creating obj for action class to scrolldown the furniture page */
		Actions obj = new Actions(driver);
		obj.scrollByAmount(0, 500).perform();
		/* clicking nilkamal product */
		furniture.getnilwoodbedlink().click();
		obj.scrollByAmount(0, 500).perform();
		/* adding the product to cart */
		furniture.getAddtocartbutton().click();
		UtilityClassObject.getTest().log(Status.INFO, "product added to cart");
		Reporter.log("product added to cart", true);
		/* handling alertpopup */
		wlib.switchtoAlertAndAccept(driver);
		/* Clicking cart module to remove the product from cart */
		cart.getMycartlink().click();
		furniture.getremovebutton();
		UtilityClassObject.getTest().log(Status.INFO, "product removed to cart");
		Reporter.log("product removed to cart", true);
		
		
	}

}
