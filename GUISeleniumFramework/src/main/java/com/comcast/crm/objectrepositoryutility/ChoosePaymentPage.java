package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChoosePaymentPage {
	WebDriver driver;
	public ChoosePaymentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@value='COD']")
	private WebElement CODradiobutton;
	@FindBy(xpath = "//input[@value='Internet Banking']")
	private WebElement internetbankingradiobutton;
	@FindBy(xpath = "//input[@value='Debit / Credit card']")
	private WebElement creditanddebitcardradiobutton;
	@FindBy(xpath = "//input[@value='submit']")
	private WebElement submitbutton;
	public WebElement getCODradiobutton() {
		return CODradiobutton;
	}
	public WebElement getInternetbankingradiobutton() {
		return internetbankingradiobutton;
	}
	public WebElement getCreditanddebitcardradiobutton() {
		return creditanddebitcardradiobutton;
	}
	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	
}
