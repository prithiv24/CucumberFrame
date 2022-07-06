package StepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.loginLocatators.LoginPojo;
import org.logincommonfunctions.CommonFunction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BoohooLoginDefinitions extends CommonFunction {
	static LoginPojo p;
	@Given("User is on boohoo website")
	public void user_is_on_boohoo_website() {
		chromeBrowser();
		maximize();
		pageLoadOutTime();
		implicitlyWait();
		deleteAllCookies();
		enterUrl("https://www.boohoo.com/");
	}
	@Given("User has to accept or dismiss the popup")
	public void user_has_to_accept_or_dismiss_the_popup() {
		p=new LoginPojo();
		clickButton(p.getAcceptPopUp());
	}

	@When("User clicks on the login button account icon")
	public void user_clicks_on_the_login_button_account_icon() {
		p=new LoginPojo();
		clickButton(p.getClickAccount());
	}

@When("User has to enters the valid user and pass")
public void user_has_to_enters_the_valid_user_and_pass(io.cucumber.datatable.DataTable dataTable ) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	p=new LoginPojo();
	List<Object> asList = dataTable.asList(String.class);
	Object userName = asList.get(0);
	Object pass = asList.get(1);
	sendKeys(p.getEmail(), (String) userName);
	sendKeys(p.getPassword(),(String) pass);
	
	
	
    
}

	@When("User has to click on login button")
	public void user_has_to_click_on_login_button() {
		p=new LoginPojo();
		clickButton(p.getLogin());
	}

	@Then("User succesfully logged into the webpage")
	public void user_succesfully_logged_into_the_webpage() {
		String expected_Title="boohoo | Womens and Mens Clothes | Shop Online Fashion";
		String actual_Title=driver.getTitle();
		if (expected_Title.equals(actual_Title)) {
			Assert.assertTrue(true);
			
		}
		

	}



}
