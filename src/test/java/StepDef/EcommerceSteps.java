package StepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class EcommerceSteps {

	WebDriver driver;

	EcommercePage page;



	@Given("user opens TutorialsNinja website")
	public void openWebsite() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts()
		.implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://tutorialsninja.com/demo/");

		page = new EcommercePage(driver);
	}



	// ================= REGISTRATION =================

	@When("user registers with valid details")
	public void registerUser() {

		page.registerUser();
	}

	@Then("Registration Passed")
	public void registrationPassed() {

		System.out.println("Registration Passed");
	}



	// ================= LOGOUT AFTER REGISTRATION =================

	@When("user clicks logout after registration")
	public void logoutAfterRegistration() {

		page.logoutUser();
	}

	@Then("Logout After Registration Passed")
	public void logoutAfterRegistrationPassed() {

		System.out.println("Logout After Registration Passed");
	}



	// ================= LOGIN =================

	@When("user logs in with valid credentials")
	public void loginUser() {

		page.loginUser();
	}

	@Then("Login Passed")
	public void loginPassed() {

		System.out.println("Login Passed");
	}



	// ================= SEARCH =================

	@When("user searches for a product")
	public void searchProduct() {

		page.searchProduct();
	}

	@Then("Search Passed")
	public void searchPassed() {

		System.out.println("Search Passed");
	}



	// ================= ADD TO CART =================

	@When("user adds product to cart")
	public void addToCart() {

		page.addProductToCart();
	}

	@Then("Add To Cart Passed")
	public void addCartPassed() {

		System.out.println("Add To Cart Passed");
	}



	// ================= REMOVE CART =================

	@When("user removes product from cart")
	public void removeCart() {

		page.removeProductFromCart();
	}

	@Then("Remove Cart Passed")
	public void removeCartPassed() {

		System.out.println("Remove Cart Passed");
	}



	// ================= FINAL LOGOUT =================

	@When("user clicks logout")
	public void logoutUser() {

		page.logoutUser();
	}

	@Then("Logout Passed")
	public void logoutPassed() {

		System.out.println("Logout Passed");

		driver.quit();
	}
}