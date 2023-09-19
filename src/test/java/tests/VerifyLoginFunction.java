package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLoginFunction extends Base  {
/*
 * Given I am in Daraz site
 * When I click on login button
 * Then I can see the login page
 * And I enter my login id and password
 * And I click on login button
 * Then I can see my home page	
 */

	@Test(priority=1)
	public void Given_I_am_in_Daraz_site(){
		driver.get("https://www.daraz.com.bd/");
		boolean result=driver.findElement(By.xpath("//div[@id='anonLogin']/a[@class='grey']")).isDisplayed();
		Assert.assertEquals(result, true);

	}
	@Test(priority=2)
	public void when_I_click_on_login_button(){
		driver.findElement(By.xpath("//div[@id='anonLogin']/a[@class='grey']")).click();
	}
	@Test(priority=3)	
	public void then_I_can_see_the_login_page() {

		boolean result=driver.findElement(By.xpath("//div[@class='login-title']/h3")).isDisplayed();
		System.out.println("Account login text is shown");
		Assert.assertEquals(result, true);	
	}

	@Test(priority=4)
	public void and_I_enter_my_login_id_and_password() {
		driver.findElement(By.xpath("//div/input[@type='text']")).sendKeys("raihansarker2614@gmail.com");
		driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys("skr786skr");
	}
	
	@Test(priority=5)
	public void and_I_click_on_login_button() {
		driver.findElement(By.xpath("//div/button[@type='submit']")).click();
	}
	
	@Test(priority=6)
	public void then_I_can_see_my_home_page() {
		driver.findElement(By.xpath("//div/span[@id='myAccountTrigger']")).click();
		
	}
	/*
	@Before
	public void setup() {
		
	ChromeOptions options=new ChromeOptions();	
	options.setHeadless(false);
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver(options);
	}
	@After
	public void tearDown() {
		driver.close();
	}
	
@Test
	public void testLogin() {
	driver.get("https://www.daraz.com.bd/");
	driver.findElement(By.xpath("//div[@id='anonLogin']/a[@class='grey']")).click();
	driver.findElement(By.xpath("//div/input[@type='text']")).sendKeys("raihansarker2614@gmail.com");
	driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys("skr786skr");
	driver.findElement(By.xpath("//div/button[@type='submit']")).click();
	driver.findElement(By.xpath("//div[@id='topActionTrack']/span")).click();
	}	
	*/
}
	
//div/span[@id='myAccountTrigger']
	
		//driver.findElement(By.xpath("//div/input[@type='text']")).sendKeys(keysToSend);
	

