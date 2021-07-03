package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--enable-automation");
		options.addArguments("test-type=browsers");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.thesparksfoundationsingapore.org/"); 
		 Thread.sleep(3000);
		 System.out.println("Successfully getting the Sparks Foundation Home Page");
		driver.manage().window().maximize();
		System.out.println("The chrome window is maximized");
		Thread.sleep(3000);
		 
		 //Test  case 01:GRIP Internship link
		driver.findElement(By.linkText("GRIP (Internship)")).click();
		 Thread.sleep(3000);
		System.out.println("Successfully get into grip internship page");
		
		//Test Case 02: Why Join us
		 driver.findElement(By.linkText("Why Join Us")).click();
		 Thread.sleep(3000);
		 System.out.println("Clicked the why join us button");
		 
		 //Test case 03:Automatic Enter of Email and name
		 driver.findElement(By.name("Name")).sendKeys("Subramanya K S");
		 Thread.sleep(3000);
		 System.out.println("automatically entered the name");
		 driver.findElement(By.name("Email")).sendKeys("subramanyaks22@gmail.com");
		 Thread.sleep(3000);
		 System.out.println("automatically entered the gmailid");
		 
		 //Test Case 04:Programs and move to Corporate Programs
		 driver.findElement(By.linkText("Programs")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Corporate Programs")).click();
		 Thread.sleep(3000);
		 System.out.println("Successfully visited the the Corporate Programs page of Programs.\\n");
		 
		//Test Case 05:moving to Links and move to Salient Features
		 driver.findElement(By.linkText("LINKS")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Salient Features")).click();
		 Thread.sleep(3000);
		 System.out.println("Successfully visited the the Salient Features page of Links.\\n");
		 
		 //Test Case 06:Move to Expert Mentor
		 driver.findElement(By.linkText("Expert Mentor")).click();
		 Thread.sleep(3000);
		 System.out.println("Successfully visited the Expert Mentor button");
		 
		//Test Case 07:Move to Expert Volunteer
		 driver.findElement(By.linkText("Events Volunteer")).click();
		 Thread.sleep(3000);
		 System.out.println("Successfully went the Expert Volunteer button");
		 
		//Test Case 08:Move to Management Volunteer
		 driver.findElement(By.linkText("Management Volunteer")).click();
		 Thread.sleep(3000);
		 System.out.println("Successfully went the Management Volunteer button");
		 
		 //test Case 09: move to resume writing
		 driver.findElement(By.linkText("Resume Writing")).click();
		 Thread.sleep(3000);
		 System.out.println("Successfully went the Resume Writing' button");
		 
		 
		//Test Case 10:Move to Contact us pages
		 driver.findElement(By.linkText("Contact Us")).click();
		 Thread.sleep(4000);
		 System.out.println("automatically clicked the contact us button");
		 //Test case 09: move to5 different pages
		 driver.findElement(By.linkText("Jobs at Tech in Asia Portal")).click();
		 Thread.sleep(6000);
		 System.out.println("Successfully get into the jobs at tech in asia portal");
		 driver.findElement(By.linkText("Jobs at Angel.co Portal")).click();
		 Thread.sleep(6000);
		 System.out.println("Successfully get into the jobs at tech in angel.co portal");
		 driver.findElement(By.linkText("Code for India")).click();
		 Thread.sleep(6000);
		 System.out.println("Successfully get into the jobs at tech in Code for India  Page");
		 driver.findElement(By.linkText("Internships at Internshala")).click();
		 Thread.sleep(6000);
		 System.out.println("Successfully get into the Internships at Internshala page");
		 driver.findElement(By.linkText("The Sparks Foundation (Global)")).click();
		 Thread.sleep(6000);
		 System.out.println("Successfully get into the Sparks Foundation global page");
		 
		 System.out.println("All the Test Cases runs sucessfully");
		 driver.close();
		 driver.quit();
	}

}