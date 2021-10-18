package ebay.usa.automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {
	
	
	
	
	
	public static void main(String[] args) {
	
		
	String checkdriver = "chrome";
		
		
		if (checkdriver == "firefox") {
			
			System.setProperty("webdriver.geckodriver.driver", "./Driver/chromedriver.exe");
			WebDriver driver = new FirefoxDriver();
				
		}
		
		else if (checkdriver == "chrome") 	{	
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			driver.get("https://www.google.com/");
			
		}
		
		
		
	}

}




