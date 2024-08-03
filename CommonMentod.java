package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonMentod {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void runBeforeMetod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("yopmail");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='yopmail'])[1]")).click();
	}
	
	@AfterMethod
	public void runAfterMethod() {
		driver.close();
	}
}
