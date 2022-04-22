import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMultipleProductToCart {

	public static void main(String[] args) {
		// Invoke the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Walkingtree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		String[] vegetables = {"Brocolli","Cucumber","Beetroot"};
		int i;
		for(i=1;i<products.size();i++)
		{
			//formate the name of the vegetables
			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();
			
			//convert array into arrayList for easy search.
			//check wheather vegetables are present in  arrayList or not.
			List veges = Arrays.asList(vegetables);
			
			int j = 0;
			if (veges.contains(formatedName)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if (j==3) {		
					break;
				}
			}
		}
		
	}

}
