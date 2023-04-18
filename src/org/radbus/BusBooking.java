package org.radbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BusBooking {
	
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\NAREN\\eclipse-workspace\\SeleScreenShot\\driver\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in");
		
		Thread.sleep(5000);
		
		WebElement fromCity = driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		fromCity.sendKeys("salem");
		
		WebElement toCity = driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
		toCity.sendKeys("bangalore");
		
		WebElement date = driver.findElement(By.xpath("//input[@data-caleng='21-Dec-2022']"));
		date.sendKeys("29-Dec-2022");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
