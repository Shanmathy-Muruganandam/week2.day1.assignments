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
Click Create Contact
Type First Name
Type Last Name
Click Create Contact Button
Print the first name and browser title 
Close the browser*/
public class TestCase1 {
	
	public static void main(String[] args) /*throws InterruptedException*/ {
		
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
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Shanmathy");
		driver.findElement(By.id("lastNameField")).sendKeys("Muruganandam");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Title is: \t"+driver.getTitle());
		/*String text=driver.findElement(By.id("firstNameField")).getText();
		System.out.println(text);
		/*Thread.sleep(5000);*/
		driver.close();
		
		
	}

}
