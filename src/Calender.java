import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		List<WebElement> dates = (List<WebElement>) driver.findElement(By.className(".day"));
		int count = driver.findElements(By.className(".day")).size();
		
		
		
		
	}

}
