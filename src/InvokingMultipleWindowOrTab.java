import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindowOrTab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentWindow = it.next();
		String childWindow = it.next(); 
		
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		String text = driver.findElement(By.xpath("//*[@id=\"courses-block\"]/div[5]/div/div[2]/div[1]/h2/a")).getText();
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.className("form-control")).sendKeys(text);
		
	}

}
