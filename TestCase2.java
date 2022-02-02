package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Open the browser
Load the URL
Maximize the browser
Enter UserName
Enter Password
Click Login
Click CRM/SFA
Click Contacts Tab
Click Find Contacts
Click Email Tab
Type email as babu@testleaf.com
Click Find Contacts
Close the browser*/
public class TestCase2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUserName = driver.findElement(By.name("USERNAME"));
		elementUserName.sendKeys("Demosalesmanager");	
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Find Contacts")).click();
		driver.findElement(By.partialLinkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Contacts')]")).click();
		driver.close();
	}

}
