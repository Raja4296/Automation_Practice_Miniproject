package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Store_Page {

public WebDriver driver;
	
	public My_Store_Page (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//a[@class='login']")
	private WebElement signin;
	
	public WebElement getSignin() {
		return signin;
	}		
}