package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'_42ft ')]")).click();
		Thread.sleep(2000);
		 WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select g=new Select(month);
		// String text=g.getFirstSelectedOption().getText();
		 //System.out.println(text);
List<WebElement> alloptions=	g.getOptions();
int g1=alloptions.size();
System.out.println(g1);
for(WebElement al: alloptions) {System.out.println(al.getText());

	
}
	}

}
