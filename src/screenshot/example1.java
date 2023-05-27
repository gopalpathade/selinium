package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example1 {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	File SH = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(SH);
		File desk=new File("C:\\Users\\samarth\\Desktop\\screenshot\\abc.jpg");
		FileHandler.copy(SH, desk);
		
		
	}

}
