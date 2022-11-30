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

public class PersonalAccDefination1 {
WebDriver driver = null;
@Given("Browser Is Open")
public void browser_is_open() {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}

@When("Web Application is Displayed")
public void web_application_is_displayed() {
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@And("clicks on Register Option")
public void clicks_on_register_option() {
	driver.findElement(By.xpath("//a[text()='register']"))
	.click();
}

@And("user clicks on personal account radio Button")
public void user_clicks_on_personal_account_radio_button() {
	driver.findElement(By.name("accountcreate"))
	.click();
}

@And("user enter the valid firstname {string}")
public void user_enter_the_valid_firstname(String string) {
	driver.findElement(By.id("firstname"))
	.sendKeys(string);
}

@And("user enter the valid lastname {string}")
public void user_enter_the_valid_lastname(String string) {
	driver.findElement(By.name("lastname"))
	.sendKeys(string);
}

@And("user enter the valid email {string}")
public void user_enter_the_valid_email(String string) {
	driver.findElement(By.id("Email"))
	.sendKeys(string);

}

@And("user enter valid password {string}")
public void user_enter_valid_password(String string) {
	driver.findElement(By.id("password"))
	.sendKeys(string);
}

@Then("user click on Submit")
public void user_click_on_submit() {
	WebDriverWait wait=new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT"))));
    
	driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT"))
	.submit();
}

@And("browser should close")
public void browser_should_close() {
		driver.close();
}

}
