package CaseStudy.CaseStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class pages {
	WebDriver driver;
	/*	By username = By.name("userName");
		By password = By.name("password");
		By loginbutton = By.name("login");*/

		public pages(WebDriver driver) {
			this.driver = driver;
		}

		public void do_login(String uid, String pass) {
			driver.findElement(By.name("userName")).sendKeys(uid);
			driver.findElement(By.name("password")).sendKeys(pass);
			driver.findElement(By.name("l041ogin")).click();

		}


}
