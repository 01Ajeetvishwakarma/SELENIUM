import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("hello");
		
		action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).doubleClick()
		.build().perform();

		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		// move mouse to the locator.
		action.moveToElement(move).build().perform();
		action.moveToElement(move).contextClick().build().perform();

	}

}
