package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedditMainPage extends BasePage {

    public RedditMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"subgrid-container\"]/div[1]/div/search-dynamic-id-cache-controller/shreddit-gallery-carousel/faceplate-tracker[2]/faceplate-tracker/li/a/div")
    WebElement subReddit;

    @FindBy(xpath = "//a[@class='absolute inset-0' and @data-testid='post-title']")
    WebElement posts;

    @FindBy(xpath = "(//div[@class='md text-14 rounded-[8px] pb-2xs overflow-hidden'])[1]")
    WebElement comments;

    public void clickSubReddit() {
        subReddit.click();
    }

    public List<WebElement> getPostElements() {
        return driver.findElements(By.xpath("//a[@class='absolute inset-0' and @data-testid='post-title']"));
    }
    

    public void clickPost() {
        posts.click();
    }

    public String getComments() {
        try {
            return comments.getText();
        } catch (Exception e) {
            return "Comment is not available for this post";
        }
    }
}
