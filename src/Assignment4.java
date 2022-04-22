import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 	// Implicit wait.
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		
		Set<String> Windows = driver.getWindowHandles();
	    Iterator<String> w = Windows.iterator();	
		String parentId = w.next();	//	[ParentId]
		String childId = w.next();	//	[ChildId]
		
		driver.switchTo().window(childId);	//switch to child window
		System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
		
		driver.switchTo().window(parentId);	//switch to parent window
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")));
		
		
		
	}

}
