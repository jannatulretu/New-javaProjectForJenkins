package demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	
	public static WebDriver driver;
	

	public static void initializeDriver() {
		
	
		
		//System.setProperty("webdriver.chrome.driver", "/Users/jannatulfardusretu/Downloads/chromedriver2.1");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("http://67.207.83.190:8080/");
	}

}
