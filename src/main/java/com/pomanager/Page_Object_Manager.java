package com.pomanager;
import org.openqa.selenium.WebDriver;
import com.pom.Create_Account_Page;
import com.pom.Login_Page;
import com.pom.My_Store_Page;

public class Page_Object_Manager {

	private WebDriver driver;
	private Login_Page lp;
	private Create_Account_Page cap;
	private My_Store_Page sp;

	public Page_Object_Manager (WebDriver driver2)
	{
		this.driver = driver2;
	}
	
	public Login_Page getInstanceLp() {
		if (lp == null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}
	
	public Create_Account_Page getInstanceCap() {
		if (cap == null) {
			cap = new Create_Account_Page(driver);
		}
		return cap;
	}
	
	public My_Store_Page getInstanceSp() {
		if (sp == null) {
			sp = new My_Store_Page(driver);
		}
		return sp;
	}
}