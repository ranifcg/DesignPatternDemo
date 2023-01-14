package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.AdactinAppLoginPage;
import pages.AdactinAppSearchPage;

public class SearchAdactinApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("http://adactinhotelapp.com");

		driver.manage().window().maximize();
		AdactinAppLoginPage adactlogin = new AdactinAppLoginPage(driver);
		adactlogin.enterUsername("raniselen");
		adactlogin.enterPassword("adactin");
		adactlogin.clickLogin();
		AdactinAppSearchPage adactsearch = new AdactinAppSearchPage(driver);
		adactsearch.enterSearchKeys("Sydney", "Hotel Sunshine", "Deluxe", "2", "15/01/2023", "17/01/2023", "2", "3");
		adactsearch.clickSearch();

	}

}
