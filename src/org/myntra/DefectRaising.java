package org.myntra;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DefectRaising {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\NAREN\\eclipse-workspace\\SeleScreenShot\\driver\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("tshirt",Keys.ENTER);
		
		Thread.sleep(2000);
				
		WebElement USpolo = driver.findElement(By.id("p_89/U.S. POLO ASSN."));
		USpolo.click();
		Thread.sleep(3000);
		
		WebElement selectTshirt = driver.findElement(By.xpath("//div[@data-component-id='84']"));
		selectTshirt.click();
		
		String parentWindowId=driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			driver.switchTo().window(x);			
		}
		
		WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
		addToCart.click();
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	

}
