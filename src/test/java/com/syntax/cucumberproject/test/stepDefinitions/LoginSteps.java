package com.syntax.cucumberproject.test.stepDefinitions;
	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class LoginSteps {
		
	    WebDriver driver;

	    @Given("^I open browser$")
	    public void i_open_browser() throws Throwable {
	        System.setProperty("webdriver.chrome.driver", "/Users/kilany/eclipse-workspace/cucumberProject/Drivers/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	        driver.manage().window().fullscreen();// for windows use .maximize
	    }

	    @Given("^I navigate to the FreeCrm$")
	    public void i_navigate_to_the_FreeCrm() throws Throwable {
	        driver.get("https://www.freecrm.com/index.html");
	    }
	    
	    @When("^I enter \"(.*)\" and \"(.*)\"$")
	    public void i_enter_and(String uName, String pwd) throws Throwable {
	    	 driver.findElement(By.name("username")).sendKeys(uName);
	    	 driver.findElement(By.name("password")).sendKeys(pwd);
	       
	    }


//	    @When("^I enter valid username and password$")
//	    public void i_enter_valid_username_and_password() throws Throwable {
//	        driver.findElement(By.name("username")).sendKeys("Kilany");
//	        driver.findElement(By.name("password")).sendKeys("Asmaa456");
	    
//	    }

	    @When("^I click login button$")
	    public void i_click_login_button() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@value='Login']")).click();
	    }

	    @Then("^I successfully logged in$")
	    public void i_successfully_logged_in() throws Throwable {
	        driver.switchTo().frame(1);
	        Thread.sleep(1000);
	        boolean homeElement = driver
	                .findElement(By.xpath("//a[@href='https://www.freecrm.com/system/index.cfm?action=home']"))
	                .isDisplayed();
	        Assert.assertTrue(homeElement);
	        System.out.println(homeElement + " home is displayed");
	    }
//
//	    @When("^I enter invalid username and password$")
//	    public void i_enter_invalid_username_and_password() throws Throwable {
//	        driver.findElement(By.name("username")).sendKeys("Hello");
//	        driver.findElement(By.name("password")).sendKeys("World");
//	    }
//	    
//	    @When("^I enter valid username and invalid password$")
//	    public void i_enter_valid_username_and_invalid_password() throws Throwable {
//	        driver.findElement(By.name("username")).sendKeys("Kilany");
//	        driver.findElement(By.name("password")).sendKeys("World");
//	    }
//	    
	    @Then("^I still see sign up link$")
	    public void i_still_see_sign_up_link() throws Throwable {
	        boolean signUp= driver.findElement(By.linkText("Sign Up")).isDisplayed();
	         Assert.assertTrue(signUp);
	    }
	    
	    @Then("^I close browser$")
	    public void i_close_browser() throws Throwable {
	        driver.quit();
	    }
	    @Given("^I navigtae to the FreeCrm$")
	    public void i_navigtae_to_the_FreeCrm() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	      
	    }

//	    @When("^I eneter invalid username and password$")
//	    public void i_eneter_invalid_username_and_password() throws Throwable {
//	    	
//	  
//	    }

	    @Then("^I close  browser$")
	    public void i_close_browser1() throws Throwable {
	       
	    }

	}

