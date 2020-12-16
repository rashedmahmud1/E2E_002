package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	
	By signIn=By.xpath("//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a/span");
	By title=By.xpath("//*[@id='content']/div/div");
	By Navigationbar=By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		}

	public WebElement getsignIn() {
		return driver.findElement(signIn);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getNavigationbar() {
		return driver.findElement(Navigationbar);
	}

}
