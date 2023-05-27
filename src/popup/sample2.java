package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Set<String> allid = driver.getWindowHandles();
	ArrayList<String> al= new ArrayList<String>(allid);
	al.get(1);
	driver.switchTo().window(al.get(1));
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	driver.switchTo().window(al.get(0));
	
}
}
