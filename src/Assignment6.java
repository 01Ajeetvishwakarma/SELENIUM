import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		String option =driver.findElement(By.xpath("//*[@id=\'checkbox-example\']/fieldset/label[1]")).getText();
		System.out.println(option);
		
		WebElement w = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(w);
		dropDown.selectByVisibleText(option);
		
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		
		String o =driver.switchTo().alert().getText();
		if(o.contains(option))
		{
			System.out.println("Alert message contain: "+option);
		}
		else {
			System.out.println("Something Went Wrong");
		}
		
	}

}
