package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AdactinAppLoginPage {
	
	WebDriver driver;
	public AdactinAppLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	//locator for user name
	By user_name = By.id("username");
	//locator for password
	By user_pwd = By.id("password");
	//locator for login button
	By login_btn = By.id("login");
	//method for entering user name
	public void enterUsername(String username)
	{
		driver.findElement(user_name).sendKeys(username);
		
	}
	
	//method for entering password
	public void enterPassword(String password)
	{
		driver.findElement(user_pwd).sendKeys(password);
	}

	//method for clicking login button
	public void clickLogin()
	{
		driver.findElement(login_btn).click();
	}
	
/*
 * driver.get("http://adactinhotelapp.com");

			driver.manage().window().maximize();
			WebElement uName = driver.findElement(By.id("username"));
			uName.sendKeys("raniselen");
			driver.findElement(By.id("password")).sendKeys("adactin");
 */
}
