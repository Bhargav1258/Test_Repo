package StepDef;

import java.util.List;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EcommercePage {

	WebDriver driver;

	// Constructor
	public EcommercePage(WebDriver driver) {

		this.driver = driver;
	}



	// ================= LOCATORS =================

	By myAccount = By.linkText("My Account");

	By register = By.linkText("Register");

	By firstname = By.id("input-firstname");

	By lastname = By.id("input-lastname");

	By email = By.id("input-email");

	By telephone = By.id("input-telephone");

	By password = By.id("input-password");

	By confirmPassword = By.id("input-confirm");

	By privacyPolicy = By.name("agree");

	By continueButton =
			By.xpath("//input[@value='Continue']");

	By logout = By.linkText("Logout");

	By login = By.linkText("Login");

	By loginButton =
			By.xpath("//input[@value='Login']");

	By search = By.name("search");

	By searchButton =
			By.xpath("//button[@class='btn btn-default btn-lg']");

	By iphone = By.linkText("iPhone");

	By addCart = By.id("button-cart");

	By cart = By.id("cart-total");

	By removeButton =
			By.xpath("//button[@title='Remove']");



	// ================= REGISTRATION =================

	public void registerUser() {

		driver.findElement(myAccount).click();

		driver.findElement(register).click();

		driver.findElement(firstname)
		.sendKeys("Bhargav");

		driver.findElement(lastname)
		.sendKeys("Pavan");

		driver.findElement(email)
		.sendKeys("chim124@gmail.com");

		driver.findElement(telephone)
		.sendKeys("9876543210");

		driver.findElement(password)
		.sendKeys("Test@123");

		driver.findElement(confirmPassword)
		.sendKeys("Test@123");

		driver.findElement(privacyPolicy).click();

		driver.findElement(continueButton).click();
	}



	// ================= LOGOUT =================

	public void logoutUser() {

		driver.findElement(myAccount).click();

		driver.findElement(logout).click();
	}



	// ================= LOGIN =================

	public void loginUser() {

		driver.findElement(myAccount).click();

		driver.findElement(login).click();

		driver.findElement(email)
		.sendKeys("bhargav12345@gmail.com");

		driver.findElement(password)
		.sendKeys("Test@123");

		driver.findElement(loginButton).click();
	}



	// ================= SEARCH =================

	public void searchProduct() {

		driver.findElement(search)
		.sendKeys("iPhone");

		driver.findElement(searchButton).click();
	}



	// ================= ADD TO CART =================

	public void addProductToCart() {

		driver.findElement(iphone).click();

		driver.findElement(addCart).click();
	}



	// ================= REMOVE CART =================

	public void removeProductFromCart() {

	    WebDriverWait wait =
	            new WebDriverWait(driver,
	            Duration.ofSeconds(10));

	    wait.until(
	        ExpectedConditions.elementToBeClickable(cart));

	    driver.findElement(cart).click();

	    wait.until(
	        ExpectedConditions.elementToBeClickable(removeButton));

	    driver.findElement(removeButton).click();
	}


		// ================= LOGOUT =================

		public void logoutUser1() {

			driver.findElement(myAccount).click();

			driver.findElement(logout).click();
		}
	
	
}
