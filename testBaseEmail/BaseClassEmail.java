package testBaseEmail;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseClassEmail {
public ChromeDriver driver;

public Properties p;

	
	@BeforeClass
	public void setup() throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("/Users/kartikrawat/Library/Application Support/Google/Chrome/Profile 2");
		options.addArguments("profile-directory=test");
		options.addArguments("--start-maximized");
		FileReader file = new FileReader("./src//test//resources//config.property");
		p = new Properties();
		p.load(file);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		driver.get(p.getProperty("GmailLoginURL")); // Reading URL from Properties File
 		driver.manage().window().maximize();
 		


	}
	//@AfterClass
//	public void tearDown() {
	//	driver.quit();	
	//}

}
