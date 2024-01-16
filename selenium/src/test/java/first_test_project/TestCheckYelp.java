package first_test_project;

import static first_test_project.Utils.input;
import static first_test_project.Utils.launchBrowser;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCheckYelp {

	WebDriver driver = launchBrowser("https://www.yelp.com/");

	@Test
	void testInputSearch() {
		By by = By.xpath("//input[@id='search_description']");
		input(driver, by, "restaurant");
		assertEquals(driver.getTitle(),"TOP 10 BEST Restaurant in San Francisco, CA - January 2024 - Yelp");
	}

}
