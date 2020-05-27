package stepdfn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefnition {
	WebDriver driver;
	@Given("user navigate to browser")
	public void user_navigate_to_browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rakesh.ravilla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
	}

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("login page");
	}

	@When("user provides the correct credentials")
	public void user_provides_the_correct_credentials() {
		System.out.println("credentials");
	}

	@Then("user rendered to home page")
	public void user_rendered_to_TestMeApp_home_page() {
		System.out.println("home page");
		driver.close();
	}

}
