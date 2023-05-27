package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
driver.get("https://leadsark.com/");
driver.findElement(By.xpath("//a[text()='GET INSTANT ACCESS NOW']")).click();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gopalpathade");




}
}
