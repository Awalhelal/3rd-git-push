package ebay.usa.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fashion {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
	//driver.get("https:/www.ebay.com/");
	
	//driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")).click();
	
//	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")).click();
	
	//driver.findElement(By.xpath("//*[@title=\"My eBay\"]")).click();
	//driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
	
	//driver.findElement(By.xpath("//*[@href=\"https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F\"]")).click();
	
	
	//driver.findElement(By.linkText("Sign in")).click();
	
	//driver.findElement(By.xpath("(//*[@href=\"https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334\"])[2]")).click();
	//driver.findElement(By.xpath());
		
		driver.get("http://www.zoopla.com/");
		//driver.findElement(By.xpath("//*[@ href=\"#main-content\"]")).click();
		//driver.findElement(By.xpath("(//*[@href=\"/signin/?page_after_login=%2F&return_url=%2F\"])[2]")).click();
		//driver.findElement(By.xpath("//*[@ data-testid=\"header-profile-sign-in\"])[1]")).click();
		 // driver.findElement(By.xpath("(//*[@data-track-label=\"user account>sign in\"])[2]")).click();
		
		//driver.findElement(By.xpath("(//*[@href=\"/for-sale/\"])[6]")).click();
		//driver.findElement(By.xpath("(//*[@href=\"/signin/?page_after_login=%2F&return_url=%2F\"])[2]")).click();
// driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("shopnilawal99@gmail.com");
 //driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("@Nilpriyo99");
//driver.findElement(By.xpath("//*[@data-testid=\"signin-button\"]")).click();
		
//driver.getTitle();   To verify whether this page is home page or not
//System.out.println(driver.getTitle());   To verify whether this page is home page or not
		
		//driver.findElement(By.xpath("(//*[contains(@ href,('/find-agents/')])[1]")).click();    //It is a contains method but couldn't be resolved

		
		//driver.findElement(By.xpath("(//*[contains(@href, '/find-agents/')])[3]")).click(); //Contains method that works
		
		//driver.findElement(By.xpath("(//*[contains(@href,'/find-agents/')])[3]")).click();
	
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"landing-page\"]/div[2]/p[2]/a"))).click();
		
		
		//driver.findElement(By.xpath("//*[@id=\"\\__next\"]")).click();  //( Not clicking)
//		
//		driver.findElement(By.xpath("(//*[@class=\"css-4z982w-Text eczcs4p0\"])[9]")).click();
//		
//		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("awal.helal@gmail.com");
//		
//		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("Abdulhelal@27");
//		driver.findElement(By.xpath("(//*[@aria-live=\"polite\"])[1]")).click();
		
		
		//driver.findElement(By.linkText("Find agents")).click();    Using linkText
		
	//driver.findElement(By.xpath("//*[text()='Find agents']")).click(); //Using xPath text method
		
		driver.findElement(By.xpath("(//*[@id=\"__next\"]//descendant::p)[9]")).click();
		
		

		


		
		
		
		
	}

}
