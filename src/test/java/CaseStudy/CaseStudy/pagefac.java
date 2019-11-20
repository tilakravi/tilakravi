package CaseStudy.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pagefac {
	WebDriver driver;
	/*	By username = By.name("userName");
		By password = By.name("password");
		By loginbutton = By.name("login");*/

		public pagefac(WebDriver driver) {
			this.driver = driver;
		}
		
		@FindBy(name="userName")
		@CacheLookup
		WebElement username;
		
		@FindBy(how = How.NAME, using = "password")
		@CacheLookup
		WebElement pass;
		
		@FindBy(name="login")
		@CacheLookup
		WebElement btn;

		public void login_new(String uid, String pwd) {
			username.sendKeys(uid);
			pass.sendKeys(pwd);
			btn.click();

		}



}
