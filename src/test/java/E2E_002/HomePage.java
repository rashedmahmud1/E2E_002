package E2E_002;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends Base {
	@Test(dataProvider="getData")
	public void basepageNavigation(String email,String password) throws IOException{
		driver=intializeDriver();
		driver.get(pro.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getsignIn().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
		driver.close();
		
	}
	@DataProvider
	public Object[][] getData() {
		Object[][]data=new Object[2][2];
		
		data[0][0]="abc@yahoo.com";
		data[0][1]="1234";
		
		data[1][0]="xyz@gmail.cpom";
		data[1][1]="5678";
		return data;
	}

}
