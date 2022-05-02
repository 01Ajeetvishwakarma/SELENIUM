import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheTitleOfEachWindow {

	public static void main(String[] args) throws InterruptedException {

		// Open links in different tab.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // new driver limited to footer.

		// new driver for column1.
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		// Click on each link and check if they are working or not.
		int i;
		for (i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(4000L);

		} // Open all the tab in different tab.

		Set<String> Window = driver.getWindowHandles(); // get all the windows.
		Iterator<String> allWindow = Window.iterator(); // iterate windows.

		while (allWindow.hasNext()) {
			driver.switchTo().window(allWindow.next());
			System.out.println(driver.getTitle());
		}

	}

}
