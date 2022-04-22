import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//Switch to iframe.
//		driver.switchTo().frame(0); //by index
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']"))); //by locator
		driver.findElement(By.id("draggable")).click();
		
		WebElement source = driver.findElement(By.id("draggable")); //from where to drag
		WebElement target = driver.findElement(By.id("droppable")); //     where to drop
				
		Actions action = new Actions(driver); 
		action.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();	//switch to default
		
	}

}
