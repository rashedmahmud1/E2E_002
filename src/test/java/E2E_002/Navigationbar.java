package E2E_002;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class Navigationbar extends Base {
	@Test
	public void basepageNavigation() throws IOException {
		driver = intializeDriver();
		driver.get(pro.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES123");
		l.getTitle().getText();

		driver.close();

	}

}
