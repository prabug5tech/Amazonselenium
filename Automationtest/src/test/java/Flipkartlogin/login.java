package Flipkartlogin;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

public class login {

	WebDriver driver = null;
	@Given("user is on flipkart site")
	public void user_is_on_flipkart_site() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabu G\\eclipse-workspace\\Automationtest\\src\\test\\resources\\drivers\\chromedriver.exe");

		
		//In latest chrome driver no need to set property however it wont run in local so we have to set the options manually and give command line to run locally//
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.navigate().to("https://www.flipkart.com");

		Thread.sleep(3000);

		
		//Close Popup window
		
		
		
		//WebElement cross =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("._2KpZ6l._2doB4z")));
			//cross.click();
			
			Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ESCAPE); robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	
	@And("user needs to click login button")
	public void user_needs_to_click_login_button() throws InterruptedException {
		
		
		Thread.sleep(8000);
		driver.findElement(By.className("_1_3w1N")).click();

		System.out.println("Succesfully Login button clicked");

		Thread.sleep(3000);
	}

	@When("user needs to enter credentials")
	public void user_needs_to_enter_credentials() throws InterruptedException, AWTException {
		
		
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_8);
		robo.keyPress(KeyEvent.VK_7);
		robo.keyRelease(KeyEvent.VK_7);
		robo.keyPress(KeyEvent.VK_7);
		robo.keyPress(KeyEvent.VK_8);
		robo.keyPress(KeyEvent.VK_1);
		robo.keyPress(KeyEvent.VK_5);
		robo.keyRelease(KeyEvent.VK_5);
		robo.keyPress(KeyEvent.VK_5);
		robo.keyPress(KeyEvent.VK_6);
		robo.keyPress(KeyEvent.VK_9);
		robo.keyPress(KeyEvent.VK_1);
		
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		

		//driver.findElement(By.className("._2IX_2-.VJZDxU")).sendKeys("8778155691");
		Thread.sleep(2000);

		//driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("Prabu@123");
		//Thread.sleep(2000);

		System.out.println("Credentials entered successfully");
		
		//Clicking Send OTP
		
		//driver.findElement(By.xpath("//button[normalize-space()='Request OTP']")).click();
		
		//Entering OTP Manually
		
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Verify']")).click();
		
	}

	@And("user needs to click Login button again")
	public void user_needs_to_click_login_button_again() {

		//driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();

		System.out.println("Login successfully clicked again");


	}

	@Then("user needs to be logged in")
	public void user_needs_to_be_logged_in() {

		driver.findElement(By.className("exehdJ")).getText();

		System.out.println("Login success");
	}
}
