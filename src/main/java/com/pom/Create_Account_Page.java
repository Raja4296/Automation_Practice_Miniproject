package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Account_Page {
public WebDriver driver;
	
	public Create_Account_Page (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (name="customer_firstname")
	private WebElement fname;
	
	public WebElement getCFirstname() {
		return fname;
	}	
	
	@FindBy (id="customer_lastname")
	private WebElement lname;
	
	public WebElement getCLastname() {
		return lname;
	}	
	
	@FindBy (id="email")
	private WebElement mail;
	
	public WebElement getEmail() {
		return mail;
	}	
	
	@FindBy (id="passwd")
	private WebElement pw;
	
	public WebElement getPassword() {
		return pw;
	}
	
	@FindBy (id="days")
	private WebElement days;
	
	public WebElement getDays() {
		return days;
	}
	
	@FindBy (name="months")
	private WebElement months;
	
	public WebElement getMonth() {
		return months;
	}
	
	@FindBy (id="years")
	private WebElement year;
	
	public WebElement getYear() {
		return year;
	}
	
	@FindBy (id="firstname")
	private WebElement finame;
	
	public WebElement getFirstName() {
		return finame;
	}
	
	@FindBy (id="firstname")
	private WebElement laname;
	
	public WebElement getLastName() {
		return laname;
	}

	@FindBy (id="company")
	private WebElement comp;
	
	public WebElement getCompany() {
		return comp;
	}
	
	@FindBy (id="address1")
	private WebElement address1;
	
	public WebElement getAddress1() {
		return address1;
	}
	
	@FindBy (id="address2")
	private WebElement address2;
	
	public WebElement getAddress2() {
		return address2;
	}
	
	@FindBy (name="city")
	private WebElement city;
	
	public WebElement getCity() {
		return city;
	}
	
	@FindBy (name="id_state")
	private WebElement state;
	
	public WebElement getState() {
		return state;
	}

	@FindBy (name="postcode")
	private WebElement pcode;
	
	public WebElement getPostcode() {
		return pcode;
	}
	
	@FindBy (name="id_country")
	private WebElement country;
	
	public WebElement getCountry() {
		return country;
	}
	
	@FindBy (name="other")
	private WebElement other;
	
	public WebElement getOther() {
		return other;
	}
	
	@FindBy (id="phone")
	private WebElement phone;
	
	public WebElement getPhone() {
		return phone;
	}
	
	@FindBy (id="phone_mobile")
	private WebElement mob;
	
	public WebElement getMobilenumber() {
		return mob;
	}
	
	@FindBy (id="alias")
	private WebElement alias;
	
	public WebElement getAliasAddress() {
		return alias;
	}
	
	@FindBy (id="submitAccount")
	private WebElement subAcc;
	
	public WebElement getSubmitAccount() {
		return subAcc;
	}
}