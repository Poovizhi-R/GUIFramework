package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlitPage {
	WebDriver driver;
	public WishlitPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//a[text()='Wishlist']")
	private WebElement wishlistlink;
	
	
@FindBy(xpath = "//a[text()='Add to cart']")
private WebElement addtocartbutton;
@FindBy(xpath = "//i[@class='fa fa-times']")
private WebElement removelink;
public WebElement getWishlistlink() {
	return wishlistlink;
}
public WebElement getAddtocartbutton() {
	return addtocartbutton;
}
public WebElement getRemovelink() {
	return removelink;
}



}

