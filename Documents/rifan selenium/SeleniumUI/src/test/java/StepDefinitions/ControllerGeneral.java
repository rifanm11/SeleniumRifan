package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ControllerGeneral {
	
	WebDriver driver;
	
	public ControllerGeneral (ShareClass shareClass){
		driver = shareClass.startBrowser();
	}

	@Given("browser window is open")
	public void browser_is_open() {
		
		System.out.println("Inside Step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
	}
	
	
	@And("^user navigate to url \"(.*)\"$")
	public void user_is_on_google_search_page(String url) throws Throwable {
		
		System.out.println("Inside Step - user is on goolge search page");
		
		driver.navigate().to(url);
		
	}

}
