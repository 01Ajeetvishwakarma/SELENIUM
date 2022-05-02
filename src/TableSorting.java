import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all webelement into list
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originaList = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		
		List<String> sortedList = originaList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originaList.equals(sortedList));
	}

}
