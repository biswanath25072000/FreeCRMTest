package qa.test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest{
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
    LoginPageEvents loginPage = new LoginPageEvents();
	@Test
	public void sampleMethodForEnteringCredentials() {
		logger.info("Signing in Login Page");
		homePage.signInButton();
		logger.info("Verifying if the Login text is present or not");
		loginPage.verifyIfLoginPageIsLoaded();	
		logger.info("Entering the credentials");
		loginPage.enteringCredentials();
	}
}
