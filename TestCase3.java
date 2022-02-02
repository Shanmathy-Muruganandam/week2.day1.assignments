package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*1. Launch URL "http://leaftaps.com/opentaps/control/login"	 
	 2. Enter UserName and Password 	  
	 3. Click on Login Button 
	 4. Click on CRM/SFA Link	
	 5. Click on Leads Button	 
	 6. Click on create Lead Button	  
	 7. Enter all the fields in CreateLead page
          **Note
               1. Donot work on Parent Account Field
               2.Enter the Birthdate using SendKeys
	 8. Enter all the fields in contact information   
	 9. Enter all the fields in primary address	 
	 10. Click on create Lead Button*/

public class TestCase3 {
	
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
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanmathy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muruganandam");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/15/1997");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("642004");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("04259");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shanmathymssv@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9943705432");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Baalaajee");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Durai");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Venkgades");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("11,Bagyalakshmi Villas");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("MG Rpad");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Bangalore");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("California");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("640795");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("14");
		driver.findElement(By.name("submitButton")).click();
		
	}

}
