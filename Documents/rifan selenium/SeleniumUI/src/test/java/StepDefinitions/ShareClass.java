package StepDefinitions;

import java.time.Duration;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShareClass {
	
	WebDriver driver;
	
	@BeforeClass
	public WebDriver startBrowser(){
		
		System.out.println("I am inside browserSetup");
		WebDriverManager.chromedriver().setup();
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is : "+projectPath);
//		
//		System.setProperty("webdriver.chrome.driver", "Users/rifan.meldiana/Documents/rifan selenium/SeleniumUI/drivers/chromedriver");
//		
		if (driver == null) {
		driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));  
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));  
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	@After
	public void closeBrowser() {
		System.out.println(" I am inside Close Browser");
		driver.close();
		driver.quit();
		driver = null;
	}

}
