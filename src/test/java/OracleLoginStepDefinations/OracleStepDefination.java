package OracleLoginStepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OracleStepDefination {
	public WebDriver driver;

	@Given("Initialize the chrome driver")
	public void initialize_the_chrome_driver() {
	    // Write code here that turns the phrase above into concrete actions
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	}

	@When("user navigates to {string}")
	public void user_navigates_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);
	}
	
	

	 @And("^user enters the (.+) and (.+) and clicks on login button$")
	    public void user_enters_the_and_and_clicks_on_login_button(String username, String password)  {	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	    
	}
	
	
	@Then("user should able to login")
	public void user_should_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Hello");
	}

	

}
