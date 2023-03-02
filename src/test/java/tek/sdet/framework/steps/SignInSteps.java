package tek.sdet.framework.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGenerator;

public class SignInSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	
	@When("User click on Sign in option")
	public void UserClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("user clicked on Sign in option");
		
	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passValue);
		logger.info("user entered email and password");
	}
	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
	}
	
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("user is logged in into Account");
	}
	
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
	   click(factory.signInPage().createNewAccountButton);
	   logger.info("User click on Create New Account button");
	  
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>>data = dataTable.asMaps(String.class,String.class);
		sendText(factory.signInPage().createNewAccountNameField,DataGenerator.getData(data.get(0).get("name")));
		sendText(factory.signInPage().createNewAccountEmailFIeld,DataGenerator.getData(data.get(0).get("email")));
		sendText(factory.signInPage().createNewAccountPasswordField,data.get(0).get("password"));
		sendText(factory.signInPage().createNewAccountConfirmPasswordField,data.get(0).get("confirmPassword"));
		logger.info("User fill the signUp information form");
		Thread.sleep(3000);
		
	 
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	    click(factory.signInPage().signUpButton);
	    logger.info("User click on signUp button");
	   
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillPresence(factory.accountPage().accountProfilepicture);
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(isElementDisplayed(factory.accountPage().accountProfilepicture));
	   logger.info("user is logged into account page");
	}	
}




