package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FurniturePage {
	WebDriver driver;
	public FurniturePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()=' Furniture']")
	private WebElement Furniturelink;
	@FindBy(xpath = "//a[text()='Nilkamal Ursa Metal Queen Bed']")
	private WebElement nilwoodbedlink;
	@FindBy(xpath = "//a[text()=' ADD TO CART']")
	private WebElement addtocartbutton;
	@FindBy(xpath = "//input[@name='remove_code[]']")
	private WebElement removebutton;
	public WebElement getremovebutton() {
		return removebutton;
	}
	public WebElement getFurniturelink() {
		return Furniturelink;
	}
	public WebElement getnilwoodbedlink() {
		return nilwoodbedlink;
	}
	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
	
}
