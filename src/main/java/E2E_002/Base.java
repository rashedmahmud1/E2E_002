package E2E_002;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public Properties pro;
	
	public WebDriver intializeDriver() throws IOException {
		 pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\13477\\eclipse-workspace\\E2E_002\\src\\main\\java\\resourses\\data.properties");
		pro.load(fis);
		
		String browserName=pro.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
		
	}

}
