package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("101");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	//get text from alertpopup
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	Thread.sleep(2000);
	Alert alt = driver.switchTo().alert();	
	System.out.println(alt.getText());
	//alt.dismiss();
	alt.accept();

	//alt.accept();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
