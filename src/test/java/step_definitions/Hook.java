package step_definitions;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Base;
//import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends Base{

	
		@Before
		public void setup() {
			
		ChromeOptions options=new ChromeOptions();	
		options.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(options);
		}
//		@After
//		public void tearDown() {
//			driver.close();
//		}
}
