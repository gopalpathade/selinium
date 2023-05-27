package autosuggessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("realme");
		List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e']/li)[1]"));
		String exptext="realme 10 pro";
		for(WebElement s1:alloptions) {
			String acttext = s1.getText();
			if(acttext.equals(exptext)) {
				s1.click();
				break;}
 
			
		}
	}}


