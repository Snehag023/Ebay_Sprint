package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninDefinition {
	WebDriver driver = null;
	@Given("browser should Open")
	public void browser_should_open() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@When("Web Application is displayed")
	public void web_application_is_displayed() {
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	}

	@When("User Clicks on Signin option")
	public void user_clicks_on_signin_option() {
	driver.findElement(By.partialLinkText("Sign in")).click();
	}

	@Then("user Enter the Valid Email {string}")
	public void user_enter_the_valid_email(String string) {
	driver.findElement(By.id("userid")).sendKeys(string);
    
	}
	@And("user click on continue button")
	public void user_click_on_continue_button() {
		driver.findElement(By.name("signin-continue-btn")).click();
	}

	@And("user enter The Valid Password {string}")
	public void user_enter_the_valid_password(String string) {
		driver.findElement(By.id("pass")).sendKeys(string);

	}

	@And("user click on Signin")
	public void user_click_on_signin() {

		 driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("browser is closed")
	public void browser_is_closed() {
    driver.close();
	}


}
