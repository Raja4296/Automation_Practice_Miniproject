package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
public WebDriver driver;
	
	public Login_Page (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
		
	@FindBy(id="email_create")
	private WebElement click;
	
	public WebElement getEmail() {
		return click;
	}
	
	@FindBy (xpath="/html/body/div/div[2]/div/div[3]/div/div/div/form/div/div[3]/button/span")
	private WebElement createAcc;
	
	public WebElement getCreateAcc() {
		return createAcc;
	}
}
