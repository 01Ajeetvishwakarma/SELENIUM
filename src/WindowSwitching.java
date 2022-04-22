import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> Windows = driver.getWindowHandles();	//	[ParentId - ChildId]
	    Iterator<String> w = Windows.iterator();	
		String parentId = w.next();	//	[ParentId]
		String childId = w.next();	//	[ChildId]
	    		
		//Switch from parent to child
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("strong[style='display:inline-block']")).getText());
		
		//switch from child to parent
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys("ajit@gmail.com");
		
		
		
	}

}
