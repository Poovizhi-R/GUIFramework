package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class CreateNewAccountPage  extends WebDriverUtility {
	WebDriver driver;
	public CreateNewAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginlink;
	
	@FindBy(xpath = "//input[@name='fullname']")
	private WebElement fullnametextfield;
	
	@FindBy(xpath = "//input[@name='emailid']")
	private WebElement emailidtextfield;
	
	@FindBy(xpath = "//input[@name='contactno']")
	private WebElement contactnotextfield;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//input[@name='confirmpassword']")
	private WebElement confirmpasswordtextfield;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement signupbutton;
	public WebElement getFullnametextfield() {
		return fullnametextfield;
	}

	public WebElement getEmailidtextfield() {
		return emailidtextfield;
	}

	public WebElement getContactnotextfield() {
		return contactnotextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getConfirmpasswordtextfield() {
		return confirmpasswordtextfield;
	}

	public WebElement getSignupbutton() {
		return signupbutton;
	}
	
	public WebElement getloginlink() {
		return loginlink;
	}
	 public void loginToapp() throws Throwable {
		 waitForPageToLoad(driver);
		 FileUtility fu = new FileUtility();
		 driver.get(fu.getDataFromPropertiesFile("url"));	
		// driver.manage().window().maximize();
		 loginlink.click();
	//	 useremailEdt.sendKeys(fu.getDataFromPropertiesFile("username"));
		// passwordEdt.sendKeys(fu.getDataFromPropertiesFile("password"));
		// loginBtn.click();
		 //ExcelUtility ex=new ExcelUtility();
		 //fullnametextfield.sendKeys(ex.getDataFromExcel("sign", 1, 2));
		
	 }
	

}
