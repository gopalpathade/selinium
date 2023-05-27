package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sample3 {
public static void main(String[] args) throws IOException {
	WebDriver driver =new ChromeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
File SCR = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File desk=new File("C:\\\\Users\\\\samarth\\\\Desktop\\\\screenshot\\\\abc2.jpg");
FileHandler.copy(SCR, desk);
driver.quit();






}
}
