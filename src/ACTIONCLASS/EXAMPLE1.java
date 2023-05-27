package ACTIONCLASS;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
	public class EXAMPLE1 {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().window().maximize();
		//WebElement more= driver.findElement(By.xpath("(//div[@class='_28p97w'])[2]"));
		//Actions s1 = new Actions(driver);
		//s1.moveToElement(more).perform();
		//driver.findElement(By.xpath("")).click();
		WebElement mob = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		Actions act=new Actions(driver);
		act.click(mob).perform();
	}
	}


