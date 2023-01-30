
package Flipkartlogin;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class samplelogin {

WebDriver driver = null;
@Given("user is on sample login site")
public void user_is_on_sample_login_site() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabu G\\eclipse-workspace\\Automationtest\\src\\test\\resources\\drivers\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	driver.manage().window().maximize();

	//driver.navigate().to("");

	Thread.sleep(3000);
}

@And("user is on Login page")
public void user_is_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
    
	driver.navigate().to("https://example.testproject.io/web/");
	
	driver.getTitle();
}

@When("^user needs to enter (.*) and (.*)$")
public void user_needs_to_enter_username_and_password(String username,String password) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   
	driver.findElement(By.id("name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	
	Thread.sleep(3000);
}

@And("Click on Login page")
public void click_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
    
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/div[3]/button")).click();
}

@Then("user is navigated")
public void user_is_navigated() {
    
	WebElement text=driver.findElement(By.id("greetings"));
	
	text.getText();
	
	System.out.print("This page is succesfully logged in");
	
    
}
}

