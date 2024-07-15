package com.comcast.crm.contacttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.AddCartPage;
import com.comcast.crm.objectrepositoryutility.BooksPage;
import com.comcast.crm.objectrepositoryutility.ChoosePaymentPage;
import com.comcast.crm.objectrepositoryutility.ToysPage;

public class CheckOut extends BaseClass{
	@Test
	public void checkout1() {
		ToysPage toys=new ToysPage(driver);
		AddCartPage cartpage=new AddCartPage(driver);
		ChoosePaymentPage paymentpage=new ChoosePaymentPage(driver);
		/*clicking toys link*/
		toys.getToyslink().click();
		UtilityClassObject.getTest().log(Status.INFO, "clicked toys link"); 
		Reporter.log("clicked toys link", true);
		/*scrolling down the toys page*/
		Actions obj=new Actions(driver);
		obj.scrollByAmount(0, 500).perform();
		/*click product in toys page*/
		toys.getMetalcarlink().click();
		obj.scrollByAmount(0, 500).perform();
		/*clicking toys product to cart*/
	toys.getMetalcaraddtocartbutton().click();
	UtilityClassObject.getTest().log(Status.INFO, "toy added to cart"); 
	Reporter.log("toy added to cart", true);
	/*handle alert popup*/
		wlib.switchtoAlertAndAccept(driver);
		obj.scrollByAmount(0, 500).perform();
		/*try to checkout the product from cart */
		cartpage.getProceedtocheckoutbutton().click();
		obj.scrollByAmount(0, 700).perform();
		/*selecting payment mode*/
		paymentpage.getCODradiobutton().click();
		
		paymentpage.getSubmitbutton().click();
		obj.scrollByAmount(0, 700).perform();
		/*tracking the ordered product*/
		WebElement track=driver.findElement(By.xpath("//a[contains(text(),'The Wimpy Kid Do -It- Yourself Book')]/../../..//a[contains(text(),'Track')]"));
		track.click();
		
		UtilityClassObject.getTest().log(Status.INFO, "ordered item is trackable"); 
		Reporter.log("ordered item is trackable", true);
	}

}
