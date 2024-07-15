package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage {
	WebDriver driver;
	public AddCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//a[@href='my-cart.php'])[1]")
	private WebElement Mycartlink;
	@FindBy(xpath = "//button[text()='PROCCED TO CHEKOUT']")
	private WebElement proceedtocheckoutbutton;
	@FindBy(name = "remove_code[]")
	private WebElement removecheckbox;
	@FindBy(xpath = "//a[text()='Continue Shopping']")
	private WebElement continueshoppingbutton;
	@FindBy(xpath = "//input[@name='quantity[4]']")
	private WebElement quantity;
	public WebElement getMycartlink() {
		return Mycartlink;
	}
	public WebElement getProceedtocheckoutbutton() {
		return proceedtocheckoutbutton;
	}
	public WebElement getRemovecheckbox() {
		return removecheckbox;
	}
	public WebElement getContinueshoppingbutton() {
		return continueshoppingbutton;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	

}
