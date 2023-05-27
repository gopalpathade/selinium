package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		act.click(month).perform();
		act.sendKeys(Keys.HOME).perform();
		for(int i=1;i<=5;i++) {
			act.sendKeys( Keys.ARROW_DOWN).perform();
		}
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
// text = driver.switchTo().alert().getText();
	//System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
