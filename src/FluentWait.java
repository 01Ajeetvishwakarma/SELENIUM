import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
//		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			       .withTimeout(Duration.ofSeconds(30L))
//			       .pollingEvery(Duration.ofSeconds(5L))
//			       .ignoring(NoSuchElementException.class);
		
		
		
		
	}

}