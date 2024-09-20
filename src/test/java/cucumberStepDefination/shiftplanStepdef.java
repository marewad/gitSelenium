package cucumberStepDefination;

import data.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rahulshertyacademy.CargoPage;
import rahulshertyacademy.loginPage;
import rahulshertyacademy.shiftpaln;

public class shiftplanStepdef extends BaseTest{
	
	@Given("landed on UI pagee")
	public void landed_on_UI_page() throws InterruptedException  {
		
		initializeWebDriver();
		
	}
	
	@Given("logged in with username and passs")
    public void logged_in_with_username_and_pass() throws InterruptedException  {
		loginPage p= new loginPage(driver);
		p.loginTest("marewdny", "ko20la");
		
		
	}
	
	@When("select the shiftplan screen")
	public void select_the_shiftplan_screen() throws InterruptedException {
		shiftpaln s= new shiftpaln(driver);
	s.sendshiftplanValue();
	
	}
	
	@Then("search and add the values")
	public void search_and_add_the_values() throws InterruptedException {
		shiftpaln s= new shiftpaln(driver);
		s.creatDetails();
		s.createplan();
		s.rightclick();
	}

}
