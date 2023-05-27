package autosuggessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saqmple2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	  // String title = driver.getTitle();
		//System.out.println(title);
	   // driver.close();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
List<WebElement> alloptions = driver.findElements(By.xpath("ul[@class='G43f7e']/li"));
		 String exptext="redmi note 12 pro";
		 for(WebElement s1:alloptions) {
			 String acttext = s1.getText();
			 if(acttext.equalsIgnoreCase(exptext)) {
				 s1.click();
				 break;
			 }
		 }
	}
	

}
