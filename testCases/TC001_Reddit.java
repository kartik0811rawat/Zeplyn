package testCases;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RedditMainPage;
import testBase.BaseClass;

public class TC001_Reddit extends BaseClass{
	
	
	@Test
	public void test() throws InterruptedException {
		Actions act = new Actions(driver);
		RedditMainPage rmp = new RedditMainPage(driver);
		rmp.clickSubReddit();
		
		try {
	 		  for (int i = 0; i < 3; i++) {
	              ((org.openqa.selenium.JavascriptExecutor) driver)
	                      .executeScript("window.scrollTo(0, document.body.scrollHeight);");
	              Thread.sleep(2000);
	          }
	 		} catch(Exception e) {
	 			System.out.println("There are less than 40 posts in this subreddit.");
	 		}
		String mainTab = driver.getWindowHandle();

		List<WebElement> listPosts = rmp.getPostElements();
		Set<WebElement> setUniquePosts = new LinkedHashSet<>(listPosts);
        List<WebElement> listUniquePosts = new ArrayList<>(setUniquePosts);


		if (listUniquePosts.size() >= 45) {
	          for (int i = 39; i <= 44; i++) {
	        	  WebElement post=listUniquePosts.get(i);
	        	  
	        	  act.keyDown(Keys.COMMAND).click(post).keyUp(Keys.COMMAND).build().perform();
	        	  }
	              Thread.sleep(3000);
	            }
		
		Set<String>alltabs = driver.getWindowHandles();
		
		List<String> Alltitles = new ArrayList<>();
        List<String> allComments = new ArrayList<>();

		for(String currTab : alltabs) {
			if(currTab.equals(mainTab)){
				driver.switchTo().window(currTab);
            driver.close();
            
 		 }
			
			else {
				driver.switchTo().window(currTab);
				String title =  driver.getTitle();
				System.out.println("Title: " + title);
				Alltitles.add(title);
				
				try {
				String comment = rmp.getComments();
				System.out.println("Comment: " + comment);
                allComments.add(comment);
				} catch(Exception e) {
					String fallback = "Comment is not available for this post";	
	                System.out.println(fallback);
	                allComments.add(fallback);
					}
			}
			
		}
		if (Alltitles.size() == 6 && allComments.size()==6) {
			System.out.println("Test is pass");
		}
		else {
			System.out.println("Test is fail");
		}
		Assert.assertEquals(Alltitles.size(), 6,"Size is not 6");
		Assert.assertEquals(allComments.size(), 6,"Size is not 6" );

	}

}
