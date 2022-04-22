import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPassword {

	public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				String p = getPassword(driver);
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.findElement(By.id("inputUsername")).sendKeys("Ajeet");
				driver.findElement(By.name("inputPassword")).sendKeys(p);
				driver.findElement(By.className("signInBtn")).click();
//				driver.close();
				
			}
			
			private static String getPassword(WebDriver driver) throws InterruptedException {

				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.findElement(By.linkText("Forgot your password?")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
				String passwordText = driver.findElement(By.cssSelector("Form p")).getText();
//				Please use temporary password 'rahulshettyacademy' to Login.
				String[] passwordArray = passwordText.split("'");
//				passwordArray[0] -> Please use temporary password 
//				passwordArray[1] -> rahulshettyacademy' to Login.
				String[] password = passwordArray[1].split("'");
//				0th index -> rahulshettyacademy
//				1st index -> ' to Login.
				String pass = password[0];
				
				return pass;
				
			}
}
