package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImdbPage extends BaseClass {
	@FindBy(xpath="//input[@id='suggestion-search']")
	WebElement input;
	@FindBy(xpath="//div[@class='sc-d2740ffb-1 duOqOv']/child::div[contains(text(),'Pushpa: The Rise - Part 1')]")
	WebElement drop;
	@FindBy(xpath="(//a[normalize-space()='India'])[1]")
	WebElement con;
	@FindBy(xpath="//a[text()='Release date']")
	WebElement link;
	@FindBy(xpath="//a[normalize-space()='India']/following::td[1]")
	WebElement date;
	
	public ImdbPage(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void imdbHome() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		input.sendKeys("Pushpa: The Rise");
		drop.click();
		
	}
	public String conuntry() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return con.getText();
	}
	public String date() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		link.click();
		return date.getText();
	}
}
