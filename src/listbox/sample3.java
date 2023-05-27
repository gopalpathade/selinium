package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		WebElement day = driver.findElement(By.xpath(""));
		Select s1=new Select(day);
		s1.selectByVisibleText("5");
		
		
		
		
		
		
	}
	
}
