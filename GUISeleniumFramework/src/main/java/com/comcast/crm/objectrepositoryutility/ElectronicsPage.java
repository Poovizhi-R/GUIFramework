package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	WebDriver driver;
	public ElectronicsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()=' Electronics']")
	private WebElement electronicslink;
@FindBy(xpath = "//a[contains(text(),'Lenovo Vibe K5 Note (Gold, 32 GB)')]")
private WebElement lenovovibelink;
	@FindBy(xpath = "//a[text()=' ADD TO CART']")
	private WebElement lenovovibeaddtocart;
	@FindBy(xpath = "//i[@class='fa fa-heart']")
	private WebElement lenovovibewishlist;
	
	public WebElement getElectronicslink() {
		return electronicslink;
	}
	public WebElement getLenovovibelink() {
		return lenovovibelink;
	}
	public WebElement getLenovovibeaddtocart() {
		return lenovovibeaddtocart;
	}
	public WebElement getLenovovibewishlist() {
		return lenovovibewishlist;
	}

	
	
	
}
