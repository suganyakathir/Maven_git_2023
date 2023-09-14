package org.test;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipLogin extends BaseClass {
	public FlipLogin() {
		  PageFactory.initElements(driver, this);
	  }
	@FindBy(name="q")
	private WebElement clkSearch;
	public WebElement getClkSearch() {
		return clkSearch;
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement clkClose;
	
	public WebElement getClkClose() {
		return clkClose;
	}
	@FindBy(xpath="//span[contains(text(),'Showing')]")
	private WebElement txtPrint;
	public WebElement getTxtPrint() {
		return txtPrint;
	}
	
//	@FindBys({@FindBy(xpath="//div[@class='_4rR01T"),@FindBy(xpath="//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")})
	private WebElement iphoneList;
	
	

}
