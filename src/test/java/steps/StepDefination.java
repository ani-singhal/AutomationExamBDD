package steps;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HwBddpage;
import util.Browserfactory;

public class StepDefination {
	WebDriver driver;
	HwBddpage Page;

	@Before
	public void launch() {
		driver = Browserfactory.init();
		Page = PageFactory.initElements(driver, HwBddpage.class);
	}

	@Given("^The user is at the given Website$")
	public void The_user_is_at_the_given_Website() {
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertTrue(actualUrl.contains("https://techfios.com/test/101"));
		//Assert.assertEquals("NOT on HomePage", "https://techfios.com/test/101", actualUrl);
		}

	@When("^Set SkyBlue Background button exists$")
	public void Set_SkyBlue_Background_button_exists() {
		Page.verifybackgroundblueButtonExist();
	}

	@When("^I click on the button$")
	public void I_click_on_the_button() {
		Page.setbackgroundBlue();

	}

	@Then("^The background color will change to sky blue$")
	public void The_background_color_will_change_to_sky_blue() throws IOException {
		Page.colorBlueValidation();
	}

	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists()  {
	  
	}
	
	@When("^I click on the SkyWhitebutton$")
	public void i_click_on_the_SkyWhitebutton() throws Throwable {
	   
	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white()  {
	   
	}
}
