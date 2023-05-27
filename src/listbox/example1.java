package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 {
//single selectlist box
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@class,'_42ft ')]")).click();
		Thread.sleep(4000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		Select s=new Select(day);
		Thread.sleep(2000);
		s.selectByVisibleText("6");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		Select s1=new Select(month);
		Thread.sleep(2000);
		s1.selectByVisibleText("Aug");
		Thread.sleep(2000);
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		Thread.sleep(2000);
		s2.selectByVisibleText("1995");
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
