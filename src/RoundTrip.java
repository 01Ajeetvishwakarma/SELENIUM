import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RoundTrip {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		driver.findElement(By.xpath("//div[@id=\'ctl00_mainContent_ddl_destinationStation1_CTNR\'] //a[@value='HYD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) 
		{
			System.out.println("Is Enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
}
