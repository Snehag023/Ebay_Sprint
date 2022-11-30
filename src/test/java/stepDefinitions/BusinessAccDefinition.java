package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BusinessAccDefinition {
WebDriver driver = null;
@Given("browser is Open")
public void browser_is_open() {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
@When("web application is displayd")
public void web_application_is_displayd() {
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}

@Then("Click on business Acount Radio button")
public void click_on_business_acount_radio_button() {
	driver.findElement(By.xpath("//a[text()='register']"))
	.click();
	driver.findElement(By.name("accountcreate"))
	.click();
}

@And("user drop Help message")
public void user_drop_help_message() {
	WebDriverWait wait=new WebDriverWait(driver,10);
	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ifhItem0"))));
	 driver.findElement(By.id("ifhItem0")).click();
	 
	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ifhOverlayClose"))));
	 driver.findElement(By.id("ifhOverlayClose")).click();
	
	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//img[@alt='Experiencing issues?']"))));
	 driver.findElement(By.xpath("//img[@alt='Experiencing issues?']")).click();
	 
	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ifhTextArea_0"))));
	 driver.findElement(By.id("ifhTextArea_0")).sendKeys("i am not able to register using business account");
	 
	 driver.findElement(By.id("ifhSurveySubmitBtn")).submit();
	
	 driver.navigate().back();
 		 driver.findElement(By.id("businessaccount-radio"))
		.click();
}

@And("user enter the Valid Businessname {string}")
public void user_enter_the_valid_businessname(String string) {
	driver.findElement(By.name("businessName")).sendKeys(string);
}

@And("user enter the Valid BusinessEmail {string}")
public void user_enter_the_valid_business_email(String string) {
	driver.findElement(By.id("businessEmail")).sendKeys(string);
}

@And("User enter the Valid Password  {string}")
public void user_enter_the_valid_password(String string) {
	driver.findElement(By.name("bizPassword")).sendKeys(string);
}

@And("user Select Valid Business Location")
public void user_select_valid_business_location() {
	WebElement dropDown=driver.findElement(By.tagName("select"));
	Select select=new Select(dropDown);
	 select.selectByVisibleText("India");
}

@Then("user Click on Register")
public void user_click_on_register() {
	 driver.findElement(By.name("BUSINESS_REG_FORM_SUBMIT")).submit();
}

@And("Browser Is Close")
public void browser_is_close() {
	driver.close();
}


}
