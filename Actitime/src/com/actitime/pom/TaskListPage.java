package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[.='Add New']")
	private WebElement Addnewbtn;

	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement Newcustopt;

	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement Entercustnametbx;

	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Enter Customer Description']")
	private WebElement Custdesctbx;

	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement Sltcust;

	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompanyTx;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcust;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement Atext;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[2]")
	private WebElement Setting;
	
	@FindBy(xpath="(//div[@class='actions']/div[1]/div[1])[1]")
	private WebElement Actions;
	
	@FindBy(xpath="(//div[@class='deleteButton' and @style])[1]")
	private WebElement deletebtn;
	
	@FindBy(xpath="(//span[.='Delete permanently'])[1]")
	private WebElement deleteconfirmbtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement Actdltdtext;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	public WebElement getSetting() {
		return Setting;
	}



	public WebElement getActions() {
		return Actions;
	}



	public WebElement getDeletebtn() {
		return deletebtn;
	}



	public WebElement getDeleteconfirmbtn() {
		return deleteconfirmbtn;
	}



	public WebElement getActdltdtext() {
		return Actdltdtext;
	}



	public WebElement getAddnewbtn() {
		return Addnewbtn;
	}

	public WebElement getNewcustopt() {
		return Newcustopt;
	}

	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}

	public WebElement getEntercustnametbx() {
		return Entercustnametbx;
	}

	public WebElement getCustdesctbx() {
		return Custdesctbx;
	}

	public WebElement getSltcust() {
		return Sltcust;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getAtext() {
		return Atext;
	}
}