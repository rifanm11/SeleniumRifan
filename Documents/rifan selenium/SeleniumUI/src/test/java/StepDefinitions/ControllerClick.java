package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;

public class ControllerClick {
	
	WebDriver driver;
	
	public ControllerClick (ShareClass shareClass){
		driver = shareClass.startBrowser();
	}
	

	@And("click menu with name \"(.*)\"$")
	public void click_by_name(String Menu) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[contains(text(), '" +Menu+"')]")).click();
		
		 
		Thread.sleep(2000);
	}
	
	@And("click menu with href \"(.*)\"$")
	public void click_href(String href) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[@href='" +href+ "']")).click();
		
		 
		Thread.sleep(2000);
	}
	
	@And("click button with value \"(.*)\"$")
	public void click_value(String value) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[@value='"+value+"']")).click();
		
		 
		Thread.sleep(2000);
	}

}
