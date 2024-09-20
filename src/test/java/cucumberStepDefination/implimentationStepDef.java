package cucumberStepDefination;

import org.testng.annotations.BeforeClass;

import data.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rahulshertyacademy.CargoPage;
import rahulshertyacademy.loginPage;
import rahulshertyacademy.shiftpaln;

public class implimentationStepDef extends BaseTest {
	
	
	private CargoPage c;
	
	//@BeforeClass
	@Given("landed on UI page")
	public void landed_on_UI_page() throws InterruptedException  {
		
		initializeWebDriver();
		c = new CargoPage(driver);
		
	}
	
	
	@Given("logged in with username and pass")
    public void logged_in_with_username_and_pass() throws InterruptedException  {
		loginPage p= new loginPage(driver);
		p.loginTest("marewdny", "ko20la");
		
		
	}
	
	@When("select the cargo screen")
	public void select_the_cargo_screen() throws InterruptedException  {
		
		CargoPage c= new CargoPage(driver);
		c.sendCargoValue();
		
		
		
	}
	
	@Then("click on add and create")
	public void click_on_add_and_create() throws InterruptedException {
		CargoPage c= new CargoPage(driver);
		c.newCargo();
	}

}
