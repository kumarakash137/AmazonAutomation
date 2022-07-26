package com.testcases;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pageobjects.Login;

public class Testcase extends Baseclass {
	@Test
	public void login() throws IOException {
		Logger.info("URL is opened");
		Login lp = new Login(driver);

		lp.setUsername(username);
		Logger.info("Entered username");
		lp.clickcontinue();

		if (username.equals("7409974567")) {
			Assert.assertTrue(true);
			Logger.info("Username is correct");
			Logger.info("Username Test Case Pass");
		} else {

			Assert.assertFalse(false);
			Logger.info("Incorrect username");
			Logger.info("Username Test Case failed");
			captureScreen(driver, "login");
		}

		lp.setpassword(password);
		Logger.info("Entered password");
		lp.clicksignInSubmit();
		

		if (password.equals("Akash@137")) {
			Assert.assertTrue(true);
			Logger.info("Password is correct");
			Logger.info("Password Test Case Pass");
		} else {
			Logger.info("Incorrect password");
			Logger.info("Password Test Case failed");
			captureScreen(driver,"login");
			Assert.assertTrue(false);
		}
	}
}