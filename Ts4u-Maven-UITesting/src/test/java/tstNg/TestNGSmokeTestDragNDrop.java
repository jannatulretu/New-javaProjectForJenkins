package tstNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import demo.test.TestBaseClass;

public class TestNGSmokeTestDragNDrop extends TestBaseClass {
	
	
	@BeforeClass
	public void setup() {
		initializeDriver();
	}
	
	@Test
	public void loginTest() {
//		//this is for email
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jannatulretu95@gmail.com");
				//this is password
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("AAdi17**@");
				driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[2]/form/div[3]/button[2]")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				WebElement dragNdrop = driver.findElement(By.xpath("//a[@href = 'drag-and-drop']"));
				dragNdrop.click();
				Actions act = new Actions(driver);
				
				WebElement drag = driver.findElement(By.xpath("//div[@id = 'draggable']"));
				WebElement drop = driver.findElement(By.xpath("//div[@id = 'droppable']"));
				act.dragAndDrop(drag, drop).perform();
				
				
				
				
	}

	@AfterClass
	public void tearDown() {
//driver.close();
		
	}
	

}
