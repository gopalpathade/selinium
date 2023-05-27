
package installation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}

	
}
