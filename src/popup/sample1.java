package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("100");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	Alert alt = driver.switchTo().alert();
	alt.accept();
	driver.switchTo().alert().getText();
}

}
