 package step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;


import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class Login_Functionality extends Base{

	@Given("I am in Daraz site")
	public void i_am_in_daraz_site() {
		driver.get("https://www.daraz.com.bd/");
		boolean result=driver.findElement(By.xpath("//div[@id='anonLogin']/a[@class='grey']")).isDisplayed();
		assertEquals(result, true);
	}
	@When("I click on My Account button")
	public void i_click_on_My_Account_button() {
		driver.findElement(By.xpath("//div[@id='anonLogin']/a[@class='grey']")).click();
	}

	@Then("I can see the login page")
	public void i_can_see_the_login_page() {
		boolean result=driver.findElement(By.xpath("//div[@class='login-title']/h3")).isDisplayed();
		System.out.println("Account login text is shown");
		assertEquals(result, true);
	}

	@And("I enter my {string} and {string}")
	public void i_enter_my_login_id_and_password(String loginId, String password) {
		driver.findElement(By.xpath("//div/input[@type='text']")).sendKeys(loginId);
		driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys(password); 
	}

	@And("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//div/button[@type='submit']")).click();
	}
	@Then("I click my home page name")
	public void i_can_see_my_home_page() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='topActionUserAccont']/span")).click();

	}
	@Then("I click logOut button")
	public void I_click_logOut_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='account-list']/li[6]/a")).click();
		
	}
	@Then("I can see the loginn page")
	public void I_can_see_the_login_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean result=driver.findElement(By.xpath("//div[@id='anonLogin']/a[@class='grey']")).isDisplayed();
		assertEquals(result, true);
	}
}
