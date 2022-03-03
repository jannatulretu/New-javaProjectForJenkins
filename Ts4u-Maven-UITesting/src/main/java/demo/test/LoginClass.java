package demo.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginClass extends TestBaseClass {
//	public static WebDriver driver;
//	
//	public static void main(String[] args) {
//		TestBaseClass.initializedDriver();
//		
//		WebElement emailField = driver.findElement(By.id("email"));
//		emailField.sendKeys("jannatulretu95@gmail.com");
//		//this is password
//		WebElement passwordField= driver.findElement(By.id("password"));
//		//click on the sign button
//		passwordField.sendKeys("AAdi17**@");
//		WebElement signInField= driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[2]/form/div[3]/button[2]"));
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		signInField.click();
//		
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.quit();
//		
	
	
	@BeforeClass
	public void setup() {
		initializeDriver();
	}
	
	@Test
	public void loginTest() {
//		//this is for email
				driver.findElement(By.id("email")).sendKeys("jannatulretu95@gmail.com");
				//this is password
				driver.findElement(By.id("password")).sendKeys("AAdi17**@");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[2]/form/div[3]/button[2]")).click();
				Actions act = new Actions(driver);
				//act.dragAndDrop(source, target);
	}

	@AfterClass
	public void tearDown() {
     driver.quit();
//		
	}
}
