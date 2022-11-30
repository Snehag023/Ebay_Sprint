package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninWithFBDefination {
	WebDriver driver = null;
	@Given("Browser is Open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
    @When("web page is displayed")
	public void web_page_is_displayed() {
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@And("user clicks on Signin")
	public void user_clicks_on_signin() {
		WebDriverWait wait=new WebDriverWait(driver,10);
		//To Click On Signin Option
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Sign in']"))));
	    driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	    }

	@And("user click on cotinue with Facebook option")
	public void user_click_on_cotinue_with_facebook_option() {
		driver.findElement(By.xpath("//button[text()='Continue with Facebook']")).click();

	}

	@And("user Enter the valid Email {string}")
	public void user_enter_the_valid_email(String string) {
		driver.findElement(By.name("email")).sendKeys(string);
	}

	

	@And("user should click on continue")
	public void user_should_click_on_continue() {
	  System.out.println("");
	}

	@And("user enter the Valid Password {string}")
	public void user_enter_the_valid_password(String string) {
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(string);
	}
	@And("user click on login")
	public void user_click_on_login() {
		driver.findElement(By.id("loginbutton")).submit();
	}

	@Then("Browser is close")
	public void browser_is_close() {
	 driver.close();
	}


}
