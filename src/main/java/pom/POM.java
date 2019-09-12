package pom;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POM extends BasePage implements AutoConstant
{
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstNameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastNameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement emailIDTextfield;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement maleRadioButton;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement femaleRadioButton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement rememberMeCheckbox;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement countrycodeDropDownList;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobileNumberTextfield;
	
	@FindBy(xpath="//textarea")
	private WebElement addressTextarea;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement saveButton;
	
	public POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submitDetails() throws IOException
	{
		firstNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 0));
		lastNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 1));
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 2));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 3));
		emailIDTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 4));
		maleRadioButton.click();
		rememberMeCheckbox.click();
		selectbyvisibletext(countrycodeDropDownList, "+852");
		mobileNumberTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 5));
		addressTextarea.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 6));
		saveButton.click();		
	}
}