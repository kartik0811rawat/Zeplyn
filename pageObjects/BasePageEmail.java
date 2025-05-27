package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageEmail {
	WebDriver driver;
	public BasePageEmail(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
