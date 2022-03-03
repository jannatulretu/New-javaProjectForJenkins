package demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropeClass {
	
static WebDriver driver;

	public static void main(String[] args) {
		
		//By this webDriverManager we can set our driver version so no need to system.setproperty.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//go to the webPage
		driver.get("http://67.207.83.190:8080/");
		//this is for email
				WebElement emailField = driver.findElement(By.id("email"));
				emailField.sendKeys("jannatulretu95@gmail.com");
				//this is password
				WebElement passwordField= driver.findElement(By.id("password"));
				//click on the sign button
				passwordField.sendKeys("AAdi17**@");
				WebElement signInField= driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[2]/form/div[3]/button[2]"));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				signInField.click();
				
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.quit();
			}

	}


