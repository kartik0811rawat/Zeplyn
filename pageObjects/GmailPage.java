package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GmailPage extends BasePageEmail{

	public GmailPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath ="//*[@id=\"root\"]/div[1]/header/div/div[5]/a[2]")
	WebElement signinBtn;
	
	@FindBy(xpath = "//*[@id=\"identifierId\"]")
	WebElement emailField;
	
	@FindBy(xpath="//*[@id=\"identifierNext\"]/div/button/span")
	WebElement emailNextBtn;
	
	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
	WebElement passField;
	
	@FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button/span")
	WebElement passNextBtn;
	
	@FindBy(xpath = "//*[@id=\"gs_lc50\"]/input[1]")
	WebElement emailSearchfld;
	
	@FindBy(xpath = "//*[@id=\"gs_sbt50\"]/tbody/tr[1]")
	WebElement emailSearchOpn;
	
	@FindBy(xpath = "//*[@id=\"gs_sbt50\"]/tbody/tr[1]")
	WebElement specEmail;
	
	@FindBy(xpath = "//*[@id=\":4z\"]")
	WebElement replyBtn;
	
	@FindBy(xpath = "//*[@id=\":ag\"]")
	WebElement Text;
	
	@FindBy(xpath = "//*[@id=\":8p\"]")
	WebElement sendBtn;
	
	public void clickSighInButton() {
		signinBtn.click();
	}
	
	public void inputEmail() {
		emailField.sendKeys("zeplyntest@gmail.com");
	}
	
	public void clickEmailNextBtn() {
		emailNextBtn.click();
	}
	
	public void inputpss() {
		passField.sendKeys("Zeplyn@123");
	}
	
	public void clickPassNextBtn() {
		passNextBtn.click();
	}
	
	public void inputsearcgfld() {
		emailSearchfld.sendKeys("Zeplyn");
	}
	
	public void clickSearchedopn(){
		emailSearchOpn.click();
	}
	
	public void clickSpecEmail() {
		specEmail.click();
	}
	
	public void clickReplyBtn(){
		replyBtn.click();
	}
	
	public void replyText() {
		Text.sendKeys("\"I accept the invitation to proceed to the next round");
	}
	
	public void sendBtnClick() {
		sendBtn.click();
		
	}

}
