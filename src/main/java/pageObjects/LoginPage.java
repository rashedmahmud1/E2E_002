package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	By email=By.xpath("//*[@id='user_email']");
	By password=By.xpath("//*[@id='user_password']");
	By Login=By.xpath("//*[@id='hero']/div/form/div[3]/input");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLogin() {
		return driver.findElement(Login);
	}

}
