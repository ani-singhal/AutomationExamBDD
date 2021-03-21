package page;


import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;




public class HwBddpage {

	WebDriver driver;

	public HwBddpage(WebDriver driver) {
		this.driver = driver;
	}

	//@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/span[1]/button[1]") WebElement SkyBlueBackButton;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]") WebElement SkyBlueBackButton;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]") WebElement WhiteBackgroundButton;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']") WebElement colorBlueConfirmation;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skywhite;']") WebElement WhiteButtonConfirmation;
	
//	public void validateURL1() {
//	//	String uurl=driver.getCurrentUrl();
//		System.out.println(driver.getCurrentUrl());
//	
//	}
	
	public void verifybackgroundblueButtonExist() {
		String blueButton = SkyBlueBackButton.getText();
		System.out.println("Verifying the button: " + blueButton);
		if (SkyBlueBackButton.isDisplayed()) {
			System.out.println("Set SkyBlue Background BUTTON EXISTS");
		}
		else {
			System.out.println("NOT There YET");
		}
}

	public void setbackgroundBlue() {
		SkyBlueBackButton.click();
	}
	public void colorBlueValidation() throws IOException {
		System.out.println(colorBlueConfirmation.getAttribute("style"));
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(colorBlueConfirmation.getAttribute("style"), "background-color: skyblue;");	
	}
	
	public void verifybackgroundWhiteButtonExist() {
		String whiteBut=WhiteBackgroundButton.getText();
		System.out.println("WHITE BUTTTON"+ whiteBut);
		if(WhiteBackgroundButton.isDisplayed()) {
			System.out.println("Set SkyBlue Background BUTTON EXISTS");
		}
		else {
			System.out.println("NOT There YET");
		}
	}
	
	public void setbackgroundWhite() {
		WhiteBackgroundButton.click();
	}
	public void colorwhitevalidation() {
		String white=WhiteButtonConfirmation.getText();
		System.out.println(white);
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(WhiteButtonConfirmation.getAttribute("style"), "background-color: white");	
	}

}
