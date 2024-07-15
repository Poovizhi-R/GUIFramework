package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Deepak
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class LoginPage extends WebDriverUtility{                              // Rule-1  create a separte java class
                           
	WebDriver driver;
	 public LoginPage(WebDriver driver) {             //Rule 3 : Object Initialization
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	                           
	@FindBy(xpath = "//input[@id='exampleInputEmail1']")                        // Rule-2 Object Creation
	private WebElement useremailEdt;
	
	@FindBy(xpath = "//input[@id='exampleInputPassword1']")
	private WebElement passwordEdt;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginBtn;
	     
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginlink;
	                                             
	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getuseremailEdt() {            //Rule-4 : Object Encapsulation
		return useremailEdt;                        //Rule-5 : Object Utilization
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
/**
 *  login to application based username , password , url argumnets 
 * @param url
 * @param username
 * @param password
 * @throws Throwable 
 */
	 public void loginToapp() throws Throwable {
		 waitForPageToLoad(driver);
		 FileUtility fu = new FileUtility();
		 driver.get(fu.getDataFromPropertiesFile("url"));	
		// driver.manage().window().maximize();
		 loginlink.click();
		 useremailEdt.sendKeys(fu.getDataFromPropertiesFile("username"));
		 passwordEdt.sendKeys(fu.getDataFromPropertiesFile("password"));
		 loginBtn.click();
		
	 }
	
	
}
