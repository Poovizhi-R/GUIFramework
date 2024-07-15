package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	
WebDriver driver;
public BooksPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[text()=' Books']")
private WebElement bookslink;
@FindBy(xpath = "//a[text()='The Wimpy Kid Do -It- Yourself Book']/../../..//button[text()='Add to cart']")
private WebElement wimpybookaddtocartbutton;
@FindBy(xpath = "//a[text()='The Wimpy Kid Do -It- Yourself Book']/../../..//i[@class='icon fa fa-heart']")
private WebElement wimpybookwishlistbutton;
public WebElement getBookslink() {
	return bookslink;
}
public WebElement getWimpybookaddtocartbutton() {
	return wimpybookaddtocartbutton;
}
public WebElement getWimpybookwishlistbutton() {
	return wimpybookwishlistbutton;
}


}
