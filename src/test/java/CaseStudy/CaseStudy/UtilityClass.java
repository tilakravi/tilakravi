package CaseStudy.CaseStudy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class UtilityClass {
	static WebDriver driver;
	public static WebDriver openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Training_C2a.04.30\\Desktop\\Vagupparai Paadangal\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Training_C2a.04.30\\Desktop\\Vagupparai Paadangal\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
			System.out.println("Invalid Browser !!");
		return driver;
	}
}
