import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.deselectByVisibleText("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
		
//		WebElement staticDropdown2 = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
//		Thread.sleep(1000);
//		Select dropdown2 = new Select(staticDropdown2);
//		dropdown2.getFirstSelectedOption();
		
	}


}
