package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HostelworldTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Extracted Files\\Chrome75\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.hostelworld.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("home-search-keywords")).sendKeys("Krakow, Poland");
		Thread.sleep(2000); 
		driver.findElement(By.id("search-form")).click();
		Thread.sleep(2000);
		
		
		String actualResult = driver.getTitle(); 
		String expectedResult = "hostelworld";
		driver.close(); 
		
		if (actualResult.equalsIgnoreCase(expectedResult)) {
			System.out.println("Test Case Successful"); 
		}
		else {
			System.out.println("Test Case failed"); 
		}
		
	}

}
//<button type="submit" class="btn btn-primary btn-block mt-4 submit-search-form">Let's go!</button>