package pages;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdactinAppSearchPage {
	
	
	WebDriver driver;
	public AdactinAppSearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//locator for user name
	By location_combo = By.cssSelector("#location.search_combobox");
	//locator for password
	By hotels_combo = By.id("hotels");
	//locator for login button
	By room_type = By.cssSelector("select[name=room_type]");
	//method for entering user name
	By room_no = By.id("room_nos");
	By search_btn = By.id("Submit");
	By reset_btn = By.id("Reset");
	
	By date_checkin = By.id("datepick_in");
	By date_checkout = By.id("datepick_out");
	By adlt_no = By.id("adult_room");
	By child_no = By.id("child_room");
	
	public void enterSearchKeys(String location, String hotel, String roomtype, String roomno, String checkindate, String checkoutdate, String adultno, String childno )
	{
		new Select(driver.findElement(location_combo)).selectByValue(location);
		new Select(driver.findElement(hotels_combo)).selectByValue(hotel);
		 //Drop down - ROOMTYPE
	    new Select(driver.findElement(room_type)).selectByValue(roomtype);
	    new Select(driver.findElement(room_no)).selectByValue(roomno);
	    driver.findElement(date_checkin).clear();
	    driver.findElement(date_checkin).sendKeys(checkindate);
	    driver.findElement(date_checkout).clear();
	    driver.findElement(date_checkout).sendKeys(checkoutdate);
	    new Select(driver.findElement(adlt_no)).selectByValue(adultno);
	    new Select(driver.findElement(child_no)).selectByValue(childno);
	}
	public void clickSearch()
	{
	   	//click on Search
	    
		driver.findElement(search_btn).click();	    
	}
	
	public void clickReset()
	{
	    driver.findElement(reset_btn).click();
	    
	}
	
	
    

}
