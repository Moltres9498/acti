package com.actitime.genric;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void Openbrowser() {
		Reporter.log("openbrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void Closebrowser() {
		Reporter.log("closebrowser",true);
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login",true);
		FileLib f=new FileLib();
		String url = f.getpropertyData("URL");
		String un = f.getpropertyData("UN");
		String pw = f.getpropertyData("PW");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setlogin(un, pw);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setlogout();
	}
}