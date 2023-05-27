package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example9 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.instagram.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[contains(@class,'_aa4b')]")).sendKeys("gopal");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
}
}
