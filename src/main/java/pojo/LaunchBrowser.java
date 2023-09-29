package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static WebDriver openBrowser(String url) {
		
		System.setProperty("WebDriver.Chrome.driver","\"D:\\\\chromedriver-win64\\\\chromedriver.exe\");");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.navigate().to(url);
	    
	    return driver;
	
		}
	
}


