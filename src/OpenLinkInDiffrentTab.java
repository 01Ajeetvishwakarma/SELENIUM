import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInDiffrentTab {

	public static void main(String[] args) throws InterruptedException {
		// Open links in different tab.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Total link on the page:" + driver.findElements(By.tagName("a")).size());

		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // new driver limited to footer.
		System.out.println("Total link on the footer:" + footerDriver.findElements(By.tagName("a")).size());

		// new driver for column1.
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); 
		System.out.println("Total link on column1:" + columnDriver.findElements(By.tagName("a")).size());

		// Click on each link and check if they are working or not.
		int i;
		for(i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(2000L);
		}
	}

}
