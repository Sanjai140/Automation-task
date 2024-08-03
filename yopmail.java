package task;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class yopmail extends CommonMentod{
@Test
	public  void runTest() throws InterruptedException {
		driver.findElement(By.xpath("//h3[text()=\"YOPmail - Disposable Email Address - Anonymous and temporary ...\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"ycptinput\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//i[@class=\"material-icons-outlined f36\"]")).click();
		driver.findElement(By.xpath("(//div[@class=\"wminboxheader\"]//button//i)[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Empty Inbox\"]")).click();
	
		Alert alert = driver.switchTo().alert();
        //System.out.println(alert.getText()); // Get the text of the alert
        alert.accept(); 

        
        String thisInboxIs = driver.findElement(By.xpath("//div[@id='messagectn']//div[1]")).getText();
        System.out.println(thisInboxIs);
        
   
        String text = driver.findElement(By.className("bname")).getText();
        System.out.println(text);
        if(text.contains("test@yopmail.com")) {
        	System.out.println("SUCCESS");
        }
        
	}

}
