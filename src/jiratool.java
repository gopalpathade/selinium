import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jiratool {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testingproject3702.atlassian.net/jira/software/projects/BP/boards/1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gopalpathade143@gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	
	
	}

}
