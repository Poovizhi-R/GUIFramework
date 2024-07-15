package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToysPage {
	
WebDriver driver;
public ToysPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[text()=' Toys']")
private WebElement toyslink;
@FindBy(xpath = "//a[text()='Metal car']")
private WebElement Metalcarlink;
@FindBy(xpath = "//a[text()=' ADD TO CART']")
private WebElement metalcaraddtocartbutton;
@FindBy(xpath = "//i[@class='fa fa-heart']")
private WebElement metalcarwishlist;
public WebElement getToyslink() {
	return toyslink;
}
public WebElement getMetalcarlink() {
	return Metalcarlink;
}
public WebElement getMetalcaraddtocartbutton() {
	return metalcaraddtocartbutton;
}
public WebElement getMetalcarwishlist() {
	return metalcarwishlist;
}



}
