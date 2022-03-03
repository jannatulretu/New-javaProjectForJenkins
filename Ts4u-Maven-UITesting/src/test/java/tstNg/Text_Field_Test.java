package tstNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import demo.test.TestBaseClass;

public class Text_Field_Test extends TestBaseClass {

	@BeforeClass
	public void openBrowser() {
		TestBaseClass.initializeDriver();
	}
	
	@Test
	 public void textField() {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jannatulretu95@gmail.com");
		//this is password
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("AAdi17**@");
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[2]/form/div[3]/button[2]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		WebElement txtfld = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[14]/a"));
		txtfld.click();
		WebElement textarea = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		
		WebElement textarea2 = driver.findElement(By.xpath("//textarea[@id='textarea2']"));
		Actions act = new Actions(driver);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@AfterClass
	
	public  void logout() {
		driver.close();
		
	}

}
