package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.BaseClass;


public class DashboardPageElements extends BaseClass {
	/**
	 * --------------- BEGINNING OF Automation Challenge Dashboard Page ---------------
	 * 
	 */
	
	/** Dash board page addUser button */
	@FindBy(xpath="//button[@class='btn btn-link pull-right']")
	public WebElement addUserButton;
	
	/** Dash board page firstName Field */
	@FindBy(xpath="//input[@name='FirstName']")
	public WebElement firstNameField;
	
	/** Dash board page lastName Field */
	@FindBy(xpath="//input[@name='LastName']")
	public WebElement lastNameField;
	
	/** Dash board page userName Field */
	@FindBy(xpath="//input[@name='UserName']")
	public WebElement userNameField;
	
	/** Dash board page password Field */
	@FindBy(xpath="//input[@name='Password']")
	public WebElement passwordField;
	
	/** Dash board page radio buttons */
	@FindBy(xpath="//input[@name='optionsRadios']")
	public List<WebElement> radioButtons;
	
	/** Dash board page role options */
	@FindBy(xpath="//select[@name='RoleId']")
	public WebElement roleOptions;
	
	/** Dash board page Email Field */
	@FindBy(xpath="//input[@name='Email']")
	public WebElement emailField;
	
	/** Dash board page phone Field */
	@FindBy(xpath="//input[@name='Mobilephone']")
	public WebElement phoneField;
	
	/** Dash board page save button */
	@FindBy(xpath="//button[@class='btn btn-success']")
	public WebElement saveButton;
	
	/** Dash board page table elements */
	@FindBy(xpath="//table/tbody/tr/td")
	public List<WebElement> tableValues;
	
	/** Dash board page table rows */
	@FindBy(xpath="//table/tbody/tr")
	public List<WebElement> tableRows;
	
	/** Dash board delete users 'OK' button */
	@FindBy(xpath="//button[@class='btn ng-scope ng-binding btn-primary']")
	public WebElement okButton;
	
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}
}