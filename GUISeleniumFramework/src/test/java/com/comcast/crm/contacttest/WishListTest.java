package com.comcast.crm.contacttest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.ElectronicsPage;
import com.comcast.crm.objectrepositoryutility.LoginPage;

import io.reactivex.rxjava3.functions.Action;

public class WishListTest extends BaseClass {
	@Test
public void WishListTest() throws InterruptedException {

	/* creating obj for electronics page */
	ElectronicsPage ep = new ElectronicsPage(driver);
	/* Clicking electronis link */
	ep.getElectronicslink().click();
	/* creating obj for actions class to scrolldown the page */
	Actions obj = new Actions(driver);
	obj.scrollByAmount(0, 500).perform();
	/* Clicking electronis product link */
	ep.getLenovovibelink().click();
	obj.scrollByAmount(0, 500).perform();
	/* adding product to wishlist link */
	ep.getLenovovibewishlist().click();
	UtilityClassObject.getTest().log(Status.INFO, "product added to wishlist");
	Reporter.log("product added to wishlist", true);

}
}
