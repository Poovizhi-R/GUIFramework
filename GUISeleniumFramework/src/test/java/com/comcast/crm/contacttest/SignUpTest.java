package com.comcast.crm.contacttest;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.basetest.SignupBaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.CreateNewAccountPage;

import io.reactivex.rxjava3.functions.Action;


public class SignUpTest extends SignupBaseClass{
	@Test
public void signup() throws Throwable {
		
	/* creating obj for create new account page */
	CreateNewAccountPage acc = new CreateNewAccountPage(driver);
	/* Clicking login link */
	acc.getloginlink().click();
	/* creating obj for excelutility */
	ExcelUtility fu = new ExcelUtility();
	/* fetching the data from excel */
	acc.getFullnametextfield().sendKeys(fu.getDataFromExcel("sign", 1, 0));
	acc.getEmailidtextfield().sendKeys(fu.getDataFromExcel("sign", 1, 1));
	// Actions ac=new Actions(driver);
	// ac.scrollByAmount(0, 500);
	acc.getContactnotextfield().sendKeys(fu.getDataFromExcel("sign", 1, 2));
	acc.getPasswordtextfield().sendKeys(fu.getDataFromExcel("sign", 1, 3));
	acc.getConfirmpasswordtextfield().sendKeys(fu.getDataFromExcel("sign", 1, 4));
	/* creating obj for action class for scrolldown the page */
	Actions ac1 = new Actions(driver);
	ac1.scrollByAmount(0, 500);
	acc.getSignupbutton().submit();
	UtilityClassObject.getTest().log(Status.INFO, "user is created for login");
	Reporter.log("user is created for login", true);
		
		
}
}
