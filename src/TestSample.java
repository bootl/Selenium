import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSample {
	
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.getTitle();
		WebElement   email =driver.findElement(By.id("identifierId"));
		email.sendKeys("testjb022@gmail.com");
		Thread.sleep(5000);
		email.findElement(By.xpath("//*[@id='identifierNext']")).click();
		/* This code is not working 
		 * 
		 * Unable to find password id althoug its present in system
		 * 
		 * */
		//passwordNext
		//email.findElement(By.name("password")).sendKeys("nagaraju023");
		Thread.sleep(5000);
		email.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("nagaraju023");
		Thread.sleep(5000);
		email.findElement((By.xpath("//*[@id='passwordNext']"))).click();
		///email.findElement(By.xpath("//*[@id='password']")).sendKeys("nagaraju023);		
				
				
				
	    
	
	}
}