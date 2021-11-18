package StepDefinitions;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import resources.base;



public class StepDefinitions extends base{
	@Given("login")
	public void login() throws IOException {
		driver =initializeDriver();
		String arg1="http://automationpractice.com/index.php";
		driver.get(arg1);
	}

	@When("given creditials")
	public void given_creditials() {
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("palacharlaramya000@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Ramya@550");
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println("It is clicked");
	    
	}

	@Then("able to login and close browser")
	public void able_to_login_and_close_browser() {
		String name=driver.findElement(By.xpath("//span[text()='ramya palacharla']")).getText();
		System.out.println(name);
		String name1="ramya palacharla";
		Assert.assertEquals(name1,name);
		driver.close();
	    
	}
	
	@Given("open website")
	public void open_website() throws IOException {
		driver =initializeDriver();
		String arg1="http://automationpractice.com/index.php";
		driver.get(arg1);
	}

	@When("click on best sellers")
	public void click_on_best_sellers() {
		driver.findElement(By.xpath("//*[text()='Best Sellers']")).click();
	}

	@Then("close")
	public void close() {
		
		driver.close();
	}




}


