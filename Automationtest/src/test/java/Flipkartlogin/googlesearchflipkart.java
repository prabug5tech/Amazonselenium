package Flipkartlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class googlesearchflipkart {
	
	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {
		
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabu G\\eclipse-workspace\\Automationtest\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		//In latest chrome driver no need to set property however it wont run in local so we have to set the options manually and give command line to run locally//
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		System.out.println("The browser is open");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}

	@And("user is on google page")
	public void user_is_on_google_page() {
		
		driver.navigate().to("https://www.google.com");
		System.out.println("User was in Google page");
	}

	@When("user enters flipkart in search bar")
	public void user_enters_flipkart_in_search_bar() {
		
		driver.findElement(By.className("gLFyf")).sendKeys("Flipkart");
		System.out.println("In search bar the text flipkart was entered");
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		
		
		
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		System.out.println("enter button is succesfully pressed");
		
		Thread.sleep(3000);
	}

	@Then("user needs to be navigated to the search results")
	public void user_needs_to_be_navigated_to_the_search_results() {
		
		driver.getPageSource().contains("Flipkart Offers & Deals of the Day");
		System.out.println("user was successfully navigated to the search results");
	}
}
