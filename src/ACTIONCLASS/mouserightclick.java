package ACTIONCLASS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouserightclick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
//	WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
	//Actions s1=new Actions(driver);
	//s1.moveToElement(ele).perform();
//	s1.contextClick().perform();
	//s1.contextClick(ele).perform();
	WebElement dc = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act=new Actions(driver);
	act.doubleClick(dc).perform();
	Alert alt = driver.switchTo().alert();
	String text = alt.getText();	System.out.println(text);
	alt.accept();
	
	
	
}
}
