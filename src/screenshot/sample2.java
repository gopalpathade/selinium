package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sample2 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(SS);
File desk=new File("C:\\\\Users\\\\samarth\\\\Desktop\\\\screenshot\\\\abc1.jpg");
FileHandler.copy(SS, desk);
	
}
}
