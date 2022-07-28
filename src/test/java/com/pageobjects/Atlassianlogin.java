package com.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Atlassianlogin {

	WebDriver newdriver;


	public Atlassianlogin (WebDriver rdriver) {
		newdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "username")
	WebElement txtemail;

	@FindBy(id = "login-submit")
	WebElement btncontinue;

	@FindBy(id = "password")
	WebElement txtpassword;

	@FindBy(id = "login-submit")
	WebElement btnsignin;
	
	
	
	public void setUsername(String uname) {
		txtemail.sendKeys(uname);
	}

	public void clicknext() {
		btncontinue.click();
	}

	public void setPwd(String password) {
		txtpassword.sendKeys(password);
	}
	
	public void clicksignInSubmit() {
		btnsignin.click();
	}
//	
	
//	public void openTab() {
//		WebDriver newTab=ldriver.switchTo().newWindow(WindowType.WINDOW);
//		newTab.get("https://www.google.com/");
		
//	}

}
