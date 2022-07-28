package com.testcases;

import java.io.IOException;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.Atlassianlogin;
import com.pageobjects.Login;

public class Testcase extends Baseclass {
	@Test (priority = 1)
	public void login() throws IOException {
		driver.get(baseURL);
		Logger.info("Amazon Login URL is Opened");
		Login lp = new Login(driver);
		lp.setUsername(username);
		Logger.info("Amazon User Entered Username");
		lp.clickcontinue();
		if (username.equals("7409974567")) {
			Assert.assertTrue(true);
			Logger.info("Amazon Username is Correct");
			Logger.info("Amazon Username Test Case Pass");
		} else {

			Assert.assertFalse(false);
			Logger.info("Amazon Username is Incorrect");
			Logger.info("Amazon Username Test Case Failed");
			captureScreen(driver, "login");
		}

		lp.setpassword(password);
		
		Logger.info("Amazon User Entered Password");
		lp.clicksignInSubmit();
		

		if (password.equals("Akash@137")) {
			Assert.assertTrue(true);
			Logger.info("Amazon User Password is correct");
			Logger.info("Amazon User Password Test Case Pass");
		} else {
			Logger.info("Amazon User Password is Incorrect");
			Logger.info("Amazon User Password Test Case Failed");
			captureScreen(driver,"login");
			Assert.assertTrue(false);
		}
	}
	@Test (priority = 0)
	public void login1() throws IOException, InterruptedException {
		newdriver.get(atlassianURL);
		Logger.info("Atlassian Login URL is Opened");
		Atlassianlogin lc = new Atlassianlogin (newdriver);
		lc.setUsername(email);
		Logger.info("Atlassian User Entered Username");
		lc.clicknext();
		if (email.equals("akashku@leewayhertz.com")) {
			Assert.assertTrue(true);
			Logger.info("Atlassian Username is Correct");
			Logger.info("Atlassian Username Test Case Pass");
		} else {

			Assert.assertFalse(false);
			Logger.info("Atlassian User Incorrect Username");
			Logger.info("Atlassian Username Test Case failed");
			captureScreen(newdriver, "login1");
		}

		Thread.sleep(2000);
		lc.setPwd(pwd);
		
		Logger.info("Atlassian User Entered Password");
		lc.clicksignInSubmit();
		

		if (pwd.equals("leewayhertz@akash")) {
			Assert.assertTrue(true);
			Logger.info("Atlassian User Password is Correct");
			Logger.info("Atlassian Password Test Case Pass");
		} else {
			Logger.info("Atlassian User Incorrect Password");
			Logger.info("Atlassian Password Test Case Failed");
			captureScreen(newdriver,"login1");
			Assert.assertTrue(false);
		}
	}
	
	
}