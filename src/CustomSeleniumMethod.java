import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CustomSeleniumMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originaList = elements.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = originaList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originaList.equals(sortedList));

		List<String> price = elements.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceVeggie(s))
				.collect(Collectors.toList());

		price.forEach(a -> System.out.println(a));

	}

	private static String getPriceVeggie(WebElement s) {

		String priceValue = s.findElement(By.xpath("folling-sibling::td[1]")).getText();
		return priceValue;
	}

}
