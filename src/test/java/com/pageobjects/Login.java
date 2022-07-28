package com.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver ldriver;


	public Login(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "email")
	WebElement txtusername;

	@FindBy(id = "continue")
	WebElement btnsubmit;

	@FindBy(name = "password")
	WebElement txtPassword;

	@FindBy(id = "signInSubmit")
	WebElement btnsignin;
	
	
	
	public void setUsername(String uname) {
		txtusername.sendKeys(uname);
	}

	public void clickcontinue() {
		btnsubmit.click();
	}

	public void setpassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clicksignInSubmit() {
		btnsignin.click();
	}
	
	
//	public void openTab() {
//		WebDriver newTab=ldriver.switchTo().newWindow(WindowType.WINDOW);
//		newTab.get("https://www.google.com/");
		
//	}

}
