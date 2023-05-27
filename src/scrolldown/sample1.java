package scrolldown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	((JavascriptExecutor)driver).executeScript("window.scrollBy.(0,350)");
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeAsyncScript("window.scrollBy(0.-100");
}
}
